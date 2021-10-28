package com.bridgelab;

public class SnakeLadder {
        public static void main(String[] args) {
            System.out.println("welcome to SNAKE and LADDER Game");
            int start_pos = 0;
            System.out.println("Starting position is at :" +start_pos);
            int diceVal = (int) Math.floor((Math.random()*6) + 1);
            System.out.println("dice value is : " +diceVal);
            int chk = (int) Math.floor(Math.random()*10 % 3 + 1);
            switch(chk) {
                case 1:
                    start_pos = start_pos + diceVal;
                    break;
                case 2:
                    start_pos = start_pos - diceVal;
                    break;
                default:
                    System.out.println("player is not playing");
            }
            System.out.println("player position is now: " +start_pos);
        }
}
