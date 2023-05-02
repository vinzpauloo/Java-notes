import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){

        this.setTitle("JFrame title goes here: Haha"); // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // prevent frame from being resized
        this.setSize(420, 420); // sets the x-dimension, and y-dimension
        this.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("src/Girl8.jpg"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(0,0,0)); //change color of background
    }
}
