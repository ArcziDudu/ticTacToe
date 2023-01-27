package org.example.Utilities;

import java.util.HashMap;
import java.util.Map;


public class scoreboardImpl implements scoreboard {
    Map<String, Integer> results = new HashMap<>();
    @Override
    public void saveResult(int result, String playerName) {

        results.put(playerName, result);

    }
    @Override
    public void showResults() {
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}
