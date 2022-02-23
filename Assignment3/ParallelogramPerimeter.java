package com.praveen;

import java.util.Scanner;

public class ParallelogramPerimeter {
    public static void main(String[] args) {
        System.out.println("Enter the two sides of the parallelogram:");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float perimeter = a + b;
        System.out.println("The perimeter of the parallelogram is: " + perimeter);
    }
}


/*

*************************OUTPUT*************************
"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=52774:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" com.praveen.ParallelogramPerimeter
Enter the two sides of the parallelogram:
58.23
61.25
The perimeter of the parallelogram is: 119.479996

Process finished with exit code 0

*/
