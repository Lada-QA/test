package students.homework.JuliaMokrous.Lesson3;

import java.util.Arrays;
import java.util.Scanner;
/*
  Задание с лекции 3.
  Создать программу, которая позволяет ввести с клавиа-туры массив размером n и отсортировать его по убыванию. Т.е.:
  1. Нужно считать с клавиатуры значение числа "n"(размер массива), используя метод makeMassiveUsingKeybord();
  2.1 Ввести значения, которые будут добавлены в массив (при размере массива, равном «n», необходимо ввести элементы массива «n» раз).
    Example: Выводит на экран строку типа:
    Enter element [номер элемента]: {Введенное с клавиа-туры целое число}
  2.2 Далее вывести массив, который мы создали, каждый элемент через запитую и пробел, используя метод {@link #printMassive()}.
    Example: 7, 23, 12, 0, 322
  3. Отсортировать базовый массив по убыванию сорти-ровкой Пузырька, используя метод {@link #sortMassiveByBubbleWay()}.
  4. Вывести отсортированный массив, используя метод {@link #printSortedDescMassive()}.
    Example: [322, 23, 12, 7, 0]
 */
public class JulieMokrous {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size:");
        int n = scanner.nextInt(); // плохое имя переменной, по имени нужно понимать для чего она (тут лучше arraySize)
        int[] array = new int[n];  // тоже самое, конкретизируй, что за массив
        int arrLength = array.length; // совсем не понял зачем... у тебя же есть "n"
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Enter element " + i + ":");
            array[i] = scanner.nextInt();
        }

        System.out.println("Entered elements of the array:");
        String comma = "";
        for (int j : array) {
            System.out.print(comma + j);
            comma = ", ";
        }

        System.out.println("");
        System.out.println("The array sorted in descending order:");

        for (int i = 0; i < arrLength; i++) {
            for (int k = i + 1; k < arrLength; k++) {
                if (array[i] < array[k]) {            //
                    array[i] = array[i] + array[k];   //Намудрила. Можно было, зная их индекс, просто array[i] поставить
                    array[k] = array[i] - array[k];   // на позицию k, а array[k] - на позицию i
                    array[i] = array[i] - array[k];   //
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}

