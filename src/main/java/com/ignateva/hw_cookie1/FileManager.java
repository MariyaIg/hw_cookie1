package com.ignateva.hw_cookie1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    public static ArrayList<Character> marks;

    public void ReadFile()
            throws IOException {

        String file = "C:\\Users\\Мария\\IdeaProjects\\hw_cookie1\\src\\main\\resources\\text.txt";

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();
        System.out.print(currentLine);
        reader.close();

    }

    public String ReadFile2() {

        String path = "C:\\Users\\Мария\\IdeaProjects\\hw_cookie1\\src\\main\\resources\\text.txt";
        StringBuilder text = new StringBuilder();
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                text.append(scanner.nextLine());
                text.append(" ");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return String.valueOf(text);

    }



    public List<String> getSeries (String text) {
        String allMarks = ",.:;-?!";
        List<String> series= new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            if (-1 == allMarks.indexOf(text.charAt(i))) continue;
            int startSeries = i;
                for (i++; i < text.length(); i++) {
                    if (-1 == allMarks.indexOf(text.charAt(i))) break;
                }
            if (i!=startSeries+1)
                    series.add(text.substring(startSeries, i));



        }
        return series;
    }

    public String MaxSeries(List<String> series)
    {
        String max= "";
        for (int i = 0; i < series.size()-1; i++) {
            if (series.get(i+1).length()>series.get(i).length())
                max = series.get(i+1);
        }
        return max;
    }

    public List<String> longestSequenceOfChar(String str) {
        String allMarks = ",.:;-?!";
        String interimresult = "";
        List<String> result = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {

                if (-1 != allMarks.indexOf(str.charAt(j))) {
                    interimresult += str.charAt(j);
                }
                result.add(interimresult);
                interimresult += "";
            }

        }
        return result;
    }
}