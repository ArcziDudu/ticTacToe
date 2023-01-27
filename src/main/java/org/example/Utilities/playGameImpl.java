package org.example.Utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class playGameImpl implements playGame {
    gameBoard gameBoard = new gameBoardImpl();
    gameResult gameResult = new gameResultImpl();
    private final afterEndRound afterEndRound = new afterEndRoundImpl();
    scoreboard scoreboard = new scoreboardImpl();

    @Override
    public void playGame() {
        Scanner inputScanner = new Scanner(System.in);
        int positionChosenByHuman;
        do {
            System.out.println("Choose field from 1 to 9:");
            try {
                positionChosenByHuman = inputScanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error! Choose field from 1 to 9:");
                inputScanner.next();
                continue;
            }
            if (positionsValidator.controlOfSelectedPosition(positionChosenByHuman)) continue;
            if (positionsValidator.checkingIfTheSameFieldsAreNotSelected(positionChosenByHuman)) continue;
            gameBoard.printBoard();
            boolean b = gameResult.checkForWin();
           while (b){
              afterEndRound.afterRound(inputScanner, scoreboard);
           }
        } while (true);
    }


}
