package dao;

import connections.MySQLConnection;
import entity.Transport;
import exceptions.RepeatTransportException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBTransportDao  implements TransportDao{
    @Override
    public void add(Transport transport) throws RepeatTransportException {
        try (Connection connection = MySQLConnection.getConnection()){
            String sql = "INSERT INTO transport(name,speed,passengers,tonnage,category,priceKm) VALUES (?,?,?,?,?,?)";
            PreparedStatement statement  = connection.prepareStatement(sql);
            statement.setString(1,transport.getName());
            statement.setInt(2,transport.getSpeed());
            statement.setInt(3,transport.getPassengers());
            statement.setInt(4,transport.getTonnage());
            statement.setString(5,transport.getCategory());
            statement.setInt(6,transport.getPriсeKm());
            statement.execute();

                } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Transport> get() {
        List<Transport> transports = new ArrayList<>();
        try{
        Connection connection = MySQLConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM transport ");
        while (result.next()){
            Transport transport = new Transport();
            transport.setId(result.getInt("idtransport"));
            transport.setName(result.getString("name"));
            transport.setSpeed(result.getInt("speed"));
            transport.setPassengers(result.getInt("passengers"));
            transport.setTonnage(result.getInt("tonnage"));
            transport.setPriсeKm(result.getInt("priceKm"));
            transport.setCategory(result.getString("category"));
            transports.add(transport);
        }
    } catch (
    SQLException e) {
        e.printStackTrace();
    }
        return transports;
}
    @Override
    public void remove(Transport transport) {

    }

    @Override
    public void update(Transport transport) {

    }
}
