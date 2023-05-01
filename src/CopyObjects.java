public class CopyObjects {
    public static void copyobjects(String[] args) {

        Watch watch1 = new Watch(
                "Seiko",
                "Silver",
                2023
        );

//        Watch watch2 = new Watch(
//                "Citizen",
//                "Gold",
//                2023
//        );

        // Copy Constructor
        Watch watch2 = new Watch(watch1);

        watch2.copy(watch1);

        System.out.println(watch1);
        System.out.println(watch2);
        System.out.println();
        System.out.println(watch1.getMake());
        System.out.println(watch1.getModel());
        System.out.println(watch1.getYear());
        System.out.println();
        System.out.println(watch2.getMake());
        System.out.println(watch2.getModel());
        System.out.println(watch2.getYear());
    }
}