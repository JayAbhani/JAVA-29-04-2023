public class EncapsulationTut {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        a1.setAccountNumber("123456789");
        a1.deposit(500);
        a1.deposit(1000);
        a1.deposit(-2000);
        a1.withdraw(500);

        System.out.println(a1.getAccountNumber());
        System.out.println(a1.getBalance());
    }
}

class BankAccount {
    private String accountNumber;
    private int balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if(accountNumber != null && accountNumber != "") {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("invalid account number entered!");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount >= 0) {
            this.balance = this.balance + amount;
        } else {
            System.out.println("amount cannot be negative");
        }
    }

    public void withdraw(int amount) {
        if(amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("not a valid amount");
        }
    }
}
