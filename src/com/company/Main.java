package com.company;

import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void jeu(){
        String[][] tableau = TableauZero();
        DébutDeJeu();
        for (int i = 0; i < 100 ; i++) {
            Affichagejeu(tableau);
            MouvementJoueur1(tableau);
            destruction(tableau);

        }
    }


    //Creation de le Fonction deplacement

    public static void destruction (String[][]tableau) {       //Detruire les blocks
        boolean destroyevalide = true;
        String[][] tab = TableauZero();
        System.out.println("Veuillez saisir la première coordonnée de la case à détruire");
        int ligne = sc.nextInt();

        System.out.println("Veuillez saisir la deuxième coordonée de la case à détruire");
        int colonne = sc.nextInt();

        while (destroyevalide) {
            if (tableau[ligne - 1][colonne - 1] == "⬜") {
                tableau[ligne - 1][colonne - 1] = "⬛";
                destroyevalide = false;
            } else {
                destruction(tab);
            }
            Affichagejeu(tableau);
        }
    }


    public static void MouvementJoueur1(String[][] tableau) {
        boolean deplacementValide = true;
        String[][] tab = TableauZero();

        System.out.println("deplacer a gauche = 1");
        System.out.println("deplacer a droite = 2");
        System.out.println("deplacer en haut = 3");
        System.out.println("deplacer en bas = 4");
        int seDeplacer = sc.nextInt();


        if (seDeplacer == 1) //déplacement jpueur 1 vers la gauche
        {
            while (deplacementValide)
            {
                for (int i = 0; i < 10; i++)
                {
                    for (int j = 0; j < 11; j++)
                    {
                        if (tableau[i][j] == "\uD83D\uDFE6")
                        {
                            if (tableau[i][j - 1] == "⬜")
                            {
                                tableau[i][j] = "⬜";
                                tableau[i][j - 1] = "\uD83D\uDFE6";
                                deplacementValide = false;
                                i = 12;
                                j = 12;
                            }
                            else
                            {
                                System.out.println("Ne pas aller la");
                                MouvementJoueur1(tab);
                            }
                        }
                    }
                }
            }
        }
        if (seDeplacer == 2) {         // Deplacement Droite pion bleu
            while (deplacementValide) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 11; j++) {
                        if (tableau[i][j] == "\uD83D\uDFE6") {
                            if (tableau[i][j + 1] == "⬜") {
                                tableau[i][j] = "⬜";
                                tableau[i][j + 1] = "\uD83D\uDFE6";
                                deplacementValide = false;
                                i = 12;
                                j = 12;
                            } else {
                                System.out.println("Ne pas aller la");
                                MouvementJoueur1(tab);
                            }
                        }
                    }
                }
            }
        }

        if (seDeplacer == 3) {         // Deplacement Haut pion bleu
            while (deplacementValide) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 11; j++) {
                        if (tableau[i][j] == "\uD83D\uDFE6") {
                            if (tableau[i - 1][j] == "⬜") {
                                tableau[i][j] = "⬜";
                                tableau[i - 1][j] = "\uD83D\uDFE6";
                                deplacementValide = false;
                                i = 12;
                                j = 12;
                            } else {
                                System.out.println("Ne pas aller la");
                                MouvementJoueur1(tab);
                            }
                        }
                    }
                }
            }
        }

        if (seDeplacer == 4) {         // Deplacement Bas pion bleu
            while (deplacementValide) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 11; j++) {
                        if (tableau[i][j] == "\uD83D\uDFE6") {
                            if (tableau[i + 1][j] == "⬜") {
                                tableau[i][j] = "⬜";
                                tableau[i + 1][j] = "\uD83D\uDFE6";
                                deplacementValide = false;
                                i = 12;
                                j = 12;
                            } else {
                                System.out.println("Ne pas aller la");
                                MouvementJoueur1(tab);
                            }
                        }
                    }
                }
            }
        }
        Affichagejeu(tableau);
    }


    //Creation de la Fonction DébutDeJeu Qui sert à choisir son pseudo

    public static void DébutDeJeu() {
        System.out.println("Commencer");

        System.out.println("Choisissez votre pseudo joueur 1\n");
        String Player1;
        Scanner player = new Scanner(System.in);
        Player1 = player.nextLine();

        System.out.println("Choisissez votre pseudo joueur 2.\n");
        String Player2;
        Player2 = player.nextLine();

        //Désigner de manière aléatoire le joueur qui commence
        int nombreAleatoire = 1 + (int) (Math.random() * ((2 - 1) + 1));

        if (nombreAleatoire > 1) {
            System.out.println("Le joueur qui commence en premier est " + Player1);
        } else {
            System.out.println("Le joueur qui commence en premier est " + Player2);
        }
    }

    public static void Affichagejeu(String tableau[][]){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(tableau[i][j] + " " );
            }
            System.out.print(i + 1);
            System.out.println(" ");
        }
    }
    public static String[][] TableauZero(){

        String [][] tableau = new String[10][11]; //Initialisation de la varible tableau
        for(int i=0; i< 10; i++){
            for (int j = 0; j < 11; j++) {
                if (i == 5 && j == 4){
                    tableau[i][j] = "\uD83D\uDFE6";
                }
                else if(i == 5 && j == 5){
                    tableau[i][j] = "\uD83D\uDFE5";
                }
                else {
                    tableau[i][j] = ("\u2B1C");
                }
            }
        }return tableau;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        printMenu();
        choice = scan.nextInt();

        while(choice != 3){
            switch(choice){
                case 1 :
                    jeu();
                    break;
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


                default :
                    System.out.println("\nJe te donne les Selection réfléchi un peu !!\n");
            }
            printMenu();
            choice = scan.nextInt();
        }
        System.out.println("Merci d'avoir jouer");
    }



    public static void printMenu() {

        System.out.println("Bienvenue :\n" +
                           "\n" +
                           "1)Commencer le jeu\n" +
                           "2)Afficher les règles\n" +
                           "3)Quitter le Jeu");
    }





}