package fr.nvh.dev.boxing.miniprojects.tic.tac.toe;

import java.util.Scanner;

/** Point d'entrée de l'application */
public class MorpionMain {
  public static void main(String[] args) {
    System.out.println("Hello Morpion!");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    System.out.println(input);
  }
}
