package dao;
import connections.MySQLConnection;
import entity.City;
import exceptions.RepeatCityException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBCityDao  implements CityDao {
    @Override
    public void add(City city) throws RepeatCityException {
        try (Connection connection = MySQLConnection.getConnection()) {
            String sql = "INSERT INTO cities (name, longitude, latitude, airport, seaport) VALUES (?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, city.getName());
            statement.setDouble(2, city.getLongitude());
            statement.setDouble(3, city.getLatitude());
            statement.setBoolean(4, city.isAirport());
            statement.setBoolean(5, city.isSeaport());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<City> get() {
        List<City> cities = new ArrayList<>();
        try {
            Connection connection = MySQLConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM cities ");
            while (result.next()) {
                City city = new City();
                city.setId(result.getInt("id"));
                city.setName(result.getString("name"));
                city.setLongitude(result.getDouble("longitude"));
                city.setLatitude(result.getDouble("latitude"));
                city.setAirport(result.getBoolean("airport"));
                city.setSeaport(result.getBoolean("seaport"));
                cities.add(city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cities;
    }

    @Override
    public void remove(City city) {

    }

    @Override
    public void update(City city) {

    }
}

