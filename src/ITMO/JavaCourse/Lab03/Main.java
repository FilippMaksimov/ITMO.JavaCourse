package ITMO.JavaCourse.Lab03;

public class Main {
    public static void main(String[] args) {
        //Первое задание
        System.out.println("ПЕРВОЕ ЗАДАНИЕ");
        Study study = new Study();
        study.setCourse("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        //Второе задание
        System.out.println("\n" + "ВТОРОЕ ЗАДАНИЕ");
        Car bmw = new Car();
        bmw.setCarName("BMW X5");
        bmw.setColor("Grey");
        bmw.setWeight(3.5f);
        System.out.println(bmw.toString());

        Car ford = new Car();
        ford.setCarName("Ford Focus");
        ford.setColorAndWeight("Black", 1.3f);
        System.out.println(ford.toString());

        //Третье задание
        System.out.println("\n" + "ТРЕТЬЕ ЗАДАНИЕ");
        House skyscraper = new House();
        skyscraper.setValues("Небоскреб", 2018, 87);
        skyscraper.printData();

        House apart = new House();
        apart.setValues("Квартирный дом", 1958, 5);
        apart.printData();

        //Четвертое задание
        System.out.println("\n" + "ЧЕТВЕРТОЕ ЗАДАНИЕ");
        Tree empty = new Tree();
        empty.Tree();
        empty.printTree();

        Tree spruce = new Tree();
        spruce.Tree("Spruce", 80);
        spruce.printTree();

        Tree oak = new Tree();
        oak.Tree("Oak", 120, true);
        oak.printTree();

    }
}
