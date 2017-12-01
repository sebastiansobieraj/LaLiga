package com.kodilla.laliga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.kodilla.laliga.Barcelona;
import com.kodilla.laliga.RealMadryt;

import java.util.ArrayList;

@SpringBootApplication
public class LaligaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaligaApplication.class, args);
	}
	Barcelona fcb = new Barcelona("FC Barcelona", 35, 13, 11,
			0, 2, 34, 5, 29);
	RealMadryt realMadryt = new RealMadryt("Real Madryt", 27, 13, 8,
			2, 3, 25, 11, 14);
	        Table table = new Table();
	ArrayList<Barcelona> LaLiga = new ArrayList<Barcelona>();

//        HashMap<Integer, Table> liga = new HashMap<Integer, Table>();
}
