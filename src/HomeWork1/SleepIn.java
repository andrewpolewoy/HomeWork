package HomeWork1;

import java.util.Scanner;

public class SleepIn {

    public static void main(String[] args) {
        boolean answer = sleepIn(true,false);
        if (answer){
            System.out.println("Можем спать дальше");
        }else {
            System.out.println("Пора идти на работу");
        }
    }


    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation || !weekday){
            return true;
        }else{
            return false;
        }
    }
}

