package application.action;
import application.exception.StopApplicationException;
import application.utils.Input;

public class RemoveCityAction extends BaseAction implements Action {
    @Override
    public String getName() {
        return "Удалить город из списка доставки";
    }

    @Override
    public void action() throws StopApplicationException {
        int id = Input.getInt("Введите номер id города, который нужно удалить: ");
        controllers.remove(id);
    }
}
