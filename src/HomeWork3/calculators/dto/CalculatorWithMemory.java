package HomeWork3.calculators.dto;

public class CalculatorWithMemory {

    private double memory;
    private double memory2;
//    private final CalculatorWithCounter calc;
//
//    public CalculatorWithMemory(CalculatorWithCounter calc) {
    private final CalculatorWithMathCopy calc;

    public CalculatorWithMemory(CalculatorWithMathCopy calc) {
        this.calc = calc;
    }

    public void writeMemoryResult() {
        this.memory2 = memory;
    }

    public double getMemoryResult() {
        return this.memory2;
    }

    public double division(double a, double b) {
        return memory = this.calc.division(a, b);
    }

    public double multiplication(double a, double b) {
        return memory = this.calc.multiplication(a, b);
    }

    public double subtraction(double a, double b) {
        return memory = this.calc.subtraction(a, b);
    }

    public double addition(double a, double b) {
        return memory = this.calc.addition(a, b);
    }

    public double exponentiation(double a, double b) {
        return memory = this.calc.exponentiation(a, b);
    }

    public double modul(double a) {
        return memory = this.calc.modul(a);
    }

    public double square(double a) {
        return memory = this.calc.square(a);
    }


}
