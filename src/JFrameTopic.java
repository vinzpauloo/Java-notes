public class JFrameTopic {
    public static void main(String[] args) {

        // JFrame = a GUI window to add components to

//        JFrame frame = new JFrame(); // creates a frame;
//
//        frame.setTitle("JFrame title goes here"); // sets title of frame
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//        frame.setResizable(false); // prevent frame from being resized
//        frame.setSize(420, 420); // sets the x-dimension, and y-dimension
//        frame.setVisible(true); // make frame visible
//
//        ImageIcon image = new ImageIcon("src/Girl8.jpg"); //create an ImageIcon
//        frame.setIconImage(image.getImage()); //change icon of frame
//        frame.getContentPane().setBackground(new Color(0,0,0)); //change color of background

        // If we need to make changes
        MyFrame myFrame = new MyFrame();

        // If not
        new MyFrame();

    }
}