package config;

import application.action.*;

import java.util.HashMap;
import java.util.Map;

public class Config {
    public   static Map<Integer, Action> action = new HashMap<>();

    static {
        action.put(0,new StopApplicationAction());

        action.put(1,new ShowCityAction());
        action.put(2,new ShowTransportAction());

        action.put(3,new OrderAction());

        action.put(4, new UpdateCityAction());
        action.put(5, new RemoveCityAction());

        action.put(6, new UpdateTransportAction());
        action.put(7, new RemoveTransportAction());

        action.put(8,new AddCityAction());
        action.put(9,new AddTransportAction());




    }

}

