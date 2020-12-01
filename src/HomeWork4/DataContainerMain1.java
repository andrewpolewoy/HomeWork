package HomeWork4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataContainerMain1 {
    public static void main(String[] args) {
        Integer [] list = {null, 1, 2, 3, 777, 3};
        DataContainer <Object>  arr = new DataContainer<>(list);
        DataContainer<String> cont = new DataContainer<>(new String[0]);
        Object a = 3;
        System.out.println(arr);
        System.out.println(arr.delete(a));
        System.out.println(Arrays.toString(arr.getData()));
        System.out.println(arr.delete(1));

        System.out.println(Arrays.toString(arr.getData()));
        System.out.println(arr.get(arr.add(77)));


//        System.out.println(arr.add(999));
//        System.out.println(Arrays.toString(arr.getData()));



//        System.out.println(arr.add(9999));
//        System.out.println(arr.delete(3));
//        System.out.println(Arrays.toString(arr.getData()));


    }
}
