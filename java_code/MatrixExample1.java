/*      MatrixExample1

        Illustrates the use of matrices
        with a matrix multiplication example.

        Two matrices are initialised using {}
        One matrix initialised using [integer][integer]

        Michael Thomas Flanagan

        Created: 8 November 2003
        Updated: 1 May 2005

*/

import java.io.*;

public class MatrixExample1{

    public static void main(String[] args){

        //    Create and fill matrices
        double[][] matrixA = {{3.0,2.0,-1.0},{0.0,4.0,6.0}};
        double[][] matrixB = {{1.0,0.0},{5.0,3.0},{6.0, 4.0}};
        double[][] matrixC = new double[2][2];

        //   Multiplication  C =A.B
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                for(int k=0; k<3; k++){
                    matrixC[i][j] += matrixA[i][k]*matrixB[k][j];
                }
            }
        }

        //   Output matrixA(A)
	    System.out.println("Matrix A\n");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrixA[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //   Output matrixB (B)
	    System.out.println("Matrix B\n");
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(matrixB[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //   Output matrixC (C = A.B)
	    System.out.println("Matrix C = A.B\n");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(matrixC[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

}


