import javax.swing.*;
import java.awt.*;

public class JPanelsTopic {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components

        // setBounds = set x, y position within frame as well as dimensions, but we need to set the frame.setLayout(null)
        // no layout manager does not require setVerticalAlignment and setHorizontalAlignment

        ImageIcon icon = new ImageIcon("src/Girl8.jpg");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
//        label.setVerticalAlignment(JLabel.BOTTOM);
//        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,75,75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
//        redPanel.setLayout(new BorderLayout());
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
//        bluePanel.setLayout(new BorderLayout());
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
//        greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        redPanel.add(label); // adds the image on the chosen panel
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        frame.setVisible(true);
    }
}