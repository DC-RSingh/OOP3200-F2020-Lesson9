/*
* Author: Raje Singh
* Date: November 12, 2020
*/

package ca.durhamcollege;

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
        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();

        System.out.println();

        // Output
        System.out.printf("You Entered: %s \n", name);
        System.out.printf("You Entered: %.2f \n", age);

    }
}
