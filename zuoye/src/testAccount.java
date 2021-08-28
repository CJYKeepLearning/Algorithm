public class testAccount {
    public static void main(String[] args) {
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.withDraw(2500);
        account.depoist(3000);
        System.out.println("账户余额为："+account.getBalance());
        System.out.println("账户月利息为"+account.getMonthlyInterestRate());
        System.out.println("账户开户日期为："+account.getDateCreated());
    }
}
