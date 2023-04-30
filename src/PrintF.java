public class PrintF {
    public static void printf(String[] args) {

        // printf() =   an optional method to control, format, and display text to the console window
        //              two arguments = format string + (object/variable/value)
        //              % [flags] [precision] [width] [conversion-character]

        // decimal/integers
        //System.out.printf("%d This is a format string",123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 2;
        double myDouble = 1000;

        //System.out.printf("%b This is a boolean format string", true);
        //System.out.printf("%c",myChar);
        // System.out.printf("%s",myString);
        // System.out.printf("%d",myInt);
        //System.out.printf("%f",myDouble);

        //[width]
        // minimum number of characters to be written as output
        // System.out.printf("Hello %s. ", myString);

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        // Floats or Doubles
        //  System.out.printf("You have this much money %.2f ",myDouble);

        //[flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        System.out.printf("You have this much money %,f ",myDouble);
    }
}