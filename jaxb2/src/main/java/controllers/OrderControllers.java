package controllers;
import dao.DBOrderDao;
import dao.OrderDao;

public class OrderControllers {
    private OrderDao orderDao = new DBOrderDao();

    public  void count(){
        orderDao.count();
    }

}
