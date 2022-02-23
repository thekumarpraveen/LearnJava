package com.praveen;

import java.util.Scanner;

public class IsoscelesTriangleAreaProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of equal sides: ");
        double equal = input.nextDouble();
        System.out.println("Enter the third side length: ");
        double third = input.nextDouble();
        double area = Math.round((0.5*third*(Math.sqrt(Math.pow(equal, 2) - Math.pow(third/2, 2))))*100)/100.0;
        System.out.println("The area of the triangle is: " + area);
    }
}


/*

**************OUTPUT**************
"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=64626:
C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" 
com.praveen.IsoscelesTriangleAreaProgram
Enter the length of equal sides: 
36
Enter the third side length: 
28
The area of the triangle is: 464.33

Process finished with exit code 0


*/
