package application;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner userImput = new Scanner(System.in);

        int n = userImput.nextInt();

        int[][] arrayNumbers = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrayNumbers[i][j] = userImput.nextInt();
            }
        }

        // printa a diagonal principal
        System.out.println("Main diagonal: ");
        for (int i = 0; i < n; i++){
            System.out.printf("%d ", arrayNumbers[i][i]);
        }
        System.out.println();

        // conta os números negativos presentes na matriz
        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (arrayNumbers[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.printf("Negative numbers = %d\n", count);
    }
}
