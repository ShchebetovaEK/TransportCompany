package application;
import application.action.Action;
import application.exception.StopApplicationException;
import application.utils.Input;
import config.Config;

import java.util.Map;

public class ConsoleApllication {

    public void start() {
        System.out.println("Доброго времени суток!");
        running();
        System.out.println("До свидания, мой милый друг!");
    }

    private void running() {
        while (true) {
            Action action = getAction();
            try {
                action.action();
            } catch (StopApplicationException e) {
                break;
            }
        }
    }

    private Action getAction() {
        showMenu();
        int number = Input.getInt("Выберите действие");
        Action action = Config.action.get(number);
        if (action != null) {
            return action;
        }
        System.out.println("Нет такого действия.Попробуйте снова");
        return getAction();
    }

    private void showMenu() {
        for (Map.Entry<Integer, Action> action : Config.action.entrySet()) {
            System.out.println(action.getKey() + "-" + action.getValue().getName());
        }
    }

}