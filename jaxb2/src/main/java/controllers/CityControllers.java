package controllers;
import dao.CityDao;
import dao.DBCityDao;
import entity.City;
import exceptions.RepeatCityException;

import java.util.List;

public class CityControllers {
    private CityDao cityDao = new DBCityDao();

    public void add(City city) throws RepeatCityException {
        cityDao.add(city);
    }

    public  List<City> get(){
        return cityDao.get();
    }

    public void remove(int id){
        if (id %2 == 0) {
            cityDao.remove(new City(id));
        }
    }

    public void update(City city){
        cityDao.update(city);
    }


}
