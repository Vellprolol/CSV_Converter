package org.example;

import java.util.Map;

public class ConvertMessage {
    private Map<String, String> values;
    public ConvertMessage(Map<String, String> values) {
        this.values = values;
    }

    public String getElement(String elementId) {
        return values.get(elementId);
    }
}
