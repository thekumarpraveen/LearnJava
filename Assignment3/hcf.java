package com.praveen;
import java.util.Scanner;
import static java.lang.Math.min;
public class hcf_program {
    public static void main(String[] args) {
        System.out.println("Enter the two positive integers for which HCF is to be calculated: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int hcf = 1;
        int counter = 1;
        int small = min(a, b);
        while (counter <= small){
            if (a % counter == 0 && b % counter == 0){
                hcf = counter;
            }
            counter += 1;
            }
        System.out.println("The required HCF is: " + (hcf));
        }
    }

/*
************************OUTPUT**********************
Enter the two positive integers for which HCF is to be calculated: 
5456 4876
The required HCF is: 4

Process finished with exit code 0
*/
