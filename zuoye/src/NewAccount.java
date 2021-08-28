import java.util.ArrayList;

public class NewAccount extends Account {
    private String name;
    ArrayList<Transaction> transaction = new ArrayList();
    public NewAccount(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
    }

    public void withDraw(double amount) {
        if (getBalance()>=amount){
            setBalance(getBalance()-amount);
            transaction.add(new Transaction('W',amount,getBalance(),""));
        }
    }

    public void depoist(double amount) {
        setBalance(getBalance()+amount);
        transaction.add(new Transaction('D',amount,getBalance(),""));
    }

    public void printTransactions(){
        for (Transaction trans:
                transaction) {
            System.out.println(trans);
        }
    }
}
