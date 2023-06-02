package io.datajek.springmvc.tennisplayerwebs;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PlayerService {
    private List<Player> players = Arrays.asList(
            new Player(1, "Prince", "India", new Date(1991-01-01), 81),
            new Player(2, "Yash", "USA", new Date(1990-01-01), 10),
            new Player(3, "Thowsin", "USA", new Date(1992-01-01), 15)
    );

    public Player getPlayerByName(String name){
        return players.stream().filter(p -> p.getName().equals(name)).findFirst().get();
    }
}
