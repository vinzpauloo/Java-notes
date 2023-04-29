public class Wrapper {
    public static void wrapper(String[] args) {

        // wrapper class =  provides a way to use primitive data types to reference data types
        //                  reference data types contain useful methods
        //                  can be used with collections (e.g. ArrayList)

        // Strings are already reference data types

        // primitive        //wrapper
        //----------        //-------
        // boolean          Boolean
        // char             Character
        // int              Integer
        // double            Double



        // autoboxing = the automatic conversion that the Java compiler makes between the primitive data types and their corresponding wrapper class
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        if(b== '@'){
            System.out.println("This is true");
        }
    }
}