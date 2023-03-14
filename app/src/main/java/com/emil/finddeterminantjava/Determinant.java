package com.emil.finddeterminantjava;
import static java.lang.Math.pow;

public class Determinant {
    public static long determinant(long [][] arr){
        long determinant;
        long endDeterminant=0;
        long [][]matrice = new long[(int) (arr.length-1)][(int) (arr.length-1)];
        if(arr.length==2){
            endDeterminant=Determinant3by3.determinant22(arr);
        }else if(arr.length==3){
            endDeterminant=Determinant3by3.determinant33(arr);
        }   else{
            //4 4  arr
            for(int i = 0;i< arr.length;i++){

                if(i==0){
                    for(int i1=0;i1< arr.length-1;i1++) {
                        for(int i2=0;i2<arr.length-1;i2++) {
                            matrice[i1][i2] = arr[i1 + 1][i2 + 1];
                        }
                    }
                    if(matrice.length==3){
                        determinant = Determinant3by3.determinant33(matrice);
                        endDeterminant = (long) (endDeterminant+determinant*arr[i][0]*pow(-1,i));
                    }else{
                        determinant=Determinant.determinant(matrice);
                        endDeterminant = (long) (endDeterminant+determinant*arr[i][0]*pow(-1,i));
                    }
                } else {
                    for(int i1=0;i1<arr.length-1;i1++) {
                        for(int i2=0;i2<arr.length-1;i2++) {
                            if(i1<i) {
                                matrice[i1][i2] = arr[i1][i2 + 1];
                            }else{
                                matrice[i1][i2] = arr[i1 + 1][i2 + 1];
                            }

                        }
                    }
                    if(matrice.length==3){
                        determinant = Determinant3by3.determinant33(matrice);
                        endDeterminant = (long) (endDeterminant+determinant*arr[i][0]*pow(-1,i));
                    }else{
                        determinant=Determinant.determinant(matrice);
                        endDeterminant = (long) (endDeterminant+determinant*arr[i][0]*pow(-1,i));
                    }
                }


            }

        }

        return endDeterminant;
    }


}
