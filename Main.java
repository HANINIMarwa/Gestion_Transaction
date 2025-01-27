package tp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gestiontransaction gestionTransaction = new Gestiontransaction();

        while (true) {
            System.out.println("+++++++++++++++++++++++++");
            System.out.println("Menu");
            System.out.println("1. Ajouter une transaction");
            System.out.println("2. Afficher toutes les transactions");
            System.out.println("3. Calculer le montant total");
            System.out.println("0. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            if (choix == 0) {
                System.out.println("Sortie du programme.");
                break;
            } else if (choix == 1) {
                System.out.println("Entrez la plateforme (amazon, ebay, independante) : ");
                String plateforme = scanner.nextLine();

                System.out.println("Entrez l'ID de la transaction : ");
                String idTransaction = scanner.nextLine();

                System.out.println("Entrez le montant de la transaction : ");
                double montant = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Entrez la date de la transaction : ");
                String date = scanner.nextLine();

                // Ajout selon la plateforme
                if (plateforme.equalsIgnoreCase("amazon")) {
                    System.out.println("Entrez le numéro du client : ");
                    String numeroClient = scanner.nextLine();

                    System.out.println("Entrez la catégorie du produit : ");
                    String categorieProduit = scanner.nextLine();

                    TransactionAmazon transactionAmazon = new TransactionAmazon(idTransaction, montant, date, numeroClient, categorieProduit) {
                    };
                    gestionTransaction.add(transactionAmazon);
                    System.out.println("Transaction Amazon ajoutée avec succès.");

                } else if (plateforme.equalsIgnoreCase("ebay")) {
                    System.out.println("Entrez le pseudo du vendeur : ");
                    String pseudoVendeur = scanner.nextLine();

                    System.out.println("Entrez le mode de livraison : ");
                    String modeLivraison = scanner.nextLine();

                    TransactionEbay transactionEbay = new TransactionEbay(idTransaction, montant, date, pseudoVendeur, modeLivraison) {
                    };
                    gestionTransaction.add(transactionEbay);
                    System.out.println("Transaction eBay ajoutée avec succès.");

                } else if (plateforme.equalsIgnoreCase("independante")) {
                    System.out.println("Entrez la localisation du vendeur : ");
                    String localisationVendeur = scanner.nextLine();

                    System.out.println("Entrez le moyen de paiement : ");
                    String moyenPaiement = scanner.nextLine();

                    TransactionIndependante transactionIndependante = new TransactionIndependante(idTransaction, montant, date, localisationVendeur, moyenPaiement) {
                    };
                    gestionTransaction.add(transactionIndependante);
                    System.out.println("Transaction indépendante ajoutée avec succès.");

                } else {
                    System.out.println("Plateforme non reconnue. Veuillez réessayer.");
                }

            } else if (choix == 2) {
                gestionTransaction.affichage();
            } else if (choix == 3) {
                gestionTransaction.montant();
            } else {
                System.out.println("Option invalide. Veuillez réessayer.");
            }
        }

        scanner.close(); // Ferme le scanner
    }
}
