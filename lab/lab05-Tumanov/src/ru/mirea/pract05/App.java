package ru.mirea.pract05;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.imageio.ImageIO;

public class App {
    public static void main(String[] args) throws IOException {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Вариант заданий: 2");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(720, 940);

        BufferedImage image = ImageIO.read(new File("image.png"));
        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        };

        frame.add(pane);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
