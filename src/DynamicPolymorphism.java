import java.util.Scanner;

public class DynamicPolymorphism {
    public static void dynamicpolymorphism(String[] args) {

        // Dynamic Polymorphism
        // many shapes/forms
        // dynamic, after compilation (during runtime)

        // ex. A corvette is a: corvette, and a car, and a vehicle, and an object

        // Benefits:
        // Can declare an object and make space for it in memory even if we do not know what type of object we want quite yet.


        Scanner scanner = new Scanner(System.in);
        Profession profession;

        System.out.println("What is your profession?");
        System.out.println("(1=lawyer) or (2=doctor): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            profession = new Lawyer();
            profession.speak();
        } else if (choice == 2){
            profession = new Doctor();
            profession.speak();
        } else {
            profession = new Profession();
            System.out.println("That choice was invalid");
            profession.speak();
        }

        System.out.println(profession);

    }
}