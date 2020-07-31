package dao;
import connections.MySQLConnection;
import entity.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

    public class DBOrderDao  implements OrderDao {
        Scanner sc = new Scanner(System.in);
        private int RadiusEarth = 6371;
        private double S;

        String cityFirst;
        String citySecond;
        String category;
        int passengers;
        int tonnage;

        String name;
        int speed;
        int priceKm;
        List<Order> order = new ArrayList<>();
        double time;
        double price;

    public DBOrderDao() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DBOrderDao(String name, double time, double price) {
    }

    @Override
    public void count() {

        try (Connection connection = MySQLConnection.getConnection()) {
            System.out.println(" Введите город отправки : ");
            this.cityFirst = sc.nextLine();

            PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT * FROM cities WHERE name = ? ");
            preparedStatement1.setString(1, cityFirst);


            System.out.println(" Введите город доставки : ");
            this.citySecond = sc.nextLine();

            ResultSet resultSet1 = preparedStatement1.executeQuery();
            PreparedStatement preparedStatement2 = connection.prepareStatement("SELECT * FROM cities WHERE name = ? ");
            preparedStatement2.setString(1, citySecond);
            ResultSet resultSet2 = preparedStatement2.executeQuery();

            while (resultSet1.next() & resultSet2.next()) {

                double longitude1 = resultSet1.getDouble("longitude");
                double longitude2 = resultSet2.getDouble("longitude");
                double latitude1 = resultSet1.getDouble("latitude");
                double latitude2 = resultSet2.getDouble("latitude");

                boolean airport1 = resultSet1.getBoolean("airport");
                boolean airport2 = resultSet2.getBoolean("airport");
                boolean seaport1 = resultSet1.getBoolean("seaport");
                boolean seaport2 = resultSet2.getBoolean("seaport");

                double longitude1R = Math.toRadians(longitude1);
                double longitude2R = Math.toRadians(longitude2);
                double latitude1R = Math.toRadians(latitude1);
                double latitude2R = Math.toRadians(latitude2);

                double a = longitude1R - longitude2R;
                double b;
                double c;

                b = Math.sin(latitude1R) * Math.sin(latitude2R) + Math.cos(latitude1R) * Math.cos(latitude2R) * Math.cos(a);
                c = Math.acos(b);
                S = RadiusEarth * c;

                System.out.println("Расстояние  между городами равно " + S + " км.");

                System.out.println(" Введите количество пассажиров");
                this.passengers = sc.nextInt();

                System.out.println(" Введите количество груза в тоннах");
                this.tonnage = sc.nextInt();

                category = "Earth";
                cost();

                if (airport1 ==true & airport2 == true && seaport1 ==true & seaport2 ==true){
                        category = "Air";
                        cost();
                        category = "Sea";
                        cost();
                } else if ( airport1 ==true & airport2 == true && seaport1 ==true & seaport2 ==false || airport1 ==true & airport2 == true &&  seaport1 ==false & seaport2== false ||  airport1 ==true & airport2 == true && seaport1 ==false & seaport2 ==true){
                        category = "Air";
                        cost();
                }else  if( airport1 ==false && airport2 ==true || airport1 ==false & airport2== false || airport1 == true & airport2 ==false){
                    if(seaport1 ==true && seaport2 ==true){
                        category = "Sea";
                        cost();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void cost() {
        try (Connection connection = MySQLConnection.getConnection()) {

            PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT * FROM transport WHERE category = ? AND passengers >= ?   ");
            preparedStatement1.setString(1,category);
            preparedStatement1.setInt(2,passengers);
            ResultSet resultSet1 = preparedStatement1.executeQuery();

            PreparedStatement preparedStatement2 = connection.prepareStatement("SELECT * FROM transport WHERE category = ? AND tonnage  >= ?    ");
            preparedStatement2.setString(1,category);
            preparedStatement2.setInt(2, tonnage);
            ResultSet resultSet2 = preparedStatement2.executeQuery();

            List<DBOrderDao> list = new ArrayList<>();
                while (resultSet1.next() & resultSet2.next()) {
                    this.name = resultSet1.getString("name");
                    this.speed = resultSet2.getInt("speed");
                    this.priceKm = resultSet1.getInt("priceKm");

                    this.time = this.S / this.speed;
                    this.price = this.priceKm * this.S;

                    DBOrderDao dbOrderDao = new DBOrderDao(this.name,this.time,this.price);
                    dbOrderDao.setName(this.name);
                    dbOrderDao.setTime(this.time);
                    dbOrderDao.setPrice(this.price);
                    list.add(dbOrderDao);
                }

                Collections.sort(list,(o1,o2) ->{
                    double t = (double) (o1.getTime() - o2.getTime());
                    if(t==0){
                        double t1 = o1.getPrice() - o2.getPrice();
                        return (int) t1;
                    }else
                        return (int) t; });

                System.out.print("Cамый быстрый способ доставки " + passengers + " человек "+ " и груз весом " + tonnage +  " т " + " из " + cityFirst + " в " + citySecond + " - это " + name + " .");
                System.out.println( "Время в пути " + time +"." + "Стоимость путешествия " + price + "$" +  "." );

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}