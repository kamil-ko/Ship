package pl.k.kamil.java.ship;


public class Main {

    public static void main(String[] args) {
        int size = Communication.getSizeFromScanner();
        GameBoard gameBoard = new GameBoard(size);
        Position ship = new Position(size / 2, size / 2);
        Position treasure = GameBoard.getTreasure(ship.getHorizontal(), size);
        Movment movment = new Movment();

        while (true) {
            gameBoard.addVisitedPosition(ship);
            gameBoard.printBoard();
            if (GameBoard.shipOutside(ship, size)) {
                System.out.println("Statek poza planszą");
                System.out.println("Koniec gry !!!");
                break;
            }
            else if (gameBoard.shipInSamePlace()) {
                System.out.println("Statek na tym smamym polu");
                System.out.println("Koniec gry !!!");
                break;
            }
            else if
                (ship.getHorizontal() == treasure.getHorizontal() && ship.getVertical() == treasure.getVertical()){
                System.out.println("Znalazłeś skarb !!!");
                System.out.println("Koniec gry!!!");
                break;
            }

            movment.moveShip(ship);
        }


    }
}

