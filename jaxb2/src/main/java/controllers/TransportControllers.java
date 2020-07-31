package controllers;
import dao.DBTransportDao;
import dao.TransportDao;
import entity.Transport;
import exceptions.RepeatTransportException;
import java.util.List;

public class TransportControllers {

    private TransportDao transportDao = new DBTransportDao();

    public void add(Transport transport) throws RepeatTransportException {
        transportDao.add(transport);
    }

    public List<Transport> get(){
        return transportDao.get();
    }

    public void remove(int id){

            transportDao.remove(new Transport(id));

    }

    public void update(Transport transport){
          transportDao.update(transport);
    }
}

