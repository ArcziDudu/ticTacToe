package org.example.Utilities;

public class gameBoardImpl implements gameBoard{
    public static String[][] gameBoardArray = {{" ", "|", " ", "|", " "},
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
    @Override
    public void resetGameBoard() {
        gameBoardArray = new String[][]{{" ", "|", " ", "|", " "},
                {"-", "+", "-", "+", "-"},
                {" ", "|", " ", "|", " "},
                {"-", "+", "-", "+", "-"},
                {" ", "|", " ", "|", " "}};
    }
}
