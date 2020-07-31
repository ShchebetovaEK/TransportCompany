package application.action;
import entity.City;

public class UpdateCityAction  extends  BaseAction implements Action {
    @Override
    public String getName() {
        return "Изменить список городов";
    }

    @Override
    public void action()  {
        System.out.println("update you cities....");
        System.out.println("wait...");
        System.out.println("programm loading....");
        City city = createCity();
        controllers.update(city);
    }
}
