package nl.whitehorses.webcenter.taskflows.view;

import java.util.HashMap;
import java.util.Map;

public class Events {
    public Events() {
        super();
    }

    public String fireEvents(String parameter) {
        System.out.println("fire event with parameter: " + parameter);
        return parameter;
    }

    public Map<String, Object> fireComplexEvent() {
        System.out.println("fire complex event ");
        Map<String, Object> eventData = new HashMap<String, Object>();
        eventData.put("text1", "hello");
        eventData.put("text2", "hello2");
        return eventData;
    }


    public String captureEvents(String parameter) {
        System.out.println("capture event with parameter: " + parameter);
        return parameter;
    }

    public String captureComplexEvents(Object parameter) {
        System.out.println("capture complex event");
        Map<String, Object> eventData = (Map<String, Object>)parameter;
        return (String)eventData.get("text1") + " / " +
            (String)eventData.get("text2");
    }

}
