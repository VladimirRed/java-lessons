package ru.tn.courses.vmartinov.v3.task1;

import java.util.Arrays;

public class Subtask_1 {
    public static void main(String[] args) {
        int[] arrayNumbers = {0,0,0,1,-2, 3,-4, 5,-6,7};
        for (int i = 0; i<arrayNumbers.length; i++){
            System.out.print(arrayNumbers[i] + " ");
        }
        System.out.println("=================================");

        for (int i = 0; i < arrayNumbers.length; i++)
        {
            if (arrayNumbers[i] == 0){
                continue;
            }
            else if (arrayNumbers[i] > 0)
            {
                System.out.println("Первое число положительное");
            }
            else {
                System.out.println("Перврое число отрицательное");
            }
            break;
        }
    }
}
