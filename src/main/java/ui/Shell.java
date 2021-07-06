package ui;

import javax.swing.*;
import java.awt.*;

public class Shell {
    public void displayWindow() {
        JPanel emptyLabel = new JPanel(new BorderLayout());
        JFrame frame = new JFrame("Algorithm Visualiser");

        frame.setBounds(10,10,1000,700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
