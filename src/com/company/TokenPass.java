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

            while (numToDistribute > 0) {
                nextPlayer = currentPlayer;
                numToDistribute = board[currentPlayer];
                numToDistribute--;
                if (board[currentPlayer] == 0)
                {
                    System.out.println(currentPlayer + "is the winner");
                }
            }
        }

        public int gameOver ()
        {
            return -1;
        }

        public void nextPlayer()
        {
            System.out.println(currentPlayer);

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
