package HomeWork3.calculators;

import HomeWork3.calculators.dto.CalculatorWithCounter;
import HomeWork3.calculators.dto.CalculatorWithMathCopy;
import HomeWork3.calculators.dto.CalculatorWithMemory;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());
//        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithCounter(new CalculatorWithMathCopy()));
        calc.addition((calc.addition(4.1, calc.multiplication(15, 7))), calc.exponentiation((calc.division(28, 5)), 2));
        calc.writeMemoryResult();
        System.out.println(calc.getMemoryResult());
    }
}
