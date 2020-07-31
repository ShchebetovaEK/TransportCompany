package dao;
import entity.City;
import exceptions.RepeatCityException;
import java.util.List;

public interface CityDao {

        void add(City city) throws RepeatCityException;
        List<City> get();
        void remove(City city);
        void update (City city);
}



