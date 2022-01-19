package org.example;

public class Main {
    public static void main(String[] args) {
        FileParser fileParser = new FileParser();
        ConvertCollection convertCollection = fileParser.read("C:\\Users\\Alexey\\Documents\\Doc.txt");
        Iterable<ConvertMessage> iterable = convertCollection.getRecords();
        CsvConverter csvConverter = new CsvConverter();
        csvConverter.convert(convertCollection, System.out);
//        for (ConvertibleMessage message : iterable) {
//            System.out.println("element: " + message.getElement("FirstName"));
//        }
//        System.out.println(iterable);
//        System.out.println("headers: " + convertCollection.getHeaders());
//        System.out.println("records " + convertCollection.getRecords());

    }
}
