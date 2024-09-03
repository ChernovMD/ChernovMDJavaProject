package ru.mirea.chernov;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application_1 {
    public static void main(String[] args){
        int[] numberArray;
        int arrayLenght;
        int numToFind;

        System.out.println("Введите размер массива:");
        Scanner scan = new Scanner(System.in);
        arrayLenght = scan.nextInt();

        numberArray = new int[arrayLenght];
        System.out.println(Arrays.toString(numberArray));
        Random random = new Random();

        for (int i = 0; i < numberArray.length; i++){
            numberArray[i] = random.nextInt(-100, 100);
        }

        System.out.println(Arrays.toString(numberArray));
        Arrays.sort(numberArray);

        System.out.println(Arrays.toString(numberArray));
        System.out.println("Введите число для поиска:");

        numToFind = scan.nextInt();
        /*
        System.out.println("Введите число для поиска:");
        numToFind = scan.nextInt();
        int low = 0;
        int high = numberArray.length;
        int middle;
        while (low <= high){
            middle = (low + high) / 2;
            int num = numberArray[middle];
            if (num == numToFind){
                System.out.println("Значение найдено под индексом "+ middle);
                return;
            } else if(num > numToFind){
                high = middle - 1;
            } else{
                low = middle + 1;
            }        }
        System.out.println("Искомого значения в массиве нет!");
        */
        BinSearch(numberArray, numToFind);


    }
    public static void BinSearch(int[] myArray, int number){
        int numIteration = 0;
        int numToFind = number;
        int low = 0;
        int high = myArray.length;
        int middle;

        while (low <= high){
            numIteration += 1;
            System.out.println(numIteration);
            middle = (low + high) / 2;
            int num = myArray[middle];

            if (num == numToFind){
                System.out.println("Значение найдено под индексом "+ middle);
                return;
            } else if(num > numToFind){
                high = middle - 1;
            } else{
                low = middle + 1;
            }
        }
        System.out.println("Искомого значения в массиве нет!");
    }
}

