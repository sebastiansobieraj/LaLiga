package com.kodilla.laliga;

import java.util.Scanner;

public class Choice {
    Scanner choice = new Scanner(System.in);
    Table laLiga = new Table();
    public void getChoice (){
        System.out.println("Jeżeli chcesz wyświetlić aktualną tabelę LaLiga wpisz: 1");
        if(choice.nextInt() == 1){
            laLiga.table();
        }
    }
}
