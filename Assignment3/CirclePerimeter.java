package com.praveen;

import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle:");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double perimeter = Math.round(2*Math.PI*radius*100)/100.0;
        System.out.println("The Perimeter of the circle is: " + perimeter);
    }
}


/*

**********************OUTPUT**********************
"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=52731:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" com.praveen.CirclePerimeter
Enter the radius of the circle:
48
The Perimeter of the circle is: 301.59

Process finished with exit code 0

*/
