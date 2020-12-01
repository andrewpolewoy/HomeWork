package HomeWork3.calculators.dto;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    public double exponentiation(double a, double b){
        return Math.pow(a, b);
    }

    public double modul( double a){
        return Math.abs(a);
    }

    public double square (double a){
        return Math.sqrt(a);
    }
}

