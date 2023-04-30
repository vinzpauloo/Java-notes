public class ObjectPassing {
    public static void objectpassing(String[] args) {

        Garage garage = new Garage();

        Sedan car = new Sedan("BMW");
        Sedan car2 = new Sedan("Tesla");

        garage.park(car);
        garage.park(car2);
    }
}