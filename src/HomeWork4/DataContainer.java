package HomeWork4;

import HomeWork2.Sort.Sort;

import java.util.Arrays;
import java.util.Comparator;


 public class DataContainer<T>  {
     private T item;
     private T[] data;

     public DataContainer(T[] data) {
         this.data = data;
     }

     /**
      * Метод,который добавляет данные во внутреннее поле data
      *
      * @param item данные, которые надо добавить
      * @return индекс позиции, на которую добавили элемент
      */
     public int add(T item) {
         for (int i = 0; i < data.length; i++) {
             if (item == null) {
                 return -1;
             } else if (data[i] == null) {
                 data[i] = item;
                 return i;
             }
         }
         this.item = item;
         return arraysCopyOf(this.data);
     }

     /**
      * Метод,который расширяет внутреннее поле data и добавляет в конец элемент
      *
      * @param data переданные данные
      * @return индекс позиции, на которую добавили элемент
      */
     private int arraysCopyOf(T[] data) {
         data = Arrays.copyOf(data, data.length + 1);
         data[data.length - 1] = item;
         this.data = data;
         return data.length - 1;
     }

     /**
      * Метод, который получает из DataContainer'а, из поля data, предварительно сохранённый объект который мы передали через метод add
      *
      * @param index индекс элемента, который хотим извлеч
      * @return элемент массива
      */
     public T get(int index) {
         if (index < data.length && Arrays.asList(data).contains(item)) {
             return item;
         }
         return null;
     }

     /**
      * Метод, который удаляет элемент по индексу
      *
      * @param index - индекс элемента
      * @return true - если метод сработал
      * false - если не сработал
      */

     public boolean delete(int index) {
         T[] arr1;
         T[] arr2;
         T[] arr3;
         if (index < data.length) {
             for (int i = 0; i < data.length; i++) {
                 if (index != i) {
                     continue;
                 } else if (i == 0) {
                     setData(Arrays.copyOfRange(data, i + 1, data.length));
                     break;
                 } else if (i == data.length - 1) {
                     setData(Arrays.copyOfRange(data, 0, data.length - 1));
                     break;
                 } else if (index == i) {
                     arr1 = Arrays.copyOfRange(data, 0, i);
                     arr2 = Arrays.copyOfRange(data, i + 1, data.length);
                     arr3 = Arrays.copyOf(arr1, arr1.length + arr2.length);
                     System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
                     setData(arr3);
                     break;
                 }
             }
             this.data = data;
             return true;
         } else {
             return false;
         }
     }

     /**
      * Метод, который удаляет элемент из поля data
      *
      * @param item элемент
      * @return true - если метод сработал
      * false - если не сработал
      */
     public boolean delete(T item) {
         return delete(Arrays.asList(data).indexOf(item));
     }


     public T getItem() {
         return item;
     }

     public void setItem(T item) {
         this.item = item;
     }

     public T[] getData() {
         return data;
     }

     public T[] getItems() {
         return data;
     }


     public void setData(T[] data) {
         this.data = data;
     }


     @Override
     public String toString() {
         return toString(getData());
     }

     /**
      * Метод, который создает строку на основании data, игнорируя null
      *
      * @param data переданные данные
      * @return строку
      */

     private String toString(T[] data) {
         StringBuilder sb = new StringBuilder();
         int k = 0;
         for (int i = 0; i < data.length; i++) {
             if (data[i] != null) {
                 if (k > 0)
                     sb.append(", ");
                 sb.append(data[i]);
                 k++;
             }
         }
         return sb.toString();
     }




     /**
      * сортировка данных, записанных в поле data при помощи ПЕРЕДАННОГО объекта comparator.
      * @param comparator
      */
     public void sort(Comparator <? super T> comparator){
         Sort.shakerSort(data,comparator);


     }

     public static <T extends Comparable<T>> void sort(DataContainer<T> container) {
         Sort.bubbleSorter(container.getItems(), true);
     }

     public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
         Sort.shakerSort(container.getItems(), comparator);
     }
 }