package com.praveen;

import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        System.out.println("Enter one side of the square:");
        Scanner input = new Scanner(System.in);
        float side = input.nextFloat();
        float perimeter = 4 * side;
        System.out.println("The perimeter of the square is: " + perimeter);
    }
}


/*

*******************OUTPUT*******************
"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=60799:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" com.praveen.SquarePerimeter
Enter one side of the square:
89798.564
The perimeter of the square is: 359194.25

Process finished with exit code 0


*/
