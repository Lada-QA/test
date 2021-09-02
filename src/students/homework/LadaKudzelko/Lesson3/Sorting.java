package students.homework.LadaKudzelko.Lesson3;

import java.util.Scanner;
import java.util.Arrays;
/** Bubble sorting method
 *  Enter n - size an array;
 *  Enter n element;
 *  Output the array in the form [element 0, element 1,...,element n];
 *  Sort the array in descending order with a bubble;
 *  Output the resulting array as [ element 0, element 1,...,element n]
 **/
public class Sorting {
    public static void main(String[] args) {
        int arraySize, keepBuffer;  // В итоге 2 переменные - размер массива, условный буффер обмена
//        int n, i, j, t;  // Названия переменных хреновые, так нельзя, нужно по названию понимать, для чего она.
        // Глобальную переменную для счетчика циклов делать не принято
        Scanner value = new Scanner(System.in);
        System.out.println("Enter massive size: ");
        arraySize = value.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            System.out.println("Enter element: " + i);
//            System.out.println("Enter element: " + array[i] + i); // А зачем тут array[i] выводить? оно же еще в любом
                                                                    // случае ноль
            array[i] = value.nextInt();
        }
        for (int i = 0; i < array.length; i++){
            System.out.println("Your base massive is " + Arrays.toString(array));

            for (i = 0; i < (arraySize - 1); i++) {
                for (int j = 0; j < arraySize - i - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        keepBuffer = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = keepBuffer;
                    }
                }
            }
//            for (i = 0; i < arraySize; i++); // Ты забыла удалить эту строчку?=)
            System.out.println("Sorted massive desc: "+ Arrays.toString(array));
        }
    }
}