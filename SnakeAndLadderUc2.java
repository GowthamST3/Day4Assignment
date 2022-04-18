package com.bridgelabz;

public class SnakeAndLadderUc2 {

	static final int START_POSITION = 0;

    public static void main(String[] args) {
        // welcome to snake ladder program.
        System.out.println("Welcome to snake ladder game");
        System.out.println("Player will start from zero position.");

        int diceRolling = (int) Math.floor(Math.random() * 10) % 7;
        if (diceRolling == 0) {
            diceRolling = diceRolling + 1;

        }
        System.out.println("Number on die is: " + diceRolling);
    }

    
	}


