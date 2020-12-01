package HomeWork3.calculators.dto;

public class CalculatorWithCounter extends CalculatorWithMathExtends {
    private long counter;
    private final CalculatorWithOperator calc1;
    private final CalculatorWithMathCopy calc2;
    private final CalculatorWithMathExtends calc3;

    public CalculatorWithCounter(CalculatorWithOperator calc) {
        this.calc1 = calc;
        this.calc2 = null;
        this.calc3 = null;

    }

    public CalculatorWithCounter(CalculatorWithMathCopy calc) {
        this.calc1 = null;
        this.calc2 = calc;
        this.calc3 = null;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calc) {
        this.calc1 = null;
        this.calc2 = null;
        this.calc3 = calc;
    }

    private void incrementCount(){
        this.counter++;
    }

    public double division(double a, double b) {
        this.incrementCount();
        if (this.calc1 != null){
            return this.calc1.division(a,b);
        } else if(this.calc2 != null){
            return this.calc2.division(a,b);
        }
        return this.calc3.division(a,b);
    }

    public double multiplication(double a, double b) {
        this.incrementCount();
        if (this.calc1 != null){
            return this.calc1.multiplication(a,b);
        } else if(this.calc2 != null){
            return this.calc2.multiplication(a,b);
        }
        return this.calc3.multiplication(a,b);
    }

    public double subtraction(double a, double b) {
        this.incrementCount();
        if (this.calc1 != null){
            return this.calc1.subtraction(a,b);
        } else if(this.calc2 != null){
            return this.calc2.subtraction(a,b);
        }
        return this.calc3.subtraction(a,b);
    }

    public double addition(double a, double b) {
        this.incrementCount();
        if (this.calc1 != null){
            return this.calc1.addition(a,b);
        } else if(this.calc2 != null){
            return this.calc2.addition(a,b);
        }
        return this.calc3.addition(a,b);
    }

    public double exponentiation(double a, double b) {
        this.incrementCount();
        if (this.calc1 != null){
            return this.calc1.exponentiation(a,b);
        } else if(this.calc2 != null){
            return this.calc2.exponentiation(a,b);
        }
        return this.calc3.exponentiation(a,b);
    }

    public double modul(double a) {
        this.incrementCount();
        if (this.calc1 != null){
            return this.calc1.modul(a);
        } else if(this.calc2 != null){
            return this.calc2.modul(a);
        }
        return this.calc3.modul(a);
    }

    public double square(double a) {
        this.incrementCount();
        if (this.calc1 != null){
            return this.calc1.square(a);
        } else if(this.calc2 != null){
            return this.calc2.square(a);
        }
        return this.calc3.square(a);
    }

    public long getCountOperation(){
        return counter;
    }

}

