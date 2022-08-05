package demo.bai1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        n = sc.nextInt();
        int[] arrNumbers = new int[n];
        int max = 0;
        int min = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu so " + (i+1) +" = ");
            arrNumbers[i] = sc.nextInt();
            if (max < arrNumbers[i]) {
                max = arrNumbers[i];
            }
            if (min > arrNumbers[i]) {
                min = arrNumbers[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
