public class OverloadedConstructors {
    public static void overloadedconstructors(String[] args) {
        // overloaded constructors =    multiple constructors within a class with the same name,
        //                              but have different parameters
        //                              name + parameters = signature

        Pizza pizza = new Pizza(
        );

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);


    }
}