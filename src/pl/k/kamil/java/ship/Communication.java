package pl.k.kamil.java.ship;

import java.util.Scanner;

public class Communication {



        public static final Scanner scanner = new Scanner(System.in);


  public static int getSizeFromScanner() {
      System.out.println("Podaj rozmiar pola gry: ");
      return scanner.nextInt();
  }


  public static String getDirectionFromScanner(){
      System.out.println("Podaj kierunek [góra (g), dół (d), lewo (l), prawo (p)]:");
      return scanner.next();
  }






}
