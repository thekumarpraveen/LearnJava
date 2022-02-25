import java.util.Scanner;

public class PyramidVolume {
    public static void main(String[] args) {
        System.out.println("Enter the details of: \n1)Base Length 2)Base Width 3)Pyramid Height");
        Scanner input = new Scanner(System.in);
        float length = input.nextFloat();
        float width = input.nextFloat();
        float height = input.nextFloat();
        float volume = Math.round((length * width * height * 100)/3);
        System.out.println("The volume of the pyramid is: " + volume);
    }
}


/*

*******************OUTPUT*******************
C:\Users\theku\.jdks\openjdk-17.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=55255:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\DATA\Programming\JAVA_DSA\2\out\production\Java PyramidVolume
Enter the details of: 
1)Base Length 2)Base Width 3)Pyramid Height

12.4
19.4
21.2
The volume of the pyramid is: 1699.9572

Process finished with exit code 0

*/
