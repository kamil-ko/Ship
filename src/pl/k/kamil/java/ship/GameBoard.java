package pl.k.kamil.java.ship;


import java.util.Random;

public class GameBoard {

    private int[][] gameBoard;


    public GameBoard(int size) {
        initBoard(size);
    }

    public void addVisitedPosition(Position position) {
        gameBoard[position.getHorizontal()][position.getVertical()]++;
    }

    public void printBoard() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }


    private void initBoard(int size) {
        gameBoard = new int[size][size];
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                gameBoard[i][j] = 0;
            }
        }


    }
    public static boolean shipOutside(Position ship,int size){
        return ship.getHorizontal() < 0 || ship.getVertical() > size-1 || ship.getHorizontal() > size-1 || ship.getHorizontal() < 0;
    }

    public boolean shipInSamePlace(){
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                if (gameBoard[i][j]> 1) {
                    return true;
                }
            }
    }
        return false;
}
    public static Position getTreasure(int startPosition, int size){
        int treasureHorizontal = new Random().nextInt(size-1) + 1;
        int treasureVertical = new Random().nextInt(size-1) + 1;
        while (treasureHorizontal == startPosition && treasureVertical == startPosition) {
            treasureHorizontal = new Random().nextInt(size) + 1;
            treasureVertical = new Random().nextInt(size) + 1;
        }
        return new Position(treasureHorizontal, treasureVertical);
    }


    }