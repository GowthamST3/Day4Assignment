package com.bridgelabz;

public class SnakeAndLadderUc4 {
	
	static final int START_POSITION = 0;

    public static void main(String args[])
	
	{

	  // welcome to snake ladder program.
	
	int currentPlayerPosition = 0;
    int position = 0;

    System.out.println("Welcome to snake ladder game");
    System.out.println("Player will start from zero position.");

    int diceRolling = (int) Math.floor(Math.random() * 10) % 7;
    if (diceRolling == 0) {
    	diceRolling = diceRolling + 1;
    }
    System.out.println("Number on die is: " + diceRolling);
    position = currentPlayerPosition + diceRolling;

    int checkOptions = (int) Math.floor(Math.random() * 10) % 3;
    switch (checkOptions) {

        case 0: {
            System.out.println("There will be no play. Player will be at same position");
        }
        //   System.out.println("Player is at: " + currentPlayerPosition);
        break;

        case 1: {
            System.out.println("Player will move forward");
            if (currentPlayerPosition < 100) {
                currentPlayerPosition = position;
            }
        }
        System.out.println("Player is at: " + currentPlayerPosition);
        break;

        case 2: {
            System.out.println("Player is bitten by a snake");
            if (currentPlayerPosition > 0) {
                currentPlayerPosition = position - diceRolling;

            } else if (currentPlayerPosition <= 0) {
                currentPlayerPosition = START_POSITION;
            }
        }
        System.out.println("Player is at: " + currentPlayerPosition);
        break;

    }
}

}
