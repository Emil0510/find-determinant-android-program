package com.emil.finddeterminantjava;

public class Determinant3by3 {

    public static long determinant33 (long[][] matrice){
        long e;
        long q;
        long determinant = 0;
        e = matrice[0][0] * matrice[1][1] * matrice[2][2] + matrice[0][1] * matrice[1][2] * matrice[2][0]
                + matrice[0][2] * matrice[1][0] * matrice[2][1];
        q = -(matrice[0][2] * matrice[1][1] * matrice[2][0] + matrice[1][2] * matrice[2][1] * matrice[0][0]
                + matrice[2][2] * matrice[1][0] * matrice[0][1]);
        determinant = q + e;
        return determinant;
    }
    public static long determinant22(long [][] matrice){
        long e;
        long q;
        long determinant=0;
        e=matrice[0][0]*matrice[1][1];
        q=matrice[0][1]*matrice[1][0];
        determinant=e-q;
        return determinant;
    }
}
