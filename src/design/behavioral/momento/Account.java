package design.behavioral.momento;

public class Account implements Cloneable {
    private int            balance;
    private AccountMomento momento;
    private Account        benificiary;

    public Account(int balance) {
        this.balance = balance;
    }

    void credit(int amount) {
        this.balance = this.balance + amount;
    }

    void debit(int amount) {
        this.balance = this.balance - amount;
    }

    private class AccountMomento {
        private Account account;

        public AccountMomento(Account account) {
            // TODO Auto-generated constructor stub
            this.account = account;
        }

        public Account getAccount() {
            return account;
        }
    }

    void saveAccount() throws CloneNotSupportedException {
        momento = new AccountMomento((Account) this.clone());
    }

    void rollBackAccount() {
        this.balance = momento.getAccount().balance;
    }

    public Account getBenificiary() {
        return benificiary;
    }

    public void setBenificiary(Account benificiary) {
        this.benificiary = benificiary;
    }

    public void transferToBenificiary(int amount) {
        /*
         * if (amount == 10) { throw new RuntimeException(); }
         */
        debit(amount);
        benificiary.credit(amount);
    }

    public int getBalance() {
        return balance;
    }
}
