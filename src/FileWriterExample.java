import java.io.IOException;
import java.io.FileWriter;


public  class FileWriterExample {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter writer = new FileWriter("src/poem.txt");
            writer.write("Roses are red\nViolets are blue\nBooty booty booty booty\nRocking' everywhere");
            writer.append("\n(A poem by Bro)");
            writer.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }


    }
}