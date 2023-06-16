package lezioni.arraytest;

public class Matrix {

    private static int [] array = new int [10];

    private static int [][] matrix = {  {1,2,3},
                                        {4,5,6},
                                        {8,9,0}};



    static void rowTrav(){
        int i, j;

        for(i = 0; i<matrix.length; i++){
            for(j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void colTrav(){
        int i,j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
        }
    }

    static void diagonal(){ //primaria
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i==j){
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }

    /*
    * {{1,2,3},
    * {4,5,6},
    * {8,9,0}}
    * */

    static void secondaryDiagonal(){
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((j+i) == (n-1)){
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }

    static void diagonal1(){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }
    }


    public static void main(String[] args) {
//        for (int i = 0; i < Matrix.array.length; i++) {
//            System.out.print(Matrix.array[i] + " ");
//        }
        //Matrix.rowTrav();
        //Matrix.colTrav();
        Matrix.secondaryDiagonal();
    }
}
