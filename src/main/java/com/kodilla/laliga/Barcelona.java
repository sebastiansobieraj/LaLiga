package com.kodilla.laliga;

public class Barcelona {
    String clubName = "Barcelona";
    int pktBarcelona = 35;
    int gamesBarcelona = 13;
    int winsBarcelona = 11;
    int losesBarcelona = 0;
    int drawsBarcelona = 2;
    int goals = 34;
    int goalsLost = 5;
    int balance = goals - goalsLost;

    public Barcelona(String clubName, int pktBarcelona, int gamesBarcelona, int winsBarcelona, int losesBarcelona,
                     int drawsBarcelona, int goals, int goalsLost, int balance) {
        this.clubName = clubName;
        this.pktBarcelona = pktBarcelona;
        this.gamesBarcelona = gamesBarcelona;
        this.winsBarcelona = winsBarcelona;
        this.losesBarcelona = losesBarcelona;
        this.drawsBarcelona = drawsBarcelona;
        this.goals = goals;
        this.goalsLost = goalsLost;
        this.balance = balance;
    }

    public String getClubName() {
        return clubName;
    }

    public int getPktBarcelona() {
        return pktBarcelona;
    }

    public int getGamesBarcelona() {
        return gamesBarcelona;
    }

    public int getWinsBarcelona() {
        return winsBarcelona;
    }

    public int getLosesBarcelona() {
        return losesBarcelona;
    }

    public int getDrawsBarcelona() {
        return drawsBarcelona;
    }

    public int getGoals() {
        return goals;
    }

    public int getGoalsLost() {
        return goalsLost;
    }

    public int getBalance() {
        return balance;
    }
}
