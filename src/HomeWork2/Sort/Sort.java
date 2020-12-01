package HomeWork2.Sort;


import HomeWork4.DataContainer;

import java.util.Comparator;

public class Sort {
//    /**
//     * Метод пузырьковой сортировки
//     * @param direction сортировка: true - по ыозрастанию, false - по убыванию
//     * @param array массив
//     * @return отсортированный массив
//     */
//    public static void BubbleSorter(int[] array, boolean direction) {
//        boolean swap = true;  // перемена для отслеживания перемены элементов местами
//        while (swap) {
//            swap = false;
//            for (int i = 0; i < array.length - i; i++) {
//                if (direction){
//                    if (array[i] > array[i + 1]) {
//                        swapElements(array, i);
//                        swap = true;
//                    }
//                }else {
//                    if (array[i] < array[i + 1]){
//                        swapElements(array,i);
//                        swap = true;
//                    }
//                }
//            }
//        }
//    }

    /**
     * Метод пузырьковой сортировки
     *
     * @param direction сортировка: true - по ыозрастанию, false - по убыванию
     * @param array     массив
     * @return отсортированный массив
     */
    public static void bubbleSorter(int[] array, boolean direction) {
        Integer[] arr = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        bubbleSorter(arr, direction);
    }

    /**
     * Метод для пузыроковой сортировки с помощью сортировки по умолчанию
     * @param array исходный массив для сортировки
     * @param direction сортировка: true - по возрастанию, false - по убыванию
     * @param <N> тип элементов массива
     */
    public static <N extends Comparable<N>> void bubbleSorter(N[] array, boolean direction){
        // Переменная для отслеживания была ли перемена местами элементов массива
        boolean isSwapped = true;
        while (isSwapped) {
            isSwapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i].compareTo(array[i + 1]) == 0) {
                    continue;
                } else {
                    if(direction) {
                        if(array[i].compareTo(array[i + 1]) > 0) {
                            swapElements(array, i);
                            isSwapped = true;
                        }
                    } else {
                        if(array[i].compareTo(array[i + 1]) < 0) {
                            swapElements(array, i);
                            isSwapped = true;
                        }
                    }
                }
            }
        }
    }

//    /**
//     * Метод шейкерной сортировки
//     * @param array массив для сортировки
//     * @return отсортированный массив
//     */
//    public static void ShakerSort(int[] array) {
//        int leftSide = 0;
//        int rightSide = array.length - 1;
//
//        do {
//            for (int i = leftSide; i < rightSide; i++) { // Сортировка влево ищем макс. значение
//                if (array[i] > array[i + 1]) {
//                    swapElements(array,i);
//                }
//            }
//            rightSide--;                // Уменьшаем количество проходов
//            for (int i = rightSide; i > leftSide; i--) { // Сортировка вправо ищем мин. значение
//                if (array[i] < array[i - 1]) {
//                    swapElements(array,i-1);
//                }
//            }
//            leftSide++; // Уменьшаем количество проходов т.к. мы шли с конца исходя из условий последнего for, что бы уменьшить кол-во проходов нужно инкрементировать счётчик
//        } while (leftSide < rightSide); // Априори наше условие при котором буду происходить проходки
//    }

    /**
     * Метод шейкерной сортировки
     * @param array массив для сортировки
     * @return отсортированный массив
     */
    public static void shakerSort(int[] array) {
        Integer[] arr = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        shakerSort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
    }

    /**
     * Метод для шейкерной сортировки с помощью сортировки по умолчанию
     * @param <N>    тип элементов массива
     * @param array исходный массив для сортировки
     */
    public static <N extends Comparable<N>> void shakerSort(N[] array) {
        // Переменная для отслеживания была ли перемена местами элементов массива
        boolean isSwapped = true;
        int leftIndex = 0;
        int rightIndex = array.length - 2;
        while (isSwapped) {
            isSwapped = false;
            for (int i = leftIndex; i <= rightIndex; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swapElements(array, i);
                    isSwapped = true;
                }
                if (array[i].compareTo(array[i + 1]) == 0) {
                    continue;
                }
            }
            leftIndex++;
            for (int j = rightIndex; j >= leftIndex; j--) {
                if (array[j].compareTo(array[j - 1]) < 0) {
                    swapElements(array, j - 1);
                    isSwapped = true;
                }
                if (array[j].compareTo(array[j + 1]) == 0) {
                    continue;
                }
            }
            rightIndex--;
        }
    }

    /**
     * Метод для шейкерной сортировки с помощью заданного компаратора
     * @param array исходный массив для сортировки
     * @param comparator компаратор для сравнения элементов массива
     * @param <N> тип элементов массива
     */
    public static <N> void shakerSort(N[] array, Comparator<? super N> comparator){
        // Переменная для отслеживания была ли перемена местами элементов массива
        boolean isSwapped = true;
        int leftIndex = 0;
        int rightIndex = array.length - 2;
        while (isSwapped) {
            isSwapped = false;
            for (int i = leftIndex; i <= rightIndex; i++) {
                if(comparator.compare(array[i], array[i + 1]) > 0) {
                    swapElements(array, i);
                    isSwapped = true;
                }
                if(comparator.compare(array[i], array[i + 1]) == 0) {
                    continue;
                }
            }
            leftIndex++;
            for (int j = rightIndex; j >= leftIndex; j--) {
                if(comparator.compare(array[j], array[j - 1]) < 0) {
                    swapElements(array, j - 1);
                    isSwapped = true;
                }
                if(comparator.compare(array[j], array[j - 1]) == 0) {
                    continue;
                }
            }
            rightIndex--;
        }
    }
//    /**
//     * Метод меняет местам i-й и (i + 1)-й элементы в исходном массиве arr
//     * @param arr исходный массив
//     * @param i индекс элемента
//     */
//    public static void swapElements(int[] arr, int i){
//        if(i >= 0 && i < arr.length - 1) {
//            int tmp = arr[i];
//            arr[i] = arr[i + 1];
//            arr[i + 1] = tmp;
//        } else {
//            System.out.println("Неверно задан индекс для элемента массива!");
//        }
//    }


    /**
     * Метод меняет местам i-й и (i + 1)-й элементы в исходном массиве arr
     *
     * @param arr исходный массив
     * @param i   индекс элемента
     */
    public static <N> void swapElements(N[] arr, int i) {
        if(i >= 0 && i < arr.length - 1) {
            N tmp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = tmp;
        } else {
            System.out.println("Неверно задан индекс для элемента массива!");
        }
    }
}
//Выполнить сортировку массива с числами:
//	4.0. !!!!ВНИМАНИЕ!!!! код сортировок в данном ДЗ не должен дублироваться.
//	Дублирование кода сортировок приведёт к провалу выполнения данного задания.
//	Итогом выполнения данного задания будет 1 класс сортировок, и классы с main методами.

//	4.1. После каждой сортировки в консоли у вас должно получиться "[Какой массив был до сортировки]
//	-> [Каким стал массив после сортировки]". Для вывода можно использовать Arrays.
//	4.2. Пишем следующие алгоритмы:
//		4.2.1. Пузырьковая сортировка
//		4.2.2. Шейкерная сортировка
//	4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
//		4.3.1. {1,2,3,4,5,6}
//		4.3.2. {1,1,1,1}
//		4.3.3. {9,1,5,99,9,9}
//		4.3.4. {}
//	4.4. После тестов написать код который будет создавать массив рандомной длинны, заполнять массив рандомными числами
//	4.5. После рандома написать код который будет создавать массив руками через консоль