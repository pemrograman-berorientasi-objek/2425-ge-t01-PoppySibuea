package fintech.model;

/**
 * @author 12S23004 Poppy Sibuea
 * @author 12S23026 Arif Doloksaribu
 */
public class Transaction {

    // class definition
    private Account account;
    private Double amount;
    private String postedat;
    private String note;
    private int idlast = 0;
    private int Idnow;

    public Transaction(Account account,Double amount, String postedat, String note) {
        this.account = account;
        this.amount = amount;
        this.postedat = postedat;
        this.note = note;
        this.Idnow = idlast + 1;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setPostedAt(String postedat) {
        this.postedat = postedat;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void sumamount(Double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public String toString() {
        return Idnow + "|" + account.getAccountName() + "|" + amount + "|" + postedat + "|" + note + "|" + account.getBalance();
    }


}