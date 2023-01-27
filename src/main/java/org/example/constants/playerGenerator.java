package org.example.constants;

import org.example.playerFactory.player;
import org.example.playerFactory.playerFactory;

public class playerGenerator {
    public final static player humanPlayer = playerFactory.createPlayer("player");
    public final static player computerPlayer = playerFactory.createPlayer("cpu");
}
