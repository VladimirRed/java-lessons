package ru.tn.courses.vmartinov.v5.task1;

import java.util.Arrays;

public class Subtask_1 {
    public static void main(String[] args) {
        int arr[] = {2, 36, 101, 212, 32, 33, 17, 76, 82, 10, 1};
        for (int anArr : arr) System.out.print(anArr + " ");
        int count = 0;
        int[] evenArr = new int[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                evenArr = Arrays.copyOf(evenArr, evenArr.length + 1);
                evenArr[count++] = arr[i];
            }
        }
        for (int anArr : evenArr) System.out.print(anArr + " ");
        if (evenArr.length == 0)
            throw new IllegalArgumentException("Hatto raqamlar yo'q");

    }
}
