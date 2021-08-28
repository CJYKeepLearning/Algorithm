import java.util.Date;

public class Transaction {
    private Date data;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        data = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    public String toString() {
        return "Transaction{" +
                "data=" + data +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}';
    }
}
