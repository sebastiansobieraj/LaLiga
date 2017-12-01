package com.kodilla.laliga;

import java.util.ArrayList;
import java.util.Collections;

public class Table {
    public void table() {
        Team team0 = new Team("FC Barcelona", 13, 35, 11, 2, 0, 34,
                5);
        Team team1 = new Team("Valencia CF", 13, 31, 9, 4, 0, 33,
                12);
        ArrayList<Team> footbal = new ArrayList<Team>();
        footbal.add(team0);
        footbal.add(team1);

        Collections.sort(footbal);

        for (int i = 0; i < footbal.size(); i++) {
            System.out.println(i+1 + " " + footbal.get(i));
        }
    }
}
