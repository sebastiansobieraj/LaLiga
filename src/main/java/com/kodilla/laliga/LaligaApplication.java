package com.kodilla.laliga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication

public class LaligaApplication {

    public static void main(String[] args) {
        Choice menu = new Choice();
        menu.getChoice();
    }
}