package com.praveen;

import java.util.Scanner;

public class NumberAddition {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner input  = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float total = a + b;
        System.out.println("The required sum is: " + total);

    }
}

/*

**********************OUTPUT**********************

C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=56713:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\3\out\production\3 com.praveen.NumberAddition
Enter two numbers:
87.264
98.4497
The required sum is: 185.7137

Process finished with exit code 0

*/
