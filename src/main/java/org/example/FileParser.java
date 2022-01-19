package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FileParser {
    public ConvertCollection read (String fileName) {
        List<String> headers = new ArrayList<>();
        List<ConvertMessage> records = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            headers = Arrays.asList(reader.readLine().split(","));
            while (reader.ready()) {
                String str = reader.readLine();
                List<String> values = Arrays.asList(str.split(","));
                Map<String,String> record = convertToMap(headers, values);
                records.add(new ConvertMessage(record));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return new ConvertCollection(headers, records);
    }

    private Map<String, String> convertToMap(List<String> headers, List<String> records) {
        return IntStream.range(0, headers.size()).boxed().collect(Collectors.toMap(headers::get, records::get));
    }
}
