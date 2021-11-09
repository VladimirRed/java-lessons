package ru.tn.courses.vmartinov.v3.task1;

public class Subtask_3 {
    public static void main(String[] args)
    {
        int[] arrayNumbers = {12,9,4,25,84,48,74,100};
        int count = 0;
        for (int i = 0; i < arrayNumbers.length - 1; i++)
            for (int j = 0; j < arrayNumbers.length - i - 1; j++)
                if (arrayNumbers[j] > arrayNumbers[j+1])
                {
                    int temporary = arrayNumbers[j];
                    arrayNumbers[j] = arrayNumbers[j+1];
                    arrayNumbers[j+1] = temporary;
                    count++;
                }
        System.out.println("Отсортированный массив:");
        for(int i=0; i<arrayNumbers.length; i++){
            System.out.print(arrayNumbers[i] + " ");
        }
        System.out.println("=================================");
        System.out.println("Количество перестановок: "+ count);
    }
}
