package org.example.playerFactory;

import org.example.Utilities.gameBoardImpl;
import org.example.constants.playerGenerator;
import org.example.constants.scores;

public class humanPlayer implements player {
    private String symbol;

        @Override
        public void makeMove(int positionChosenByPlayer) {

            switch (positionChosenByPlayer) {
                case 1 -> gameBoardImpl.gameBoardArray[0][0] = symbol;
                case 2 -> gameBoardImpl.gameBoardArray[0][2] = symbol;
                case 3 -> gameBoardImpl.gameBoardArray[0][4] = symbol;
                case 4 -> gameBoardImpl.gameBoardArray[2][0] = symbol;
                case 5 -> gameBoardImpl.gameBoardArray[2][2] = symbol;
                case 6 -> gameBoardImpl.gameBoardArray[2][4] = symbol;
                case 7 -> gameBoardImpl.gameBoardArray[4][0] = symbol;
                case 8 -> gameBoardImpl.gameBoardArray[4][2] = symbol;
                case 9 -> gameBoardImpl.gameBoardArray[4][4] = symbol;
            }
            scores.ListForHumanPositions.add(positionChosenByPlayer);
        }


    @Override
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
