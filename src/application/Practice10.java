package application;

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner userImput = new Scanner(System.in);

        int m = userImput.nextInt();
        int n = userImput.nextInt();
        userImput.nextLine();

        int[][] arrayNumbers = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arrayNumbers[i][j] = userImput.nextInt();
            }
        }

        int x = userImput.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arrayNumbers[i][j] == x){
                    System.out.printf("Position [%d][%d]: \n", i, j);
                    if (j-1 >= 0)
                        System.out.printf("Left: %d\n", arrayNumbers[i][j-1]);
                    if (i-1 >= 0)
                        System.out.printf("Up: %d\n", arrayNumbers[i-1][j]);
                    if (j+1 < n)
                        System.out.printf("Right: %d\n", arrayNumbers[i][j+1]);
                    if (i+1 < m)
                        System.out.printf("Down: %d\n", arrayNumbers[i+1][j]);
                }
            }
        }
    }
}
