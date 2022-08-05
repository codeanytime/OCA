package demo.bai1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        n = sc.nextInt();
        int[] arrNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu so " + (i+1) +" = ");
            arrNumbers[i] = sc.nextInt();
        }
        int[] inverse = new int[n];
        for (int i = 0; i < n; i++) {
            inverse[i] = arrNumbers[n - i - 1];
            System.out.println("Phan tu thu " + i + "sau khi reverse :" + inverse[i]);
        }
    }
}
