package com.kodilla.laliga;

public class RealMadryt {
    String clubName = "Real Madryt";
    int pktRealMadryt = 27;
    int gamesRealMadryt = 13;
    int winsRealMadryt = 8;
    int losesRealMadryt = 2;
    int drawsRealMadryt = 3;
    int goals = 25;
    int goalsLost = 11;
    int balance = goals - goalsLost;

    public RealMadryt(String clubName, int pktRealMadryt, int gamesRealMadryt, int winsRealMadryt, int losesRealMadryt,
                      int drawsRealMadryt, int goals, int goalsLost, int balance) {
        this.clubName = clubName;
        this.pktRealMadryt = pktRealMadryt;
        this.gamesRealMadryt = gamesRealMadryt;
        this.winsRealMadryt = winsRealMadryt;
        this.losesRealMadryt = losesRealMadryt;
        this.drawsRealMadryt = drawsRealMadryt;
        this.goals = goals;
        this.goalsLost = goalsLost;
        this.balance = balance;
    }

    public String getClubName() {
        return clubName;
    }

    public int getPktRealMadryt() {
        return pktRealMadryt;
    }

    public int getGamesRealMadryt() {
        return gamesRealMadryt;
    }

    public int getWinsRealMadryt() {
        return winsRealMadryt;
    }

    public int getLosesRealMadryt() {
        return losesRealMadryt;
    }

    public int getDrawsRealMadryt() {
        return drawsRealMadryt;
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
