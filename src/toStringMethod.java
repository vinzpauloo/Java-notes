public class toStringMethod {
    public static void tostringmethod(String[] args) {

        // toString()   =   special method that all objects inherit,
        //                  that returns a string that "textually represents" an object.
        //                  can be used both implicitly or explicitly

        Van van = new Van ();

//        System.out.println(van.make);
//        System.out.println(van.color);
//        System.out.println(van.model);
//        System.out.println(van.year);

        // Explicit use
        System.out.println(van.toString());

        // Implicit use
        System.out.println(van);
    }
}