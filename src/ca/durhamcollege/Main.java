/*
* Author: Raje Singh
* Date: November 12, 2020
*/

package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // Define scanner
        Scanner keyboard = new Scanner(System.in);

        // Input
        String name = null;
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        float age = 0.0f;

        boolean isValid = false;    // Sentinel Variable

        // Input Validation for Age
        while (!isValid)
        {
            try
            {
                System.out.print("Please enter your age: ");
                age = keyboard.nextFloat();
                isValid = true;

                if (age <= 0.0f || age >= 130.0f)
                {
                    System.out.println("Error: You must enter an age greater than 0.0 and less than 130.0");
                    keyboard.nextLine();
                    isValid = false;
                }
            }
            catch (InputMismatchException inputE)
            {
                System.out.println("Error: You must enter a valid floating-point number for age");
                keyboard.nextLine();
                isValid = false;
            }
        }

        System.out.println();

        // Output
        System.out.printf("You Entered: %s \n", name);
        System.out.printf("You Entered: %.2f \n", age);

        // Multi-dimensional Array

        System.out.println("Multi-Dimensional Array Example");

        int rows = 8;
        int cols = 8;

        float [][] board = new float[rows][cols];

        for (int x = 0; x < rows; x++)
        {
            for (int y = 0; y < cols; y++)
            {
                board[x][y] = (float)(Math.random() * 100.0) + 1.0f;
            }
        }

        System.out.println("Showing 10 Random Values: ");
        for (int i = 0; i < 10; i++)
        {
            var randRows = (int) Math.floor(Math.random() * rows);
            var randCols = (int) Math.floor(Math.random() * cols);
            System.out.print("row: " + randRows + " col: " + randCols + " | ");
            System.out.printf("The Random number is: %.2f\n", board[randRows][randCols]);
        }

    }
}
