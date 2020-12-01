package HomeWork3.calculators.dto;

public class CalculatorWithMathCopy  implements ICalculator {

    public double division(double a, double b) {
        return a / b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double addition(double a, double b) {
        return a + b;
    }
    /**
     * Метод для возведения в степень
     * @param a число, которое возводят в степень
     * @param b степень
     * @return результат возведения в степень
     */
    public double exponentiation(double a, double b){
        return Math.pow(a, b);
    }

    /**
     * Метод для нахождения модуля числа
     * @param a число
     * @return модуль числа
     */
    public double modul( double a){
        return Math.abs(a);
    }

    /**
     * Метод для вычисления квадратного корня из числа
     * @param a число
     * @return корень числа
     */
    public double square (double a){
        return Math.sqrt(a);
    }
}
