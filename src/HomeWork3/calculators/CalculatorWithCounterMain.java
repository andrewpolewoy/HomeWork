package HomeWork3.calculators;

import HomeWork3.calculators.dto.CalculatorWithCounter;
import HomeWork3.calculators.dto.CalculatorWithCounterInterface;
import HomeWork3.calculators.dto.CalculatorWithMathCopy;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter calc1 = new CalculatorWithCounter(new CalculatorWithMathCopy());
        double a = calc1.addition((calc1.addition(4.1, calc1.multiplication(15, 7))), calc1.exponentiation((calc1.division(28, 5)), 2));
        System.out.println(a);
    }
}
