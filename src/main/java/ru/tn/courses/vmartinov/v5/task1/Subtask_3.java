package ru.tn.courses.vmartinov.v5.task1;

public class Subtask_3 {
    public static void main(String[] args)
    {
        double[] calibres = new double[]{4.68, 4.56, 7.99, 10.5, 8.6, 20.0, 1.2, 2.1, 2.7};

        sortShell(calibres);

        for (double num : calibres)
        {
            System.out.println(num);
        }
    }

    private static void sortShell(double[] arr)
    {
        for (int i = 0; i < arr.length - 1; )
        {
            if (arr[i] > arr[i + 1])
            {
                double temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if (i != 0) i--;
            }
            else if (i != arr.length - 1) i++;
        }
    }
}
