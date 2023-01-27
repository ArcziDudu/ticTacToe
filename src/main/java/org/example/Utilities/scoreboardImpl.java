package org.example.Utilities;

import java.util.HashMap;
import java.util.Map;



public class scoreboardImpl implements scoreboard {
     static Map<String, Integer> results = new HashMap<>();
    gameBoardImpl gameBoard = new gameBoardImpl();

    @Override
    public void saveResult(int result, String playerName) {
        results.put(playerName, result);
    }
    @Override
    public void showResults(){
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public boolean checkTie() {
            int filledSpaces = 0;
            for (int i = 0; i < gameBoard.getGameBoardArray().length; i++) {
                for (int j = 0; j < gameBoard.getGameBoardArray()[i].length; j++) {
                    if (!gameBoard.getGameBoardArray()[i][j].equals(" ")) {
                        filledSpaces++;
                    }
                }
            }
            return filledSpaces == 9;
        }

}
