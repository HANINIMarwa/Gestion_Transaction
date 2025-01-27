package tp;

import java.util.ArrayList; // import the ArrayList class

public class Gestiontransaction {
    ArrayList<Transaction> transactions;
    public Gestiontransaction(){
        transactions = new ArrayList<>();
    }

public void add(Transaction transaction){
        transactions.add(transaction);
}
public void affichage(){
        for(Transaction transaction : transactions){
            transaction.afficherinfos();
        }
}
public void montant() {
    double montant_total = 0.0;
    double amazon_montant = 0.0;
    double ebay_montant = 0.0;
    double indepandante_montant = 0.0;
    int amz = 0;
    int ebay = 0;
    int indepandante = 0;
    for (Transaction transaction : transactions) {
        montant_total += transaction.getMontant();
        if (transaction instanceof TransactionEbay) {
            ebay++;
            ebay_montant += transaction.getMontant();
        } else if (transaction instanceof TransactionAmazon) {
            amz++;
            amazon_montant += transaction.getMontant();
        } else if (transaction instanceof TransactionIndependante) {
            indepandante++;
            indepandante_montant += transaction.getMontant();
        }
    }
    System.out.println("somme totale:"+montant_total);
    System.out.println("montant des transactions de amazon:"+amazon_montant);
    System.out.println("montant des transactions de ebay:"+ebay_montant);
    System.out.println("montant des transactions de indepandante:" +indepandante_montant );
}
}
