import java.io.File;

public  class FileClass {
    public static void fileclass(String[] args) {

        // file =   An abstract representation of file and directory pathnames

        File file = new File("src/package3/Girl7.jpg");

        if (file.exists()) {
            System.out.println("That file exists! :O!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else {
            System.out.println("That file doesn't exist :(");
        }
    }
}