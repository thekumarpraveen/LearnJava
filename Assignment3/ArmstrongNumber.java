package com.praveen;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter the positive integer which you want to check whether it is armstrong or not:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        //calculating number of digits in number
        int digits = 1;
        int temp = number;
        int temp2 = number;
        while ((int) (temp / 10) != 0){
            digits += 1;
            temp = temp / 10;
        }
        //checking for armstrong number
        int total = 0;
        while ((int) (temp2 / 10) != 0 ){
            total += Math.pow(temp2 % 10, digits);
            temp2 = temp2/10;
        }
        total += Math.pow(temp2 % 10, digits);
        if (total == number){
            System.out.println("It is an Armstrong Number");
        }
        else{
            System.out.println("It is not an Armstrong Number");
        }
    }
}

/*
**********************OUTPUT**********************

Enter the positive integer which you want to check whether it is armstrong or not:
8208
It is an Armstrong Number

Process finished with exit code 0
*/
