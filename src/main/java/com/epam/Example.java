package com.epam;


import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[][] a={{4,5,6},
                {7,8,9},
                {10,11,12}
        };

        int[][] b={{1,2,3},
                {1,2,3},
                {1,2,3}
        };
              int[][] c = new int[3][3];
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a[0].length; j++) {
                for (int k = 0; k <b.length ; k++) {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.deepToString(c));
    }



}
