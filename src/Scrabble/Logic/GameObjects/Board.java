package Scrabble.Logic.GameObjects;

import java.util.Arrays;

public class Board {
    // 15x15 in size
    // TW = Triple Word
    // DW = Double Word
    // TL = Triple Letter
    // DL = Double Letter
    // BL = Normal/Blank Space

    private static final String[][] BOARD =
            {
                {"TW", "BL", "BL", "DL", "BL", "BL", "BL", "TW", "BL", "BL", "BL", "DL", "BL", "BL", "TW"},
                {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"},
            };
    private char[][] boardContents =
            {
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
                    {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'}
            };

    public Board() {

    }

    public static String[][] getBOARD() {
        return BOARD;
    }

    public char[][] getBoardContents() {
        return boardContents;
    }

    public void setBoardContents(char[][] boardContents) {
        this.boardContents = boardContents;
    }

    public char getBoardAtCoordinate(int x, int y){
        return boardContents[x][y];
    }

    public void setBoardAtCoordinates(int x, int y, char data){
        boardContents[x][y] = data;
    }

    @Override
    public String toString() {
        // TODO should return board contents where contents is not 0,
        //  if contents is 0 then return the board string
        //  format it so that it aligns to a grid
        return "Board{" +
                "boardContents=" + Arrays.toString(boardContents) +
                '}';
    }
}
