package application.action;
import application.exception.StopApplicationException;
import application.utils.Input;

public class RemoveTransportAction extends  BaseAction implements  Action{
    @Override
    public String getName() {
        return "Пора освободить гараж:)";
    }

    @Override
    public void action() throws StopApplicationException {
        int id = Input.getInt("Введите номер id транспорта, который нужно удалить: ");
        transportControllers.remove(id);
    }
}
