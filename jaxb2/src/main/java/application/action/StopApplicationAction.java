package application.action;
import application.exception.StopApplicationException;

public class StopApplicationAction implements Action {
    @Override
    public String getName() {
        return "Выход из системы";
    }

    @Override

    public void action() throws StopApplicationException {
        throw new StopApplicationException();
    }
}