package HomeWork3.calculators;
import HomeWork3.calculators.dto.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        double a = calc.addition((calc.addition(4.1, calc.multiplication(15, 7))), calc.exponentiation((calc.division(28, 5)), 2));
        System.out.println(a);

    }
}
