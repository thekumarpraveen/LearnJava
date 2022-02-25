import java.util.Scanner;

public class CubeTotalSurfaceArea {
    public static void main(String[] args) {
        System.out.println("Enter the edge length of the cube:");
        Scanner input = new Scanner(System.in);
        float edge = input.nextFloat();
        double tsa = 6 * Math.pow(edge, 2);
        System.out.println("The total surface area of the cube is: " + tsa);

    }
}



/*

*************************OUTPUT*************************
C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=50461:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\2\out\production\Java CubeTotalSurfaceArea
Enter the edge length of the cube:
2
The total surface area of the cube is: 24.0

Process finished with exit code 0

*/
