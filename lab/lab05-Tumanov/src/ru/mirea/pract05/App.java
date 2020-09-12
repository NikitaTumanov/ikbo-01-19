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
    public static void main(String[] args) throws IOException, InterruptedException {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Вариант заданий: 2");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(720, 940);

        BufferedImage image = ImageIO.read(new File("image.png"));
        BufferedImage image1 = ImageIO.read(new File("image1.png"));
        BufferedImage image2 = ImageIO.read(new File("image2.png"));

        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        };
        JPanel pane1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image1, 0, 0, null);
            }
        };
        JPanel pane2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image2, 0, 0, null);
            }
        };

        while(true){
            show(frame,pane2);
            show(frame,pane);
            show(frame,pane1);
            show(frame,pane);
        }

    }

    public static void show(JFrame frame, JPanel pane) throws InterruptedException {
        frame.add(pane);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        Thread.sleep(800);
        frame.setVisible(false);
        frame.remove(pane);
    }
}