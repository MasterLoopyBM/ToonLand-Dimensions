package src.gui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainWindow{
    public static void main(String args[]){
        JFrame myFrame = new JFrame("ToonLand Dimensions");
        myFrame.setSize(640,480);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}