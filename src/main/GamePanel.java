package main;

import javax.swing.JPanel;
import java.awt.Dimension;

import static main.ids.EngineConstants.*;

public class GamePanel extends JPanel {
    public GamePanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(BACKGROUND);
        this.setDoubleBuffered(DOUBLE_BUFFERED);
    }
}
