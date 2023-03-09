package ITMO.JavaCourse.Lab05;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static String mostLongWord(String text) {
        System.out.println("Первое задание");
        System.out.println("Самое длинное слово в тексте:");
        String longWord = null;
        int length = 0;
        String[] words = text.split(" ");
        for (int i=0; i<=(words.length-1); i++) {
            words[i] = words[i].toLowerCase();
        }
        Arrays.sort(words);
        for (String word: words) {
            if (word.length() > length) {
                length = word.length();
                longWord = word;
            }
        }
        return longWord;
    }
    public static Boolean palindromeCheck(String word) {
        System.out.println("\n" + "Второе задание");
        System.out.println("Является ли слово полиндромом");
        StringBuilder origWord = new StringBuilder(word);
        StringBuilder revWord = new StringBuilder(word);
        return (origWord.toString().equals(revWord.reverse().toString()));
    }
    public static String textEdit(String text) {
        System.out.println("\n" + "Третье задание");
        String censorText = text.replaceAll("бяка", "[Вырезано цензурой]");
        return censorText;
    }
    public static Integer inputQuantity(String mainString, String subString) {
        System.out.println("\n" + "Четвёртое задание");
        System.out.println("Количество вхождений " + subString.toUpperCase() + " в тексте:");
        int quantity = 0;
        String[] text = mainString.split(" ");
        for (String item: text) {
            if (item.contains(subString.toLowerCase()) || item.contains(subString.toUpperCase())) {
                quantity++;
            }
        }
        return quantity;
    }
    public static String textInversion(String text) {
        System.out.println("\n" + "пятое задание");
        System.out.println("The given string is: " + text);
        System.out.println("The string reversed word by word is:");
        String[] words = text.split(" ");
        StringBuilder reversedText = new StringBuilder();
        for (String word: words) {
            StringBuilder reveredWord = new StringBuilder(word);
            reversedText.append(String.valueOf(reveredWord.reverse().append(" ")));
        }
        return String.valueOf(reversedText);
    }
}
