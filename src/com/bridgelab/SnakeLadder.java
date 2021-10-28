package com.bridgelab;

import java.util.Random;

public class SnakeLadder {
    //initilization of values
    int newPos = 0;
    int diesValue = 0;

    //method
    public void diesRoll() {
        int minValue = 1;
        // random class object has been created
        Random r1 = new Random();
        //taking input by nextInt method to get random number between 1 to 6
        diesValue = minValue + r1.nextInt(6);

        System.out.println("move for:" + diesValue);
    }


    public void snakeOrLadder() {
        int minNum = 1;
        int playerPos = 0;
        for (int i = 0; newPos < 100; i++) {
            Random r3 = new Random();
            int diceRoll100 = minNum + r3.nextInt(6);
            System.out.println("dice rolled :" + diceRoll100);

            Random r2 = new Random(); // object creation
            int playCheck = r2.nextInt(3); // initialization of random typle clas
            playerPos = newPos;

            // checking through switch case

            switch (playCheck) {
                case 1:
                    System.out.println("ladder");
                    System.out.println("dies roll-" + diesValue);
                    System.out.println("player pos:" + playerPos);
                    newPos = diesValue + playerPos;
                    System.out.println("new position::" + newPos);
                    break;
                case 2:
                    System.out.println("-snake-");
                    System.out.println("dies roll-" + diesValue);
                    System.out.println("player pos:" + playerPos);
                    newPos = diesValue - playerPos;
                    System.out.println("new position:" + newPos);
                    break;
                default:
                    System.out.println("Not playing");
                    System.out.println("new position:" + newPos);

            }
        }
    }


        public static void main (String[]args)
        {
            String playerName = "Antara";
            int playerPosition = 0;
            System.out.println("welcome to SNAKE and LADDER Game");
            System.out.println("Hey \t" + playerName + "\nYour postion is:" + playerPosition);
            // Creating object
            SnakeLadder s = new SnakeLadder();
            // calling  method through object
            s.diesRoll();
            int dies = s.diesValue;
            //calling the method
            s.snakeOrLadder();
        }
    }
}

