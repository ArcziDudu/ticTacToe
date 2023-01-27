package org.example.Utilities;

import org.example.constants.scores;

import java.util.Scanner;

public class afterEndRoundImpl implements afterEndRound{
    @Override
    public void afterRound(Scanner sc, scoreboard scoreboard) {
        switch (sc.nextLine()){
            case "1" -> {
                resetAll();
                GameLogic.getInstance().initGame();
            }
            case "2" -> scoreboard.showResults();
            case "3" -> sc.close();
        }
    }

    private void resetAll() {
        positionsValidator.resetPositionCheckerBoard();
        gameBoardImpl.resetGameBoard();
        scores.ListForComputerPositions.clear();
        scores.ListForHumanPositions.clear();
    }


}
