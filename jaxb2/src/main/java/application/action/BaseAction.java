package application.action;
import application.utils.Input;
import controllers.*;
import entity.City;
import entity.Transport;

public  abstract class BaseAction  implements Action {
    protected CityControllers controllers = new CityControllers();
    protected TransportControllers transportControllers = new TransportControllers();
    protected OrderControllers orderControllers = new OrderControllers();

    protected City createCity() {

        int id = Input.getInt("Введите id");
        String name = Input.getString("Введите название города");
        Double  longitude = Input.getDouble("Введите долготу  города");
        Double latitude = Input.getDouble("Введите широту города");
        Boolean airport = Input.getBoolean("Есть ли в городе аэропорт? введите true/false");
        Boolean seaport = Input.getBoolean("Есть ли в городе аэропорт? введите true/false");

             return new City(id,name,longitude,latitude,airport,seaport);
    }

    protected Transport createTransport(){

        int id =Input.getInt("Введите id транспорта");
        String name = Input.getString("ВВедите название транспорта");
        int speed = Input.getInt("Введите  максимальную скорость ");
        int passengers = Input.getInt("Введите пассажировместимость");
        int tonnage = Input.getInt("введите грузоподъемность");
        String category = Input.getString("введите категорию(возмух,земля,вода)");
        int priceKm = Input.getInt("введите цену за км");

                return new Transport(id,name,speed,passengers,tonnage,category,priceKm);
    }
}