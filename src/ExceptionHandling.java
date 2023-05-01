import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void exceptionhandling(String[] args) {

        // exception =  an event that occurs during the execution of a program that,
        //              disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result "+z);
        }

        catch(ArithmeticException e){
            System.out.println("You cannot divide by zero!");
        }

        catch(InputMismatchException e){
            System.out.println("Please enter a number.");
        }

        catch(Exception e){
            System.out.println("Something went wrong.");
        }

        // always close a scanner
        finally {
            System.out.println("This will always print.");
            scanner.close();
        }
    }
}