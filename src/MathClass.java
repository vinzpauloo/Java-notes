import java.util.Scanner;

public class MathClass {

    public static void mathclass (String[] args) {

        double x = 3.14;
        double y = -10;
        double z = 10;

        double higher = Math.max(x, y); // Method to show the higher value
        double lower = Math.min(x,y); // Shows the lower value
        double absolute = Math.abs(y); // Shows the absolute value
        double squareRoot = Math.sqrt(z); // Shows the square root
        double round = Math.round(x); // Shows the rounded number
        double roundedUp = Math.ceil(x); // Shows the rounded UP number
        double roundedDown = Math.floor(x); // Shows the rounded DOWN number

        double sideA;
        double sideB;
        double result;
        double resultPow;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side X: ");
        sideA = scanner.nextDouble();
        System.out.println("Enter side Y: ");
        sideB = scanner.nextDouble();

        result = Math.sqrt((sideA * sideA) + (sideB * sideB));
        resultPow = Math.sqrt(Math.pow(sideA, 2)+Math.pow(sideB, 2));

        System.out.println("The hypotenuse is: "+result);
        System.out.println("Pow results: "+resultPow);

        scanner.close();
    }
}