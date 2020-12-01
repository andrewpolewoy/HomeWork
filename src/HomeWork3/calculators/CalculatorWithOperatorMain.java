package HomeWork3.calculators;

import HomeWork3.calculators.dto.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        double a = calc.addition(calc.addition(4.1, calc.multiplication(15, 7)),
                calc.exponentiation((calc.division(28, 5)), 2));
        System.out.println(a);
    }
}
// double a = 4.1 + 15 * 7 + (28 / 5) ^ 2
