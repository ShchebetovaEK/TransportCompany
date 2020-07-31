package application.action;
import application.exception.StopApplicationException;
import entity.Transport;

public class UpdateTransportAction  extends  BaseAction implements  Action{
    @Override
    public String getName() {
        return "Проапгрейдить транспорт";
    }

    @Override
    public void action() throws StopApplicationException {
        System.out.println("update you transport....");
        System.out.println("wait...");
        System.out.println("programm loading....");
        Transport transport = new Transport();
        transportControllers.update(transport);
    }
}
