package main.java.lezioni.arraytest;

import java.util.Arrays;

public class TpDatoArrayBidimensionali {
    public static void main(String[] args) {
        int [][] matrix = new int [3][3];
        sortRowsAscending(matrix);
    }
    public static void sortRowsAscending(int[][] matrix) {
        for (int[] row : matrix) {
            Arrays.sort(row);
            System.out.println();
        }
    }

}