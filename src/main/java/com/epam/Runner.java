package com.epam;


import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Matrix matrix= new Matrix(2,3);
        matrix.randomFill();
        System.out.println(Arrays.deepToString(matrix.getValues()));

        Matrix matrix1= new Matrix(3,4);
        matrix1.randomFill();
        System.out.println(Arrays.deepToString(matrix1.getValues()));
        Matrix matrix2= new Matrix(matrix.getRowCount(),matrix1.getColumnCount());



        matrix2 = matrix.multply(matrix1);
        System.out.println(Arrays.deepToString(matrix2.getValues()));
    }




}
