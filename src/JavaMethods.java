
public class JavaMethods {
    public static void javamethods(String[] args) {

        // method = a block of code that is executed whenever it is called upon

        String name = "BRO";
        int age = 21;
        hello(name, age);

        int x = 3;
        int y = 4;

        int z = add(x,y);
        System.out.println(z);

        System.out.println("Another way:"+add(x,y));
    }

    static void hello(String name, Integer age) {
        System.out.println("HELLO "+name+" you are "+age+" years old.");
    }

    static int add(int x, int y){

        int z = x + y;

        return z;
    }
}