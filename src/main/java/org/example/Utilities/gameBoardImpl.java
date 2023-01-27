package org.example.Utilities;

public class gameBoardImpl implements gameBoard{
    public static   String[][] gameBoardArray = {
            {" ", "|", " ", "|", " "},
            {"-", "+", "-", "+", "-"},
            {" ", "|", " ", "|", " "},
            {"-", "+", "-", "+", "-"},
            {" ", "|", " ", "|", " "}};

    @Override
    public void printBoard() {
        for (String[] strings : gameBoardArray) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }

    public String[][] getGameBoardArray() {
        return gameBoardArray;
    }


    public static void resetGameBoard() {
        gameBoardArray = new String[][]{{" ", "|", " ", "|", " "},
                {"-", "+", "-", "+", "-"},
                {" ", "|", " ", "|", " "},
                {"-", "+", "-", "+", "-"},
                {" ", "|", " ", "|", " "}};
    }
}
