package ITMO.JavaCourse.Lab02;

public class Calculator {
    public static void getResult(Integer firstSumValue, Integer secondSumValue) {
        int res = firstSumValue + secondSumValue;
        System.out.println(res);
    }

    public static void getResult(Float firstDevValue, Float secondDevValue) {
        float res = firstDevValue / secondDevValue;
        System.out.println(res);
    }

    public static void getResult(Double firstMulValue, Double secondMulValue) {
        double res = firstMulValue * secondMulValue;
        System.out.println(res);
    }

    public static void getResult(Long firstSubValue, Long secondSubValue) {
        long res = firstSubValue - secondSubValue;
        System.out.println(res);
    }
}
