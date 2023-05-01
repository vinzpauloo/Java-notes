public class Abstraction {
    public static void abstraction(String[] args) {

        // Abstraction
        // abstract =   abstract classes cannot be instantiated, but they can have a subclass
        //              abstract methods are declared without an implementation

        // Vehicle vehicle = new Vehicle();

        // Adds a layer of security
//        Pets pet = new Pets();
        Dogs dog = new Dogs();

        dog.go();
    }
}
