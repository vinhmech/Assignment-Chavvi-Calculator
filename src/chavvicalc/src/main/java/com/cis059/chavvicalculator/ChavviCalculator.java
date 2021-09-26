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
    // function to print line
    public static void printLine(){
        System.out.print("\n--------------------------------------------");
    }

    // print the menu
    public static void menu(){
        Scanner sc = new Scanner(System.in); // create scanner object to take input
        String choice = "";
        float A = 0;                         // initialize value of A 
        float B = 0;                         // initialize value of B
        do{
            printLine();
            System.out.print("\nChavvi Calc");
            printLine();
            System.out.print(String.format("\nA = %.3f        B = %.3f", A , B));
            printLine();
            System.out.print("\na       Enter a value for A");
            System.out.print("\nb       Enter a value for B");
            System.out.print("\n+       Add");
            System.out.print("\n-       Subtract");
            System.out.print("\n*       Multiply");
            System.out.print("\n/       Divide");
            System.out.print("\nc       Clear");
            System.out.print("\nq       Quit");
            printLine();
            System.out.print("\nEnter a command: ");
            choice = sc.nextLine();

            // user input error handling 
            // check if user input is a valid char type
            if (choice.length() != 1){
                System.out.println("ERROR: Unknown command");
            }


            // input A 
            else if (choice.charAt(0) == 'a'){
                System.out.print("Enter a number: ");
                String aString;
                try {
                    aString = sc.nextLine();
                    A = Float.parseFloat(aString);
                }
                catch (NumberFormatException e){
                    System.out.println("ERROR: The value entered is not a floating point number");
                }
            }

            // input B
            else if (choice.charAt(0) == 'b') {
                System.out.print("Enter a number: ");
                      String bString;
                try{
                  bString = sc.nextLine();
                  B = Float.parseFloat(bString);
                }
                catch (NumberFormatException e){
                  System.out.println("ERROR: The value entered is not a floating point number");
                }
            }

            // + option
            else if (choice.charAt(0) == '+'){
                A = A + B;
            }

            // - option 
            else if (choice.charAt(0) == '-') {
                A = A - B;
            }

            // * option
            else if (choice.charAt(0) == '*') {
                A = A * B;
            }

            // / option
            else if (choice.charAt(0) == '/'){
                if (B == 0) {
                    System.out.println("ERROR: Unable to divide by 0");
                }
                else {
                    A = A / B;
                }
            }

            // clear option
            else if (choice.charAt(0) == 'c'){
                A = 0;
                B = 0;
            }

            // quit option
            else if (choice.charAt(0) == 'q'){
                sc.close();
                System.out.println("Thank you for using Chavvi Calculator");
            }

            // display error when user input is not a valid menu character
            else{
                System.out.println("ERROR: Unknown command");
            }
        } while (choice.equals("") || choice.charAt(0) != 'q');
    }

    public static void main( String[] args )
    {
        menu();
    }
}
