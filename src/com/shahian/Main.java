package com.shahian;

public class Main {

    public static void main(String[] args) {
        rightTriangle();
        leftTriangle();
        pyramid();
        diamond();
    }

    private static void diamond() {
        int i, j, row = 6, space;
        space = row - 1;
        for (j = 1; j < row; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        space = 1;
        for (j = 1; j <= row - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i=1;i<2*(row-j)-1;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pyramid() {
        int i, j, row = 6;
        for (i = 0; i < row; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void leftTriangle() {
        //i for rows and j for columns
        //row denotes the number of rows you want to print
        int i, j, row = 6;
        //Outer loop work for rows
        for (i = 0; i < row; i++) {
            //inner loop work for space
            for (j = 2 * (row - i); j >= 0; j--) {
                //prints space between two stars
                System.out.print(" ");
            }
            //inner loop for columns
            for (j = 0; j <= i; j++) {
                //prints star
                System.out.print("* ");
            }
            //throws the cursor in a new line after printing each line
            System.out.println();
        }
    }

    private static void rightTriangle() {
        int i, j, row = 6;
        for (i = 0; i < row; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
