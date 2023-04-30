public class MethodOverriding {
    public static void methodoverriding(String[] args) {

        // method overriding =  Declaring a method in a subclass,
        //                      which is already present in the parent class.
        //                      done so that a child class can give its own implementation

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.speak();
        dog.speak();
    }
}
