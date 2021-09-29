package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        printMenu();
        choice = scan.nextInt();

        while(choice != 4){
            switch(choice){
                case 1 :
                    System.out.println("Lancement du jeu");
                    break;

                case 2 :
                    System.out.println("Affichage des règles");
                    break;

                case 3 :
                    System.out.println("Affichage des Scores");
            }
            printMenu();
            choice = scan.nextInt();
        }
        System.out.println("Merci d'avoir jouer");
    }
        public static void printMenu() {

            System.out.println("Bienvenue :\n"
            + "1)Commencer le jeu\n"
            + "2)Afficher les règles\n"
            + "3)Afficher les scores\n"
            + "4)Quitter le Jeu");
    }
}
