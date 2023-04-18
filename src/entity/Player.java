package entity;

import main.GamePanel;
import main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

import static main.ids.EngineConstants.*;

public class Player extends Entity {
    GamePanel gp;
    KeyHandler keyH;

    int move;

    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
        speed = PLAYER_SPEED;
        runSpeed = PLAYER_RUNNING_SPEED;
        direction = PLAYER_STARTING_DIRECTION;
    }

    public void getPlayerImage() {
        try {
            upIdle = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/gen1/red/overworld/player/idle_backwards.png")));
            downIdle = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/gen1/red/overworld/player/idle_forwards.png")));
            leftIdle = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/gen1/red/overworld/player/idle_left.png")));
            rightIdle = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/gen1/red/overworld/player/idle_right.png")));
            up1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/gen1/red/overworld/player/walk_backwards_1.png")));
            up2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/gen1/red/overworld/player/walk_backwards_2.png")));
            down1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/gen1/red/overworld/player/walk_forwards_1.png")));
            down2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/gen1/red/overworld/player/walk_forwards_2.png")));
            left1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/gen1/red/overworld/player/walk_left_1.png")));
            left2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/gen1/red/overworld/player/walk_left_2.png")));
            right1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/gen1/red/overworld/player/walk_right_1.png")));
            right2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/gen1/red/overworld/player/walk_right_2.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        if (keyH.upPressed) {
            direction = "up";
            if (keyH.running) {
                move = PLAYER_RUNNING_SPEED;
            } else {
                move = PLAYER_SPEED;
            }
            y -= move;
        } else if (keyH.downPressed) {
            direction = "down";
            if (keyH.running) {
                move = PLAYER_RUNNING_SPEED;
            } else {
                move = PLAYER_SPEED;
            }
            y += move;
        } else if (keyH.leftPressed) {
            direction = "left";
            if (keyH.running) {
                move = PLAYER_RUNNING_SPEED;
            } else {
                move = PLAYER_SPEED;
            }
            x -= move;
        } else if (keyH.rightPressed) {
            direction = "right";
            if (keyH.running) {
                move = PLAYER_RUNNING_SPEED;
            } else {
                move = PLAYER_SPEED;
            }
            x += move;
        }

        spriteCounter++;
        if (spriteCounter > 10) {
            if (spriteNumber == 1) {
                spriteNumber = 2;
            } else if (spriteNumber == 2) {
                spriteNumber = 1;
            }
            spriteCounter = 0;
        }
    }

    public void draw(Graphics2D g2) {
        BufferedImage image = null;

        switch (direction) {
            case "up" -> {
                if (spriteNumber == 1) {
                    image = up1;
                } else if (spriteNumber == 2) {
                    image = up2;
                }
            }
            case "down" -> {
                if (spriteNumber == 1) {
                    image = down1;
                } else if (spriteNumber == 2) {
                    image = down2;
                }
            }
            case "left" -> {
                if (spriteNumber == 1) {
                    image = left1;
                } else if (spriteNumber == 2) {
                    image = left2;
                }
            }
            case "right" -> {
                if (spriteNumber == 1) {
                    image = right1;
                } else if (spriteNumber == 2) {
                    image = right2;
                }
            }
        }
        ;

        g2.drawImage(image, x, y, TILE_SIZE, TILE_SIZE, null);
    }
}
