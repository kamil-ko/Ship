package pl.k.kamil.java.ship;

public class Movment {

    private Communication communication = new Communication();

    public void moveShip(Position ship) {
        switch (communication.getDirectionFromScanner()) {
            case "góra":
            case "g":
                ship.subtractionHorizontal();
                break;
            case "lewo":
            case "l":
                ship.subtractionVertical();
                break;
            case "prawo":
            case "p":
                ship.addVertical();
                break;
            case "dół":
            case "d":
                ship.addHorizontal();
                break;
            default:
                System.out.println("niepoprawny kierunek");
        }

    }


}
