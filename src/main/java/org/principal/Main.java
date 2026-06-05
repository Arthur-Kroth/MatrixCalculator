package org.principal;

import org.model.Operations;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int columnsA, rowA, columnsB, rowB, operation;

        System.out.println("=================");
        System.out.println("Matrix Calculator");
        System.out.println("=================");
        System.out.println(" ");

        System.out.print("How many columns will matrix A have: ");
        columnsA = sc.nextInt();
        System.out.print("How many rows will matrix A have: ");
        rowA = sc.nextInt();
        System.out.println(" ");

        double[][] matrixA = new double[rowA][columnsA];

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnsA; j++) {
                System.out.print("Write the number of row " + i + " and column " + j + ": ");
                matrixA[i][j] = sc.nextDouble();
            }
        }

        System.out.print("How many columns will matrix B have: ");
        columnsB = sc.nextInt();
        System.out.print("How many rows will matrix B have: ");
        rowB = sc.nextInt();
        System.out.println(" ");

        double[][] matrixB = new double[rowB][columnsB];

        for (int i = 0; i < rowB; i++) {
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

            switch (operation) {
                case 1:
                    System.out.println("Matrix A:");
                    for (int i = 0; i < rowA; i++) {
                        for (int j = 0; j < columnsA; j++) {
                            System.out.print("[" + matrixA[i][j] + "]");
                        }
                        System.out.println();
                    }
                    System.out.println("+");
                    System.out.println("Matrix B:");
                    for (int i = 0; i < rowB; i++) {
                        for (int j = 0; j < columnsB; j++) {
                            System.out.print("[" + matrixB[i][j] + "]");
                        }
                        System.out.println();
                    }
                    System.out.println("=");
                    for (int i = 0; i < op.add(matrixA, matrixB).length; i++) {
                        for (int j = 0; j < op.add(matrixA, matrixB)[0].length; j++) {
                            System.out.print("[" + op.add(matrixA, matrixB)[i][j] + "]");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Fuck You?");
                    break;
                case 3:
                    System.out.println("Fuck You?");
                    break;
                case 4:
                    System.out.println("Fuck You?");
                    break;
                case 5:
                    for (int i = 0; i < rowA; i++) {
                        for (int j = 0; j < columnsA; j++) {
                            System.out.print("[" + matrixA[i][j] + "]");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 0; i < rowB; i++) {
                        for (int j = 0; j < columnsB; j++) {
                            System.out.print("[" + matrixB[i][j] + "]");
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.out.println("GOODBYE!");
                    System.exit(0);
                    break;
            }
        }
    }
}