package com.kodilla.laliga;

import java.util.*;

public class Team implements Comparable {
    String teamName;
    int games;
    int points;
    int wins;
    int draws;
    int loses;
    int goalsScored;
    int goalsLoses;
    int balance = goalsScored - goalsLoses;

    public Team(String teamName, int games, int points, int wins, int draws, int loses, int goalsScored, int goalsLoses) {
        this.teamName = teamName;
        this.games = games;
        this.points = points;
        this.wins = wins;
        this.draws = draws;
        this.loses = loses;
        this.goalsScored = goalsScored;
        this.goalsLoses = goalsLoses;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGames() {
        return games;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getLoses() {
        return loses;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getGoalsLoses() {
        return goalsLoses;
    }

    public int getBalance() {
        return goalsScored - goalsLoses;

    }

    @Override
    public String toString() {
        return getTeamName() + ", mecze: " + getGames() + ", punkty: " + getPoints() + ", zwycięstwa: " + getWins()
                + ", remisy: " + getDraws() + ", porażki: " + getLoses() + ", strzel.: " + getGoalsScored() + ", strac.: "
                + getGoalsLoses() + ", bilans: " + getBalance();
    }

    @Override
    public int compareTo(Object o) {
        int comparePoints = ((Team) o).getPoints();
        return comparePoints - this.points;
    }
}
