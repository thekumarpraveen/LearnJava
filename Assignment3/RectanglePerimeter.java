package com.praveen;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        System.out.println("Enter the two sides of the rectangle: ");
        Scanner sides = new Scanner(System.in);
        float a = sides.nextFloat();
        float b = sides.nextFloat();
        float perimeter = 2*(a + b);

        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}


/*

********************OUTPUT********************
"C:\Program Files\Java\jdk-17.0.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=60756:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\DATA\Programming\DSA JAVA\2\out\production\2" com.praveen.RectanglePerimeter
Enter the two sides of the rectangle: 
54.23
65.214
The perimeter of the rectangle is: 238.888

Process finished with exit code 0


*/
