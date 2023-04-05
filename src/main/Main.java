package main;

import javax.swing.JFrame;

import static main.ids.EngineConstants.GAMETITLE;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle(GAMETITLE);

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
