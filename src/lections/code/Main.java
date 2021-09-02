package lections.code;

import lections.code.Lesson4.SelectionSorter;


import static lections.code.Lesson4.MultyArray.*;
import static lections.code.Lesson4.SelectionSorter.printMultyArrayBeforeAndAfterSortingAndSort;
import static lections.code.Lesson4.SelectionSorter.printSortedMultyArrayСlearly;
import static lections.code.Lesson4.Utils.GlobalVariables.*;

public class Main {


    public static void main(String[] args) {

        System.out.println("Введите размерность массива NxM");
        // Вводим левый и правый размерности и инициализируем массив размеро NxM
        inputSizeAndInitializeMultyArray();
        // Заполняем массива случайными числами от 0 до 103
        fillEmptyMultyArray();
        // Выводим массив в консоль
        System.out.println("Массив размерностью " + LEFT_SIZE + "x" + RIGHT_SIZE);
        printMultyArrayUsingTwoLoops(EMPTY_STUDY_ARRAY);

        // Выводим элементы изначального массива
        System.out.println("// ИЗНАЧАЛЬНЫЙ МАССИВ");
        printArray(STUDY_ARRAY);
        System.out.println("፤፤——————————————————————————————————፤፤");

        //Сортируем по возрастанию методом прямого выбора.
        SelectionSorter.sort(STUDY_ARRAY);

        // Выводим элементы сортированного массива
        System.out.println("// СОРТИРОВАННЫЙ МАССИВ");
        printArray(STUDY_ARRAY);

        /* Выводим исходный многомерный массив;
         * Сортируем методом прямого выбора;
         * Выводим сортированный многомерный массив. */
        printMultyArrayBeforeAndAfterSortingAndSort(MULTY_STUDY_ARRAY);

        // Выводим более наглядно, что изменилось
        printSortedMultyArrayСlearly(BASIC_MULTY_STUDY_ARRAY);
    }

    public static void printArray(int[] array){
        // Выводим элементы массива
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            if (i != array.length - 1){
                System.out.print(STUDY_ARRAY[i] + ", ");
            } else {
                System.out.println(STUDY_ARRAY[array.length - 1] + "]");
            }
        }
    }
}
