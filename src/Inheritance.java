public class Inheritance {
    public static void inheritance(String[] args) {

        // inheritance =    the process where one class acquires,
        //                  the attributes and methods of another.

        Truck truck = new Truck();
        Bicycle bike = new Bicycle();

        truck.go();
        bike.stop();

        System.out.println(truck.speed);
        System.out.println(bike.speed);

        System.out.println(truck.doors);
        System.out.println(bike.pedals);
    }
}