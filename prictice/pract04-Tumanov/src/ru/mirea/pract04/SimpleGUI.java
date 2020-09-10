package ru.mirea.pract04;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    int milan_num=0;
    int madrid_num =0;
    private JButton milan = new JButton("AC Milan");
    private JButton madrid = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result: 0 X 0");
    private JLabel score = new JLabel("Last Scorer: N/A");
    private Label winner = new Label("Winner: DRAW");

    public  SimpleGUI(){
        super("Football Match");
        this.setBounds(500,300,600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container_label = this.getContentPane();
        Container container_button = this.getContentPane();
        container_label.setLayout(new GridLayout(1,3,0,0));
        container_button.setLayout(new GridLayout(2,2,0,0));
        container_label.add(score);
        container_label.add(result);
        container_label.add(winner);
        container_button.add(milan);
        container_button.add(madrid);

        milan.addActionListener(new Millan_ButtonEventListener());
        madrid.addActionListener(new Madrid_ButtonEventListener());

    }

    public void changes(String team){
        score.setText("Last Scorer: "+ team);
        result.setText("Result: "+ milan_num +" X "+ madrid_num);
        if(madrid_num>milan_num){
            winner.setText("Winner: Real Madrid");
        }
        else if(madrid_num<milan_num){
            winner.setText("Winner: AC Milan");
        }
        else{
            winner.setText("Winner: DRAW");
        }
    }

    class Millan_ButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            milan_num++;
            changes("AC Milan");
        }
    }
    class Madrid_ButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            madrid_num++;
            changes("Real Madrid");
        }
    }
}
