package HomeWork2.Cycles;

public class Five {
    public static void main(String[] args) {
        int n = 1; // для второго множителя

        for (int i = 0; i < 10; i++) {
            if ((2 * n) < 10){
                System.out.print("2 x " + n + " =  " + (2 * n) + " | ");
            } else if (n == 10){
                System.out.print("2 x " + n + "= " + (2 * n) + " | ");
            } else{
                System.out.print("2 x " + n + " = " + (2 * n) + " | ");
            }

            if ((3 * n) < 10){
                System.out.print("3 x " + n + " =  " + (3 * n) + " | ");
            } else if (n == 10){
                System.out.print("3 x " + n + "= " + (3 * n) + " | ");
            } else{
                System.out.print("3 x " + n + " = " + (3 * n) + " | ");
            }

            if ((4 * n) < 10){
                System.out.print("4 x " + n + " =  " + (4 * n) + " | ");
            } else if (n == 10){
                System.out.print("4 x " + n + "= " + (4 * n) + " | ");
            } else{
                System.out.print("4 x " + n + " = " + (4 * n) + " | ");
            }

            if ((5 * n) < 10){
                System.out.println("5 x " + n + " =  " + (5 * n));
            } else if (n == 10){
                System.out.print("5 x " + n + "= " + (5 * n));
            }else{
                System.out.println("5 x " + n + " = " + (5 * n));
            }
            n++;
        }
        n = 1;    // после предидущего цикла n = 11, поэтому надо вернуть N к 1-це

        System.out.println("");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            if ((6 * n) < 10){
                System.out.print("6 x " + n + " =  " + (6 * n) + " | ");
            } else if (n == 10){
                System.out.print("6 x " + n + "= " + (6 * n) + " | ");
            } else{
                System.out.print("6 x " + n + " = " + (6 * n) + " | ");
            }

            if ((7 * n) < 10){
                System.out.print("7 x " + n + " =  " + (7 * n) + " | ");
            } else if (n == 10){
                System.out.print("7 x " + n + "= " + (7 * n) + " | ");
            } else{
                System.out.print("7 x " + n + " = " + (7 * n) + " | ");
            }

            if ((8 * n) < 10){
                System.out.print("8 x " + n + " =  " + (8 * n) + " | ");
            } else if (n == 10){
                System.out.print("8 x " + n + "= " + (8 * n) + " | ");
            } else{
                System.out.print("8 x " + n + " = " + (8 * n) + " | ");
            }

            if ((9 * n) < 10){
                System.out.println("9 x " + n + " =  " + (9 * n));
            } else if (n == 10){
                System.out.print("9 x " + n + "= " + (9 * n));
            }else{
                System.out.println("9 x " + n + " = " + (9 * n));
            }
            n++;
        }


    }
}

//Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке