package tp;
import tp.Transaction;
abstract class TransactionEbay extends Transaction {
    String pseudoVendeur ;
    String modeLivraison ;

    public TransactionEbay(String idtransaction, double montant, String date, String pseudoVendeur, String modeLivraison) {
        super(idtransaction, montant, date);
        this.pseudoVendeur = pseudoVendeur;
        this.modeLivraison = modeLivraison;
    }
    @Override
    public void afficherinfos() {
        System.out.println("id transaction: " + idtransaction);
        System.out.println("montant: " + montant);
        System.out.println("date: " + date);
        System.out.println("pseudo vendeur: " + pseudoVendeur);
        System.out.println("mode livraison: " + modeLivraison);
    }
}