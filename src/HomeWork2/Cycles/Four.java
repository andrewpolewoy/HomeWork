package HomeWork2.Cycles;

public class Four {
    public static void main(String[] args) {
        long a = 1L;
        int b = 3;
        long c = a * b;
        long d = Long.MAX_VALUE;
        System.out.println(d);

        while (c < d){
            c = c * b;
            if (c * b >= d){
                System.out.println("До переполнения: " + c);
                System.out.println("После переполнения: " + c * b);
                break;
            }
        }
    }
}
//Long.MAX_VALUE