package main.ids;

import java.awt.Color;

public class EngineConstants {

    /**
     * -----------------------------------------------------------------------------------------------------------------
     * GENERAL SETTINGS
     */
    public static final String GAMETITLE = "JPGE"; //The title of the game window

    public static final int FPS = 60;

    public static final int PLAYER_SPEED = 4;

    /**
     * -----------------------------------------------------------------------------------------------------------------
     * GENERATION SETTINGS
     */
    public static final int GEN1 = 1;
    public static final int GEN2 = 2;
    public static final int GEN3 = 3;

    public static final int GENERATION = GEN1; // The Generation style

    /**
     * -----------------------------------------------------------------------------------------------------------------
     * SCREEN SETTINGS
     */
    public static final int ORIGINAL_TILE_SIZE = 16; // Tile size
    public static final int TILE_SCALE = 3; // Scale factor for enlargement of tiles

    public static final int TILE_SIZE = ORIGINAL_TILE_SIZE * TILE_SCALE; // Actual size of tiles when they are on screen

    public static final int MAX_SCREEN_COL = 16; // Number of tiles allowed on screen horizontally
    public static final int MAX_SCREEN_ROW = 12; // Number of tiles allowed on screen vertically

    public static final int SCREEN_WIDTH = TILE_SIZE * MAX_SCREEN_COL; // Default: 768 pixels
    public static final int SCREEN_HEIGHT = TILE_SIZE * MAX_SCREEN_ROW; // Default: 576 pixels

    public static final Color BACKGROUND = Color.BLACK; // The background for the GamePanel

    public static final boolean DOUBLE_BUFFERED = true; // Whether the GamePanel is Double Buffered.
}
