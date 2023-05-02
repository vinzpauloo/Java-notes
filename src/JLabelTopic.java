import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabelTopic {
    public static void main(String[] args) {

        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("src/Girl8.jpg");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); //create a label
        label.setText("Bro, do you even code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER,RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.CENTER); // set text TOP,CENTER,BOTTOM of imageicon
        label.setForeground(new Color(0, 0,0)); // set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); // set font of text
        label.setIconTextGap(-25); // set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display the background color
        label.setBorder(border); // sets a border
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
        //label.setBounds(100, 100, 250,250); // set x, y position within frame as well as dimensions, but we need to set the frame.setLayout(null)


        JFrame frame = new JFrame();
        frame.setTitle("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.add(label); // Adding should always be before the setVisible


        frame.pack(); // Add all elements first before pack
        frame.setVisible(true);
    }
}