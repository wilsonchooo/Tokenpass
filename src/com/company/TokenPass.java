package com.company;

import java.util.Arrays;

public class TokenPass {

    private int currentPlayer;
    private int [] board;
    public TokenPass(int playerCount) {

         board = new int[playerCount];
        for (int i = 0; i < playerCount; i++) {
            board[i] = 1 + (int) (10 * Math.random());
        }
         currentPlayer = (int) (playerCount * Math.random());

    }
        public void distributeCurrentPlayerTokens ()
        {
            int nextPlayer = currentPlayer;
            int numToDistribute = board[currentPlayer];
            board[currentPlayer] = 0;

            while (numToDistribute > 0)
            {
                nextPlayer = (nextPlayer  +1) ;
                if (nextPlayer >= board.length)
                {
                    nextPlayer = 0;
                }
                board[nextPlayer]++;
                numToDistribute--;
            }


            System.out.println(currentPlayer);

            if (board[currentPlayer] == 0)
            {
                System.out.println(Arrays.toString(board));
                System.out.println("winner is player " + currentPlayer);
                System.exit(0);

            }
                gameOver();

        }

        public void gameOver ()
        {
            for (int x=0;x<board.length;x++)
            {
                if (board[x] == 0)
                {
                    int winner = x;
                    System.out.println(winner + "is the winner");
                    System.exit(0);
                   // return 1;


                }
               // else return -1;
            }

            // return -1;
        }

        public int next( )
        {
            System.out.println(currentPlayer);

            int tempPlayer = currentPlayer;
            tempPlayer++;
            if (tempPlayer >= board.length)
            {
                tempPlayer = 0;
            }
            return tempPlayer;
        }

        public void turnchange()
        {


                currentPlayer++;
                if (currentPlayer >= board.length)
                {
                    currentPlayer = 0;
                }


        }

        public void printBoard()
        {
            System.out.println(Arrays.toString(board));
        }
}
