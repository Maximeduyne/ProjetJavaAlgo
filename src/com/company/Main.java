package com.company;

import java.util.Scanner;

public class Main {

    public static void jeu(){
        TableauZero();





    }


    public static void TableauZero(){

        String [][] tableau = new String[10][11];
        for(int i=0; i< tableau.length; i++){
            for (int j = 0; j < tableau.length; j++) {
                if (i == 5 && j == 6){
                    tableau[i][j] = "\uD83D\uDFE6 ";
                }
                else if(i == 6 && j == 6){
                    tableau[i][j] = "\uD83D\uDFE5 ";
                }
                else {
                    tableau[i][j] = ("⬜");
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        printMenu();
        choice = scan.nextInt();

        while(choice != 4){
            switch(choice){
                case 1 :


                case 2 :
                    System.out.println("Affichage des règles\n"
                            + "Règles du jeu:\n"
                            + "1- Le jeu se joue obligatoirement a deux joueurs.\n"
                            + "2- Chaque joueur n'a le droit qu'a un mouvement par tour\n"
                            + "3- A la fin de ton déplacement tu peux décider de détruire une case de ton choix.\n"
                            + "4- Tu ne peux pas détruire une case déja détruite ou occupée par un joueur.\n"
                            + "5- La partie se termine lorsqu'un des deux joueurs ne peut plus se déplacer.\n"
                            + "6- Tu peux pas te déplacer sur une case occupé par un autre joueur.\n"
                            + "7- Amusez-vous bien!\n");

                    break;

                case 3 :
                    System.out.println("Affichage des Scores");
                    break;
                default :
                    System.out.println("\nJe te donne les Selection réfléchi un peu !!\n");
            }
            printMenu();
            choice = scan.nextInt();
        }
        System.out.println("Merci d'avoir jouer");
    }





        public static void printMenu() {

            System.out.println("Bienvenue :\n"
            + "\n1)Commencer le jeu\n"
            + "2)Afficher les règles\n"
            + "3)Afficher les scores\n"
            + "4)Quitter le Jeu");
    }

    public static void tableau(String[] args) {

    }





}
