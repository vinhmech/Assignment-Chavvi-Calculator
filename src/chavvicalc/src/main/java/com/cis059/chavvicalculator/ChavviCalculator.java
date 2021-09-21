/**
 *  Copyright Notice
 *  Filename: ChavviCalculator.java
 */

package com.cis059.chavvicalculator;
import java.util.Scanner;  // Import the Scanner class

/** 
 * Create a calculator
 * @author Vinh Nguyen - SJCC_CIS059
 * @version 1.0 - 09/20/2021
 */

public class ChavviCalculator 
{
    // print the menu
    public static void menu(){
        Scanner sc = new Scanner(System.in); // create scanner object to take input
        String choice = "";
        float a = 0;
        float b = 0;
        do{
            System.out.print("--------------------------------------------");
            System.out.print("\nChavvi Calc");
            System.out.print("\n--------------------------------------------");
            System.out.print(String.format("\nA = %.3f        B = %.3f", a , b));
            System.out.print("\n--------------------------------------------");
            System.out.print("\na       Enter a value for A");
            System.out.print("\nb       Enter a value for B");
            System.out.print("\n+       Add");
            System.out.print("\n-       Subtract");
            System.out.print("\n*       Multiply");
            System.out.print("\n/       Divide");
            System.out.print("\nc       Clear");
            System.out.print("\nq       Quit");
            System.out.print("\n--------------------------------------------");
            System.out.print("\nEnter a command: ");
            choice = sc.nextLine();

            // quit option
            if (choice.charAt(0) == 'q'){
                sc.close();
                System.out.println("Thank you for using Chavvi Calculator");
            }
        } while (choice.equals("") || choice.charAt(0) != 'q');
    }

    public static void main( String[] args )
    {
        menu();
    }
}
