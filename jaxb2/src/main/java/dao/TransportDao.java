package dao;
import entity.Transport;
import exceptions.RepeatTransportException;
import java.util.List;

public interface TransportDao {

    void add(Transport transport) throws RepeatTransportException;
    List<Transport> get();
    void remove(Transport transport);
    void update (Transport transport);
}
