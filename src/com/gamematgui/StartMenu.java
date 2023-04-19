package com.gamematgui;

import javax.swing.*;

public class StartMenu{

    public StartMenu(){
        JFrame frame = new JFrame("Game Math GUI");

        frame.setSize(600, 400);
        frame.setResizable(true);
        frame.setLocation(3260, 1730);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Witaj!");;
        label.setLocation(10, 10);

        panel.add(label);
        frame.add(panel);

        frame.setVisible(true);

    }
}
