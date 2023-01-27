package org.example.playerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class playerFactory {
    private static final Map<String, Supplier<player>> PLAYERS_MAP = new HashMap<>();

    static {
        PLAYERS_MAP.put("player", humanPlayer::new);
        PLAYERS_MAP.put("cpu", computerPlayer::new);
    }

    public static player createPlayer(String player) {
        return Optional.of(PLAYERS_MAP.get(player))
                .map(Supplier::get)
                .orElseThrow(() -> new RuntimeException("player doesnt exist!"));
    }
}
