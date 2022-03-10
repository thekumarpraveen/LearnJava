package com.praveen;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number to check for palindrome property: ");
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        int l = number.length();
        int index = 0;
        while (index < l/2){
            if(number.charAt(index) != number.charAt(l-index-1)){
                System.out.println("The number is not a Palindrome.");
            }
        index += 1;
        }
        System.out.println("The number is Palindrome.");
    }
}

/*
*******************OUTPUT**********************
Enter the number to check for palindrome property: 
568797865
The number is Palindrome.

Process finished with exit code 0
*/
