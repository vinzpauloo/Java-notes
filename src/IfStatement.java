
public class IfStatement {

    public static void ifstatement (String[] args) {

        // if statement = performs a block of code if it's condition evaluates to be true

        int age = 12;

        if(age >= 75){
            System.out.println("You are a senior citizen.");
        } else if(age>=18) {
            System.out.println("You are of legal age.");
        } else if (age>=13){
            System.out.println("You are a teenager");
        }
        else {
            System.out.println("You are a minor.");
        }
    }
}