package com.epam;



import java.util.Random;

public class Matrix {
    private int[][] values;

    public Matrix(int row, int column) {
        values= new int[row][column];
    }

    public void randomFill(){
        for (int i = 0; i <values.length; i++) {
            for (int j = 0; j <values[0].length ; j++) {
               values[i][j]=new Random().nextInt(10);
            }

        }

    }

    public int[][] getValues() {
        return values;
    }

    public int getRowCount(){
        return values.length;
    }
    public int getColumnCount(){
        return values[0].length;
    }
    public void setRowAndColumn(int row,int column,int value){
        values[row][column]=value;
    }
    public int getValue(int row,int column){
        int i=0;
        if(row<getRowCount() && column<getColumnCount()) {
             i=values[row][column];}
        else{

           throw new IllegalArgumentException("Значение не найдено");
        }
return i;
    }

    public Matrix multply(Matrix matrix1) {
  Matrix matrix =new Matrix(this.getRowCount(),matrix1.getColumnCount());

         // int[][] mat=new int[this.getRowCount()][matrix1.getColumnCount()];
        //System.out.println(this.getRowCount()+" "+matrix1.getColumnCount()+" "+matrix1.getRowCount());
        for (int i = 0; i <this.getRowCount(); i++) {
            for (int j = 0; j <matrix1.getColumnCount(); j++) {
                int z=0;
                for (int k = 0; k <matrix1.getRowCount(); k++) {
                      z+=this.getValue(i,k)*matrix1.getValue(k,j);
                matrix.setRowAndColumn(i,j,z);

                }
            }
        }

        return matrix;
    }
}
