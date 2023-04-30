public class ObjectOrientedIntro {
    public static void objectorientedintro(String[] args) {

        // object = an instance of a class that may contain attributes and methods
        // example: (phone, desk, computer, coffee cup)
        // Class of Car acts as a blueprint


        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

        myCar1.drive();
        myCar1.brake();
    }
}

