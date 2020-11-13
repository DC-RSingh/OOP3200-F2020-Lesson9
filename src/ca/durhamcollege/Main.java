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

    }
}
