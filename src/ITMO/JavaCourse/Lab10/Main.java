package ITMO.JavaCourse.Lab10;

public class Main {
    public static void main(String[] args) {
        System.out.println(StreamsMethods.readStringsToList("src/ITMO/JavaCourse/Lab10/text.txt") + "\n");
        StreamsMethods.writeText("src/ITMO/JavaCourse/Lab10/text2.txt",
                "Запомните этот день, ведь именно он изменит вашу жизнь.");
        StreamsMethods.mergeFiles("src/ITMO/JavaCourse/Lab10/text.txt",
                "src/ITMO/JavaCourse/Lab10/text2.txt", "src/ITMO/JavaCourse/Lab10/mergedText.txt");
        StreamsMethods.editFile("src/ITMO/JavaCourse/Lab10/mergedText.txt");
    }
}
