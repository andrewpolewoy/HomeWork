package HomeWork3.calculators;

import HomeWork3.calculators.dto.*;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        CalculatorWithCounterDecorator calculator = new CalculatorWithCounterDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        print1(calculator);


    }

    public static void print1(ICalculator calculator){
        System.out.println(calculator.addition((calculator.addition(4.1, calculator.multiplication(15, 7))), calculator.exponentiation((calculator.division(28, 5)), 2)));
        if (calculator instanceof CalculatorWithCounterDecorator) {
            CalculatorWithCounterDecorator decorator = (CalculatorWithCounterDecorator) calculator;
            System.out.println(decorator.getCountOperation());
            System.out.println(decorator.getCalculator());
        }
    }
}