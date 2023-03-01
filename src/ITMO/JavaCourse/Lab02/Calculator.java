package ITMO.JavaCourse.Lab02;

public class Calculator {
    public static Long Calc(Integer firstSumValue, Long secondSumValue) {
        Long res = firstSumValue + secondSumValue;
        return res;
    }

    public static Double Calc(Double firstDevValue, Integer secondDevValue) {
        double res = firstDevValue / secondDevValue;
        return res;
    }

    public static Double Calc(Double firstMulValue, Long secondMulValue) {
        double res = firstMulValue * secondMulValue;
        return res;
    }

    public static Long Calc(Long firstSubValue, Integer secondSubValue) {
        long res = firstSubValue - secondSubValue;
        return res;
    }
}
