package com.praveen;

import java.util.Scanner;

public class NumbersAverage {
    public static void main(String[] args) {
        System.out.println("Enter the numbers which you want to calculate the average. Recording will stop when 0 entered.");
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        float total = 0;
        float average = 0;
        float counter = 1;
        while (num != 0){
            total += num;
            counter += 1;
            num = input.nextFloat();
        }
        average = total/(counter - 1);
        System.out.println("The calculated average is: " + average);
    }
}


/*

****************************OUTPUT****************************

C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=59315:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\3\out\production\3 com.praveen.NumbersAverage
Enter the numbers which you want to calculate the average. Recording will stop when 0 entered.
54
85.24
79.7987
12.564
0
The calculated average is: 57.900673

Process finished with exit code 0

*/
