package com.praveen;

import java.util.Scanner;

public class EquilateralTrianglePerimeter {
    public static void main(String[] args) {
        System.out.println("Enter the equal side of the triangle: ");
        Scanner input = new Scanner(System.in);
        float side = input.nextFloat();
        float perimeter = 3*side;
        System.out.println("The perimeter of the triangle is: " + perimeter);
    }
}

/*

***********************OUTPUT***********************
"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=52752:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" com.praveen.EquilateralTrianglePerimeter
Enter the equal side of the triangle: 
87.25
The perimeter of the triangle is: 261.75

Process finished with exit code 0


*/
