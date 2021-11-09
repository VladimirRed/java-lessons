package ru.tn.courses.vmartinov.v3.task1;

import java.util.Arrays;

public class Subtask_2 {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[10];
        int[] lock = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int first_cube = 0;
        int second_cube = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > 0) {
                if (first_cube == 0)
                    first_cube = i;
                else
                    second_cube = i;
            }
        }
        int[] decrypt = new int[3];
        decrypt[first_cube % 3] = arrayNumbers[first_cube];
        if (arrayNumbers[first_cube] == arrayNumbers[second_cube])
            decrypt[(first_cube + 1) % 3] = (10 - arrayNumbers[first_cube] - arrayNumbers[second_cube]) / 2;
        else
            decrypt[(first_cube  + 1) % 3] = arrayNumbers[second_cube];
        decrypt[(first_cube + 2) % 3] = 10 - arrayNumbers[first_cube] - decrypt[(first_cube + 1) % 3];

        for (int i = 0; i < lock.length; i++) {
            lock[i] = decrypt[i % 3];
        }
        System.out.println(Arrays.toString(lock));
    }
}
