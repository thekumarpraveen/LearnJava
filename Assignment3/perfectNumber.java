package com.praveen;

import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        System.out.println("Enter the number to check whether it is perfect or not:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int divisors_sum = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                divisors_sum += i;
            }
        }
        if (number == divisors_sum){
            System.out.println(number + " is a perfect number");
        }
        else{
            System.out.println(number + " is not a perfect number.");
        }
    }
}

/*
************************OUTPUT************************
Enter the number to check whether it is perfect or not:
8128
8128 is a perfect number

Process finished with exit code 0
*/
