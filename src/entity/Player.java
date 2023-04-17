package entity;

import main.GamePanel;
import main.KeyHandler;

import java.awt.Color;
import java.awt.Graphics2D;

import static main.ids.EngineConstants.*;

public class Player extends Entity {
    GamePanel gp;
    KeyHandler keyH;

    int move;

    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
        speed = PLAYER_SPEED;
        runSpeed = PLAYER_RUNNING_SPEED;
    }

    public void update() {
        if (keyH.running) {
            move = PLAYER_RUNNING_SPEED;
        } else {
            move = PLAYER_SPEED;
        }

        if (keyH.upPressed) {
            y -= move;
        } else if (keyH.downPressed) {
            y += move;
        } else if (keyH.leftPressed) {
            x -= move;
        } else if (keyH.rightPressed) {
            x += move;
        }
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.WHITE);
        g2.fillRect(x, y, TILE_SIZE, TILE_SIZE);
    }
}
