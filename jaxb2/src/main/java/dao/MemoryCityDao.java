package dao;

import entity.City;
import exceptions.RepeatCityException;

import java.util.ArrayList;
import java.util.List;

public class MemoryCityDao implements CityDao {

    private List<City> cities = new ArrayList<>();
    private static MemoryCityDao instance;

    private MemoryCityDao() {
//        cities.add(new City(128,"Гродно",55.22,56.56,true,false));
    }

    public static MemoryCityDao getInstance() {
        if (instance == null) {
            instance = new MemoryCityDao();
        }
        return instance;
    }

    @Override
    public void add(City city) throws RepeatCityException {
        if (cities.contains(city)) {
            throw new RepeatCityException(city.getName());
        }
        cities.add(city);
    }


    @Override
    public List<City> get() {
        return new ArrayList<>(cities);
    }

    @Override
    public void remove(City city) {
        cities.remove(city);

    }

    @Override
    public void update(City city) {
        int index = cities.indexOf(city);
        if (index != -1) {
            cities.set(index, city);
        }
    }

}