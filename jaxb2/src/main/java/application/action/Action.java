package application.action;
import application.exception.StopApplicationException;

public interface Action {
    String getName();
    void action() throws StopApplicationException;
}
