package tp;
import tp.Transaction;
abstract class TransactionIndependante extends Transaction {
    private String localisationvendeur;
    private String moyenpaiement ;

    public TransactionIndependante(String idtransaction, double montant, String date, String localisationvendeur, String moyenpaiement) {
        super(idtransaction, montant, date);
        this.localisationvendeur = localisationvendeur;
        this.moyenpaiement = moyenpaiement;
    }

    public String getLocalisationvendeur() {
        return localisationvendeur;
    }

    public void setLocalisationvendeur(String localisationvendeur) {
        this.localisationvendeur = localisationvendeur;
    }

    public String getMoyenpaiement() {
        return moyenpaiement;
    }

    public void setMoyenpaiement(String moyenpaiement) {
        this.moyenpaiement = moyenpaiement;
    }

    @Override
    public void afficherinfos() {
        System.out.println("id transaction: " + idtransaction);
        System.out.println("montant: " + montant);
        System.out.println("date: " + date);
        System.out.println("localisation: " +localisationvendeur );
        System.out.println("moyen: " + moyenpaiement);
    }
}
