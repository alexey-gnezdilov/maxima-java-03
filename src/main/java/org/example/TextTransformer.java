package org.example;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TextTransformer implements Transformable{
    @Override
    public void transform(String fileIn, String fileOut) {
        String[] values;
        CSVParser parser = new CSVParserBuilder().withSeparator(';').withIgnoreQuotations(true).build();

        try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(fileIn))
                .withSkipLines(1)
                .withCSVParser(parser)
                .build();
             PrintWriter printWriter = new PrintWriter(new FileWriter(fileOut))
        ){

            while ((values = csvReader.readNext()) != null) {
                if ("true".equals(values[2])) {
                    values[2] = "Сердитый";
                } else {
                    values[2] = "Дружелюбный";
                }
                printWriter.printf("%s кот %s %s кг.\n", values[2], values[0], values[1]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
