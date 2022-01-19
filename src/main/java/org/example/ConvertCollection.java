package org.example;

import java.util.Collection;
import java.util.List;

public class ConvertCollection {
    private List<ConvertMessage> records;
    private List<String> headers;

    public ConvertCollection(List<String> headers, List<ConvertMessage> records) {
        this.headers = headers;
        this.records = records;
    }

    public Collection<String> getHeaders() {
        return headers;
    }

    public Iterable<ConvertMessage> getRecords() {
        return records;
    }
}
