package com.praveen;

import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        System.out.println("Enter the length of diagonals of rhombus d1 and d2:");
        Scanner input = new Scanner(System.in);
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();
        double area = Math.round((0.5 * d1 * d2) * 100)/100.0;
        System.out.println("The area of the diagonal is: " + area);
    }
}


/*

****************OUTPUT****************
"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=52071:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" com.praveen.RhombusArea
Enter the length of diagonals of rhombus d1 and d2:
67
25
The area of the diagonal is: 837.5

Process finished with exit code 0

*/
