package org.model;

public class Operations {

    private double[][] matrixA;
    private double[][] matrixB;

    public Operations() {
    }

    public Operations(double[][] matrixA, double[][] matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
    }

    public void showMatrix(int rows, int columns, double[][] matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void check() {
        if (matrixA.length < 1 || matrixB.length < 1) {
            throw new IllegalArgumentException("Matrices cannot have fewer than 1 row.");
        } else if (matrixA[0].length < 1 || matrixB[0].length < 1) {
            throw new IllegalArgumentException("Matrices cannot have fewer than 1 column.");
        } else if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            throw new IllegalArgumentException("The matrices must have the same number of rows and columns.");
        }
    }

    public double[][] add() {
        check();

        double[][] result = new double[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return result;
    }

    public double[][] subtract(double[][] matrix1, double[][] matrix2) {
        check();

        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    public double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length < 1 || matrix2.length < 1) {
            throw new IllegalArgumentException("Matrices cannot have fewer than 1 row.");
        } else if (matrix1[0].length < 1 || matrix2[0].length < 1) {
            throw new IllegalArgumentException("Matrices cannot have fewer than 1 column.");
        } else if (matrix1[0].length != matrix2.length) {
            throw new IllegalArgumentException("The number of columns in the first matrix must be equal to the number of rows in the second matrix");
        }

        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
}
