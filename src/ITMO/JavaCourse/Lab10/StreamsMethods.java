package ITMO.JavaCourse.Lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StreamsMethods {
    //First Task
    public static List<String> readStringsToList(String path) {
        List<String> listWithStrings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String input;
            while ((input = reader.readLine()) != null) {
                listWithStrings.add(input);
            }
        }
        catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return listWithStrings;
    }
    //Second Task
    public static void writeText(String path, String line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(line);
        }
        catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public static void mergeFiles(String firstInputPath, String secondInputPath, String outputPath) {
        List<String> firstFileList = readStringsToList(firstInputPath);
        List<String> secondFileList = readStringsToList(secondInputPath);
        StringBuilder builder = new StringBuilder();
        for (String input: firstFileList) {
            builder.append(input);
        }
        for (String input: secondFileList) {
            builder.append(input);
        }
        writeText(outputPath, builder.toString());
    }
    public static void editFile(String path) {
        List<String> fileList = readStringsToList(path);
        StringBuilder builder = new StringBuilder();
        String editedString;
        for (String input: fileList) {
            editedString = input.replaceAll("[^а-яА-Яa-zA-Z0-9]", "\\$");
            builder.append(editedString);
        }
        writeText(path, builder.toString());
    }
}
