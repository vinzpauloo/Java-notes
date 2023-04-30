public class ConstructorTopic {
    public static void constructortopic(String[] args) {

        // constructor = special method that is called when an object is instantiated (created)

        // allows us to create objects that have varying attributes

        Human human = new Human(
                "Vincent",
                23,
                32
        );

        Human human2 = new Human(
                "Evita",
                35,
                42
        );

        System.out.println(human.name);
        System.out.println(human2.name);
        human2.eat();
        human.drink();



    }
}