package com.emil.finddeterminantjava;

import java.util.Scanner;

public class GetPrintMatrix {

    public static long m;
//    public static long n;
    public static long [][] getMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix dimension");
        m = sc.nextInt();
        if(m<2){
            System.out.println("You entered wrong dimension. Dimension must greater than 1");
            System.exit(0);
        }
        long[][] matrice = new long[(int) m][(int) m];;

        System.out.println("Enter matrix");
        for (int i = 0; i < matrice.length; i++) {
            for (int c = 0; c < matrice.length; c++) {
                System.out.println("Row: " + (i + 1) + " Column: " + (c + 1));
                matrice[i][c] = sc.nextInt();
            }
        }

        return matrice;
    }
    public static void printMatrix(long [][]matrice){
        for (int i = 0; i < matrice.length; i++) {
            System.out.print("|");
            for (int c = 0; c < matrice.length; c++) {
                System.out.print(" " + matrice[i][c] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
