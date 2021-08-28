public class TestNewAccount {
    public static void main(String[] args) {
        NewAccount account = new NewAccount("David",1,10500);
        account.setAnnualInterestRate(1.7/100);
        account.setBalance(10000);
        account.withDraw(200);
        account.depoist(300);
        account.withDraw(12.5);
        account.depoist(34.6);
        account.printTransactions();
    }
}