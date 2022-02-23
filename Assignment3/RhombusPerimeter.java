package com.praveen;

import java.util.Scanner;

public class RhombusPerimeter {
    public static void main(String[] args) {
        System.out.println("Enter the equal sides of the rhombus: ");
        Scanner sides = new Scanner(System.in);
        float side = sides.nextFloat();
        float perimeter = 4 * side;
        System.out.println("The perimeter of the rhombus is: " + perimeter);
    }
}


/*

*************************OUTPUT*************************
"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=60782:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" com.praveen.RhombusPerimeter
Enter the equal sides of the rhombus: 
97.564
The perimeter of the rhombus is: 390.256

Process finished with exit code 0


*/
