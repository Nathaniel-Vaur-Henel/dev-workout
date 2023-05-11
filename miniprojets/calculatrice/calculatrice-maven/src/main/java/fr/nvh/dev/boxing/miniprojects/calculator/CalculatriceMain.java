package fr.nvh.dev.boxing.miniprojects.calculator;

import java.util.Scanner;

/** Point d'entrée de l'application */
public class CalculatriceMain {
  public static void main(String[] args) {
    System.out.println("Hello Calculatrice!");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    System.out.println(input);
  }
}
