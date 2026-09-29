import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("_________");
        System.out.println("Задача 1, инициализация:");
        int[] intArray = new int [3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        double[] doubleArray = {1.57, 7.654, 9.986};

        char[] charArray = new char[7];
        charArray[0] = 'T';
        charArray[1] = 'w';
        charArray[2] = 'o';
        charArray[3] = 'o';
        charArray[4] = 'c';
        charArray[5] = 'h';
        charArray[6] = 'a';

        System.out.println("_________");
        System.out.println("Задача 2, вывод массивов:");

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);

        System.out.println("_________");
        System.out.println("Задача 3, вывод массивов в обратном порядке:");

        printArrayReversed(intArray);
        printArrayReversed(doubleArray);
        printArrayReversed(charArray);

        System.out.println("_________");
        System.out.println("Задача 4, вывод массива после преобразования нечетных чисел в четные:");

        printArrayEven(intArray);
    }

    // вывод для первого массива
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // переход на новую строку
    }

    // вывод для второго массива
    private static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // вывод для третьего массива
    private static void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // вывод для первого массива в обратном порядке
    private static void printArrayReversed(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // вывод для второго массива в обратном порядке
    private static void printArrayReversed(double[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // вывод для третьего массива в обратном порядке
    private static void printArrayReversed(char[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // вывод для первого массива после преобразования нечетных чисел в четные
    private static void printArrayEven(int[] arr) {
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        for (int i = 0; i < arr.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i] += 1;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}