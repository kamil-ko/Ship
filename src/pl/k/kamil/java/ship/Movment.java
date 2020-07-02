package pl.k.kamil.java.ship;

public class Movment {

    private Communication communication = new Communication();

    public void moveShip(Position ship) {
        switch (communication.getDirectionFromScanner()) {
            case "góra":
            case "g":
                System.out.println("^");
                ship.subtractionHorizontal();
//                if (vertical == 0){
//                    System.out.println("wyszedłeś poza pole gry, cofasz się do poprzedniej pozycji. ");
                break;

            case "lewo":
            case "l":
                System.out.println("<");
                ship.subtractionVertical();
                break;
            case "prawo":
            case "p":
                System.out.println(">");
                ship.addVertical();
                break;

            case "dół":
            case "d":
                System.out.println("v");
                ship.addHorizontal();
                break;
            default:
                System.out.println("niepoprawny kierunek");
        }

    }


}
