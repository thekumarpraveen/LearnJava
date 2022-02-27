package com.praveen;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the positive integer whose factorial you want to calculate:");
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        long factorial = 1;
        long counter = 1;
        while (counter <= number){
            factorial *= counter;
            counter += 1;
        }
        System.out.println("The required factorial is: " + factorial);
    }
}


/*

***********************OUTPUT***********************

C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=56865:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\3\out\production\3 com.praveen.Factorial
Enter the positive integer whose factorial you want to calculate:
20
The required factorial is: 2432902008176640000

Process finished with exit code 0

*/
