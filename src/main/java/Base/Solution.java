package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 22
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class Solution{

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Enter the first number: ");
        int firstNumber = in.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = in.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = in.nextInt();

        if (firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber){

            System.out.print("Invalid Input :( , all numbers must be different. ");

        }

        else if (firstNumber > secondNumber && firstNumber > thirdNumber){

            System.out.print("The largest number is "+firstNumber+".");

        }

        else if ( secondNumber > firstNumber && secondNumber > thirdNumber){

            System.out.print("The largest number is "+secondNumber+".");

        }

        else if ( thirdNumber > firstNumber && thirdNumber > secondNumber ) {

            System.out.print("The largest number is " +thirdNumber+ ".");

        }


    }

}
