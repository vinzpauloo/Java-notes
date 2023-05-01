package package3;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("src/package3/secret_message.txt");

        if(file.exists()){
            System.out.println("That file exists! :O!");
        }
        else {
            System.out.println("That file does NOT exist! :(");
        }
    }
}
