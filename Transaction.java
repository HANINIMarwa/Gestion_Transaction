package tp;

abstract class Transaction {
    public String idtransaction ;
    public double montant ;
    public String date;

    public Transaction(String idtransaction, double montant, String date) {
        this.idtransaction = idtransaction;
        this.montant = montant;
        this.date = date;
    }

    public String getIdtransaction() {
        return idtransaction;
    }

    public void setIdtransaction(String idtransaction) {
        this.idtransaction = idtransaction;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public abstract void afficherinfos() ;

    public void obtenirmontant(){
        System.out.println("montant");

    }
}
