package fr.nvh.dev.workout.exercices.palindrome;

import java.util.Scanner;

/** Point d'entrée de l'application */
public class PalindromeMain {
  public static void main(String[] args) {
    System.out.println("Hello Palindrome!");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    System.out.println(input);
  }
}
