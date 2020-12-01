package HomeWork3.calculators;
import HomeWork3.calculators.dto.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
        double a = calc.addition(calc.addition(4.1, calc.multiplication(15, 7)),
                calc.exponentiation((calc.division(28, 5)), 2));
        System.out.println(a);
    }
}
