package HomeWork3.calculators.dto;

public class CalculatorWithCounterInterface {

    private long counter;
    private  ICalculator calc;

    public CalculatorWithCounterInterface(ICalculator calc){
        this.calc = calc;
    }

    private void incrementCount(){
        this.counter++;
    }

    public double division(double a, double b) {
        this.incrementCount();
        return this.calc.division(a,b);
    }

    public double multiplication(double a, double b) {
        this.incrementCount();
        return this.calc.multiplication(a,b);
    }

    public double subtraction(double a, double b) {
        this.incrementCount();
        return this.calc.subtraction(a,b);
    }

    public double addition(double a, double b) {
        this.incrementCount();
        return this.calc.addition(a,b);
    }

    public double exponentiation(double a, double b) {
        this.incrementCount();
        return this.calc.exponentiation(a,b);
    }

    public double modul(double a) {
        this.incrementCount();
        return this.calc.modul(a);
    }

    public double square(double a) {
        this.incrementCount();
        return this.calc.square(a);
    }

    public long getCountOperation(){
        return counter;
    }

}
