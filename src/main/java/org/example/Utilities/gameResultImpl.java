package org.example.Utilities;

import org.example.constants.scores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class gameResultImpl implements gameResult{
    private final List topRow = Arrays.asList(1, 2, 3);
    private final List middleRow = Arrays.asList(4, 5, 6);
    private final List bottomRow = Arrays.asList(7, 8, 9);
    private final List leftCols = Arrays.asList(1, 4, 7);
    private final List middleCols = Arrays.asList(2, 5, 8);
    private final List rightCols = Arrays.asList(3, 6, 9);
    private final List crossFromLeft = Arrays.asList(1, 5, 9);
    private final List crossFromRight = Arrays.asList(3, 5, 7);


    private int humanWin = 0;
    private int computerWin = 0;
   scoreboard scoreboard = new scoreboardImpl();

    @Override
    public boolean checkForWin() {
        List<List> winnerList = new ArrayList<>();
        winnerList.add(topRow);
        winnerList.add(middleRow);
        winnerList.add(bottomRow);
        winnerList.add(leftCols);
        winnerList.add(middleCols);
        winnerList.add(rightCols);
        winnerList.add(crossFromRight);
        winnerList.add(crossFromLeft);

        for (List list : winnerList) {
            if(new HashSet<>(scores.ListForHumanPositions).containsAll(list)){
                System.out.println("Human win !");
                humanWin++;
                scoreboard.saveResult(humanWin,"Human");
                return true;

            }else if ((new HashSet<>(scores.ListForComputerPositions).containsAll(list))) {
                System.out.println("Computer Win!");
                computerWin++;
                scoreboard.saveResult(computerWin,"Computer");
                return true;
            }
        }
        return false;
    }

}
