package application.action;
import application.exception.StopApplicationException;
import entity.Transport;
import exceptions.RepeatTransportException;

public class AddTransportAction extends BaseAction implements Action {
    @Override
    public String getName() {
        return "Добавить новый транспорт в список";
    }

    @Override
    public void action() throws StopApplicationException {
        Transport transport = createTransport();
        try{
            transportControllers.add(transport);
        } catch (RepeatTransportException e) {
            e.printStackTrace();
        }
    }
}
