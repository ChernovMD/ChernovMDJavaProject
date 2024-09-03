package ru.mirea.chernov;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application_2 {
    public static void main(String[] args) {
        int[] firstArray;
        int[] secondArray;
        int arrayLenght;

        System.out.println("Введите размер массивов:");
        Scanner scan = new Scanner(System.in);
        arrayLenght = scan.nextInt();
        firstArray = new int[arrayLenght];
        secondArray = new int[arrayLenght];
        Random random = new Random();

        for (int i = 0; i < arrayLenght; i++) {
            firstArray[i] = random.nextInt(0, 20);
            secondArray[i] = random.nextInt(0, 20);
        }

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        // Arrays.sort(firstArray);
        // Arrays.sort(secondArray);
        for (int i = 0; i < arrayLenght; i++) {
            for (int j = 0; j < arrayLenght; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.print(firstArray[i] + " ");
                }
            }
        }
    }
}

