package assignment8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WeatherReport {
    private final String path = "src/assignment8/weather.txt";
    private final List<Double> reportNumbers = new ArrayList<>();

    public void readFileBufferedReader(){
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null){
                double number = parseNumber(line);
                if (number != -1){
                    reportNumbers.add(Double.parseDouble(line));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFileScanner(){
        try {
            FileReader fr = new FileReader(path);
            Scanner scanner = new Scanner(fr);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (parseNumber(line) != -1){
                    reportNumbers.add(parseNumber(line));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public double getLowVal(){
        return this.reportNumbers.stream().
                mapToDouble(x -> x).
                min().
                orElse(0);
    }

    public double getHighVal(){
        return this.reportNumbers.stream().
                mapToDouble(x -> x).
                max().
                orElse(0);
    }

    public double getAvgTemp(){
        return this.reportNumbers.stream().
                mapToDouble(x -> x).
                average().
                orElse(0);
    }

    public double parseNumber(String input){
        double retVal = 0;
        try {
            retVal = Double.parseDouble(input);
            return retVal;
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
