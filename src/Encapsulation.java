public class Encapsulation {
    public static void encapsulation(String[] args) {

        // Encapsulation =  attributes of a class will be hidden or private,
        //                  can be accessed only through methods (getters & setters)
        //                  You should make attributes private if you don't have a reason to make them public

        House house = new House(
                "2 floors",
                "big model",
                2023
        );

//        house.setYear(2019);

        house.setMake("HAHAHA");
        house.setModel("HEHEHEHE");

        System.out.println(house.getModel());
        System.out.println(house.getMake());
        System.out.println(house.getYear());


    }
}