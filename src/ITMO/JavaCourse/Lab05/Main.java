package ITMO.JavaCourse.Lab05;

public class Main {
    public static void main(String[] args) {
        String textOne = "Сегодня пасмурный и дождливый день";
        String textTwo = "Ученые сделали новые открытия в области вирусологии. Они пришли к выводу, " +
                "что новый вирус выживает при любых температурных условиях";
        System.out.println(Program.mostLongWord(textOne));
        System.out.println(Program.mostLongWord(textTwo));

        System.out.println(Program.palindromeCheck("топот"));
        System.out.println(Program.palindromeCheck("грохот"));

        String[] censorWords = new String[]{"бяка", "бяку", "бякой", "дурак"};
        String originText = "Вот ты бяка! Какой он дурак";
        System.out.println(Program.textEdit(originText, censorWords));

        System.out.println(Program.inputQuantity(textTwo, "новые"));
        System.out.println(Program.inputQuantity(textTwo, "вирус"));
        System.out.println(Program.inputQuantity(textTwo, "у"));

        String text = "This is a test string";
        System.out.println(Program.textInversion(text));
    }
}
