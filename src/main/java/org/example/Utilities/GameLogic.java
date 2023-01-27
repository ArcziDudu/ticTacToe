package org.example.Utilities;

import java.util.Scanner;

public class GameLogic {
    private static GameLogic instance;

    private GameLogic() {
    }

    public static GameLogic getInstance() {
        if (instance == null) {
            instance = new GameLogic();
        }
        return instance;
    }

    public void initGame() {
        Scanner scannerForInputs = new Scanner(System.in);
        String symbolChosenByHuman;

        do {
            System.out.println("Choose symbol for human player: x or o:");
            symbolChosenByHuman = scannerForInputs.next().toUpperCase();
            if (!symbolChosenByHuman.equals("X") && !symbolChosenByHuman.equals("O")) {
                System.err.printf("Error ! Chose x or o ! you select [%s] \n", symbolChosenByHuman);
            }
        } while (!symbolChosenByHuman.equals("X") && !symbolChosenByHuman.equals("O"));
        checkingIfSymbolHasBeenSelectedThenStartGame(symbolChosenByHuman);
    }


    private void checkingIfSymbolHasBeenSelectedThenStartGame(String symbolChosenByHuman) {
        if (symbolChosenByHuman.equals("X") || symbolChosenByHuman.equals("O")) {
            String symbolChosenByComputer = symbolChosenByHuman.equals("X") ? "O" : "X";

            System.out.println("Human symbol: " + symbolChosenByHuman + " Computer symbol: " + symbolChosenByComputer);
        }
    }

}
