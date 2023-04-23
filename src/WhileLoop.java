import java.util.Scanner;

public class WhileLoop {
    public static void whileloop(String[] args) {
        // while loop = executes a block of code as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        // Checks the condition first

//        while(name.isBlank()){
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello "+ name);


        // do while loop
        // Always executes the block of code once.

        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while(name.isBlank());

        System.out.println("Hello "+ name);
    }
}