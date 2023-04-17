package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static main.ids.Controls.*;

public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed, running;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == FORWARDS) {
            upPressed = true;
        }

        if (code == BACKWARDS) {
            downPressed = true;
        }

        if (code == LEFT) {
            leftPressed = true;
        }

        if (code == RIGHT) {
            rightPressed = true;
        }

        if (code == RUN) {
            running = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == FORWARDS) {
            upPressed = false;
        }

        if (code == BACKWARDS) {
            downPressed = false;
        }

        if (code == LEFT) {
            leftPressed = false;
        }

        if (code == RIGHT) {
            rightPressed = false;
        }

        if (code == RUN) {
            running = false;
        }
    }
}
