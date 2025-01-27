package tp;
import tp.Transaction;

abstract class TransactionAmazon extends Transaction{
    public String numeroClient ;
    public String categorieProduit ;

    public TransactionAmazon(String idtransaction, double montant, String date, String numeroClient, String categorieProduit) {
        super(idtransaction, montant, date);
        this.numeroClient = numeroClient;
        this.categorieProduit = categorieProduit;
    }

    @Override
    public void afficherinfos() {
        System.out.println("id transaction: " + idtransaction);
        System.out.println("montant: " + montant);
        System.out.println("date: " + date);
        System.out.println("numeroclient: " + numeroClient);
        System.out.println("categorieProduit: " + categorieProduit);
    }




}
