package application.action;
import entity.City;
import exceptions.RepeatCityException;

public class AddCityAction extends BaseAction implements Action {

    @Override
    public String getName() {
        return "Добавить новый город в список";
    }

    @Override
    public void action(){
        City city =  createCity();
        try {
            controllers.add(city);
        }catch (RepeatCityException e ){
            System.out.println(e.getMessage());
        }
    }
}
