package application.action;
import application.exception.StopApplicationException;
import entity.City;
import java.util.List;

public class ShowCityAction extends BaseAction implements Action {

    @Override
    public String getName() {
        return "Показать список городов";
    }

    @Override
    public void action() throws StopApplicationException {

        System.out.println("Мы можем доставить вашу посылку в один из этих городов ");
        List<City> cities = controllers.get();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for(City city: cities ){
            System.out.println(city);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
