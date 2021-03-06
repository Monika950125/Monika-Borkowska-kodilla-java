package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        int quantityOfWonRounds = 0;
        int quantityOfDefeatRounds = 0;
        RPS game = new RPS();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give your name:");
        String playerName = scanner.nextLine();
        System.out.println("Give the quantity of won rounds necessary to win the game:");
        int quantityOfRounds = scanner.nextInt();

        System.out.println("Information on how to operate the game:");
        System.out.println("Press the \"1\" key to choose \"Rock\" \nPress the \"2\" key to choose \"Paper\" \n" +
                "Press the \"3\" key to choose \"Scissors\"");
        System.out.println("Press the \"x\" key to end the game");
        System.out.println("Press the \"n\" key to start new game");

        while (!end) {
            game.chooseMove();
            String playerAttribute = game.getPlayerAttribute();
            game.computerMove();
            String computerAttribute = game.getComputerAttribute();
            System.out.println("Your move: " + playerAttribute + " || " + "Opponent's move: " + computerAttribute);
            String result = game.compareTheMovements();
            System.out.println(result);

            if (result.equals("Your win")) {
                quantityOfWonRounds = quantityOfWonRounds + 1;
//                System.out.println("Total quantity of winnings: " + quantityOfWonRounds);
                if (quantityOfWonRounds == quantityOfRounds) {
                    System.out.println("Congratulations " + playerName + " you won the game!!!\n");
                    System.out.println("Do you want play again?");
                    if (scanner.next().equals("n")) {
                        end = false;
                        System.out.println("Give the quantity of won rounds necessary to win the game:");
                        quantityOfRounds = scanner.nextInt();
                    } else if (scanner.next().equals("x")) {
                        end = true;
                    }
                }
            } else if (result.equals("Defeat")) {
                quantityOfDefeatRounds = quantityOfDefeatRounds + 1;
//                System.out.println("Total quantity of defeats: " + quantityOfDefeatRounds);
                if (quantityOfDefeatRounds == quantityOfRounds) {
                    System.out.println("Unfortunately " + playerName + " you lost\n");
                    System.out.println("Do you want play again?");
                    if (scanner.next().equals("n")) {
                        end = false;
                        System.out.println("Give the quantity of won rounds necessary to win the game:");
                        quantityOfRounds = scanner.nextInt();
                    } else if (scanner.next().equals("x")) {
                        end = true;
                    }
                }
            }
        }
    }
}


