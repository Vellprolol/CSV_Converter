package org.example;

import java.io.OutputStream;
import java.io.PrintStream;

public class CsvConverter {

    public void convert(ConvertCollection collectionToConvert, OutputStream outputStream) {
        // TODO: implement
        Iterable<ConvertMessage> iterable = collectionToConvert.getRecords();
        PrintStream printStream = new PrintStream(outputStream);
        for (String str : collectionToConvert.getHeaders()) {
            printStream.println(str + ":");
            for (ConvertMessage value : iterable) {
                printStream.println(value.getElement(str));
            }
            System.out.println();
        }

    }
}
