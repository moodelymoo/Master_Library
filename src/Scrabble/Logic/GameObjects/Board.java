package Scrabble.Logic.GameObjects;

import java.util.Arrays;

public class Board {
    // 15x15 in size
    // TW = Triple Word
    // DW = Double Word
    // TL = Triple Letter
    // DL = Double Letter
    // BL = Normal/Blank Space

    // TODO migrate to an overridable dynamic board size to allow for custom boards

    private static final String[][] BOARD =
            {
                    {"TW", "BL", "BL", "DL", "BL", "BL", "BL", "TW", "BL", "BL", "BL", "DL", "BL", "BL", "TW"},
                    {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"},
                    //
                    {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"},
                    {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"},
                    {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"},
                    {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"},
                    {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"},
                    {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"},
                    {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"},
                    {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"},
                    {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"},
                    {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"},
                    {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"},
                    {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"},
                    {"BL", "DW", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "TL", "BL", "BL", "BL", "DW", "BL"}

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


    private String[][] out;

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

    public char getBoardAtCoordinate(int x, int y) {
        return boardContents[x][y];
    }

    public void setBoardAtCoordinates(int x, int y, char data) {
        boardContents[x][y] = data;
    }

    @Override
    public String toString() {
        this.out = genPrintBoard();
        return "Board{\n" +
                Arrays.deepToString(out[0]) + "\n" +
                Arrays.deepToString(out[1]) + "\n" +
                Arrays.deepToString(out[2]) + "\n" +
                Arrays.deepToString(out[3]) + "\n" +
                Arrays.deepToString(out[4]) + "\n" +
                Arrays.deepToString(out[5]) + "\n" +
                Arrays.deepToString(out[6]) + "\n" +
                Arrays.deepToString(out[7]) + "\n" +
                Arrays.deepToString(out[8]) + "\n" +
                Arrays.deepToString(out[9]) + "\n" +
                Arrays.deepToString(out[10]) + "\n" +
                Arrays.deepToString(out[11]) + "\n" +
                Arrays.deepToString(out[12]) + "\n" +
                Arrays.deepToString(out[13]) + "\n" +
                Arrays.deepToString(out[14]) + "\n}";

        //TODO fix so it wont break with a non 15x15 board
        //TODO force alignment to 2 chars wide or make FX interface with pics
    }

    private String[][] genPrintBoard(){
        String[][] out = new String[15][15];
        for (int i = 0; i < this.boardContents.length; i++) {
            for (int j = 0; j < this.boardContents[0].length; j++) {
                if (getBoardAtCoordinate(i, j) == '0'){
                    out[i][j] = BOARD[i][j];
                }
                else{
                    out[i][j] = String.valueOf(getBoardAtCoordinate(i, j));
                }
            }
        }
        return out;
    }

    public String[][] getOut() {
        return out;
    }

    public void setOut(String[][] out) {
        this.out = out;
    }

}
