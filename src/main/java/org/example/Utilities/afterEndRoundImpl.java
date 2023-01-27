package org.example.Utilities;

import org.example.constants.scores;

import java.util.Scanner;

public class afterEndRoundImpl implements afterEndRound{
    scoreboard scoreboard = new scoreboardImpl();
    @Override
    public void afterRound(Scanner sc) {
        System.out.println("1 -> new game");
        System.out.println("2 -> show score board");
        System.out.println("3 -> exit");
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
        gameBoardImpl.resetGameBoard();
        scores.ListForComputerPositions.clear();
        scores.ListForHumanPositions.clear();
    }


}
