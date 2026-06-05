package org.principal;

import org.model.Operations;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int columnsA, rowsA, columnsB, rowsB, operation;

        System.out.println("=================");
        System.out.println("Matrix Calculator");
        System.out.println("=================");
        System.out.println(" ");

        System.out.print("How many columns will matrix A have: ");
        columnsA = sc.nextInt();
        System.out.print("How many rows will matrix A have: ");
        rowsA = sc.nextInt();
        System.out.println(" ");

        double[][] matrixA = new double[rowsA][columnsA];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                System.out.print("Write the number of row " + i + " and column " + j + ": ");
                matrixA[i][j] = sc.nextDouble();
            }
        }

        System.out.print("How many columns will matrix B have: ");
        columnsB = sc.nextInt();
        System.out.print("How many rows will matrix B have: ");
        rowsB = sc.nextInt();
        System.out.println(" ");

        double[][] matrixB = new double[rowsB][columnsB];

        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.print("Write the number of row " + i + " and column " + j + ": ");
                matrixB[i][j] = sc.nextDouble();
            }
        }

        Operations op = new Operations(matrixA, matrixB);

        for (int f = 0; f != 1; f=0) {
            System.out.println("============");
            System.out.println("[1] Add");
            System.out.println("[2] Subtract");
            System.out.println("[3] Multiply");
            System.out.println("[4] Divide");
            System.out.println("[5] Show matrix A");
            System.out.println("[6] Show matrix B");
            System.out.println("[7] Quit");
            System.out.println("============");
            System.out.print("Which operation do you want to perform: ");
            operation = sc.nextInt();

            double[][] result;

            switch (operation) {
                case 1:
                    System.out.println("Matrix A:");
                    op.showMatrix(rowsA, columnsA, matrixA);
                    System.out.println("+");
                    System.out.println("Matrix B:");
                    op.showMatrix(rowsB, columnsB, matrixB);
                    System.out.println("=");
                    result = op.add();
                    op.showMatrix(result.length, result[0].length, result);
                    break;
                case 2:
                    System.out.println("[1] A - B");
                    System.out.println("[2] B - A");
                    System.out.print("Which operation do you want to perform: ");
                    int o = sc.nextInt();
                    if (o == 1) {
                        System.out.println("Matrix A:");
                        op.showMatrix(rowsA, columnsA, matrixA);
                        System.out.println("-");
                        System.out.println("Matrix B:");
                        op.showMatrix(rowsB, columnsB, matrixB);
                        System.out.println("=");
                        result = op.subtract(matrixA, matrixB);
                        op.showMatrix(result.length, result[0].length, result);
                    } else if (o == 2) {
                        System.out.println("Matrix B:");
                        op.showMatrix(rowsB, columnsB, matrixB);
                        System.out.println("-");
                        System.out.println("Matrix A:");
                        op.showMatrix(rowsA, columnsA, matrixA);
                        System.out.println("=");
                        result = op.subtract(matrixB, matrixA);
                        op.showMatrix(result.length, result[0].length, result);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case 3:
                    System.out.println("Fuck You?");
                    break;
                case 4:
                    System.out.println("Fuck You?");
                    break;
                case 5:
                    op.showMatrix(rowsA, columnsA, matrixA);
                    break;
                case 6:
                    op.showMatrix(rowsB, columnsB, matrixB);
                    break;
                case 7:
                    System.out.println("GOODBYE!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}