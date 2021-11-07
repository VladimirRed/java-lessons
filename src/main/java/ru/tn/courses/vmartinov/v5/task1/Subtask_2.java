package ru.tn.courses.vmartinov.v5.task1;

public class Subtask_2 {
    public static void main(String[] args) {
        int[] days = new int[]{0,1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1,0,1,0,1,0,1};
        int startSm = 3;
        int treeWidthM = 58;
        int finishSm = startSm;
        for (int i=0; i<2;i++) {
            if (days[i]==0) {
                finishSm += 2;
            } else {
                finishSm -= 1;
            }
            if (finishSm >= startSm) {
                System.out.println("Salyangoz yuqoriga chiqdi");
                break;
            }
            if (finishSm == 0) {
                System.out.println("Salyangoz erga tushdi");
            }
        }
    }
}
