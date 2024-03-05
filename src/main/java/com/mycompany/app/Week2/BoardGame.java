package com.mycompany.app.Week2;

public class BoardGame {
    class Game {
        Game(int i) {
            System.out.println("Game constructor");
        }
    }
    
    class InnerBoardGame extends Game {
        InnerBoardGame(int i) {
            super(i);
            System.out.println("InnerBoardGame constructor");
        }
    }
    
    public class Chess extends InnerBoardGame {
        Chess() {
            super(11);
            System.out.println("Chess constructor");
        }
    }

    public static void main(String[] args) {
        BoardGame bg = new BoardGame();
        bg.new Chess();
    }
}
