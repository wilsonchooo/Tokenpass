package com.company;

public class Main {

    public static void main(String[] args) {

        TokenPass game1= new TokenPass(6);


       while(true)
        {
            game1.printBoard();
            game1.distributeCurrentPlayerTokens();

            game1.gameOver();

            game1.turnchange();





        }

    }
}
