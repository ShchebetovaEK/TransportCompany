package application.action;
import application.exception.StopApplicationException;
import entity.Transport;
import java.util.List;

public class ShowTransportAction extends BaseAction implements Action {
    @Override
    public String getName() {
        return "Показать список доступного транспорта";
    }

    @Override
    public void action() throws StopApplicationException {
        System.out.println("В вашем распоряжениии из транспорта есть...");
        List<Transport> transports = transportControllers.get();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for(Transport transport: transports ){
            System.out.println(transport);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
