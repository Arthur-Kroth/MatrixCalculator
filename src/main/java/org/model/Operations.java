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

        double[][] add = new double[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                add[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return add;
    }
}
