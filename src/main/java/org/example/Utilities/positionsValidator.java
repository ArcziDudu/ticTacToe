package org.example.Utilities;

import org.example.constants.playerGenerator;

import java.util.Arrays;
import java.util.Random;

public final class positionsValidator {
     static   boolean[] positionCheckerBoard = new boolean[9];
    static void resetPositionCheckerBoard() {
        Arrays.fill(positionCheckerBoard, false);
    }
    static boolean controlOfSelectedPosition(int positionChosenByHuman) {
        //if the selected field is different from 1 - 9 it returns false
        if (positionChosenByHuman < 1 || positionChosenByHuman > 9) {
            System.out.println("Error! Choose field from 1 to 9:");
            return true;
        }
        return false;
    }

     static boolean checkingIfTheSameFieldsAreNotSelected(int positionChosenByHuman) {

            int positionChosenByCpu;
            if (tryToSelectTheSameField(positionChosenByHuman)) {
                return true;
            }
                playerGenerator.humanPlayer.makeMove(positionChosenByHuman);
                positionCheckerBoard[positionChosenByHuman - 1] = true;

                do {
                    positionChosenByCpu = new Random().nextInt(9)+1;
                } while (positionCheckerBoard[positionChosenByCpu-1]);

                playerGenerator.computerPlayer.makeMove(positionChosenByCpu);
            positionCheckerBoard[positionChosenByHuman - 1] = true;
                return false;

        }
        private static boolean tryToSelectTheSameField ( int humanPosition){

            if (positionsValidator.positionCheckerBoard[humanPosition - 1]) {
                System.out.println("This position is already taken, please choose another one.");
                return true;
            }
            return false;
        }
    }
