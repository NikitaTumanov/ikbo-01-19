package ru.mirea.pract06;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Frame {

    public static void createGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton northButton = new JButton("NORTH (PAGE_START)");
        panel.add(northButton, BorderLayout.NORTH);

        JButton southButton = new JButton("SOUTH (PAGE_END)");
        panel.add(southButton, BorderLayout.SOUTH);

        JButton eastButton = new JButton("EAST (LINE_START)");
        panel.add(eastButton, BorderLayout.EAST);

        JButton westButton = new JButton("WEST (LINE_END)");
        panel.add(westButton, BorderLayout.WEST);

        JButton centerButton = new JButton("CENTER");
        panel.add(centerButton, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(550, 300));

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        northButton.addActionListener(new NorthButtonEventListener());
        southButton.addActionListener(new SouthButtonEventListener());
        eastButton.addActionListener(new EastButtonEventListener());
        westButton.addActionListener(new WestButtonEventListener());
        centerButton.addActionListener(new CenterButtonEventListener());
    }

    static class NorthButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JFrame frame1 = new JFrame("Message");
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           JOptionPane.showMessageDialog(frame1, "Добро пожаловать в Медина");
        }
    }

    static class SouthButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JFrame frame1 = new JFrame("Message");
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(frame1, "Добро пожаловать Абха");
        }
    }

    static class EastButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JFrame frame1 = new JFrame("Message");
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(frame1, "Добро пожаловать в Дахране");
        }
    }

    static class WestButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JFrame frame1 = new JFrame("Message");
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(frame1, "Добро пожаловать в Джедда");
        }
    }

    static class CenterButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JFrame frame1 = new JFrame("Message");
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(frame1, "Добро пожаловать в Эр-Рияд");
        }
    }


}
