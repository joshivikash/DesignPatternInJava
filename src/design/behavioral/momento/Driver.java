package design.behavioral.momento;

public class Driver {
    public static void main(String[] args) {
        Account ac1 = new Account(100);
        Account ac2 = new Account(50);
        ac1.setBenificiary(ac2);
        Account ac3 = new Account(10);
        ac2.setBenificiary(ac3);

        try {
            ac1.saveAccount();
            ac2.saveAccount();
            ac3.saveAccount();
        } catch (Exception e) {
            e.printStackTrace();
        }

        printDetails(ac1, ac2, ac3);

        try {
            ac1.transferToBenificiary(50);
            ac2.transferToBenificiary(10);
        } catch (Exception e) {
            ac1.rollBackAccount();
            ac2.rollBackAccount();
            ac3.rollBackAccount();
        }

        System.out.println();

        printDetails(ac1, ac2, ac3);
    }

    private static void printDetails(Account ac1, Account ac2, Account ac3) {
        System.out.println("Account 1 " + ac1.getBalance());
        System.out.println("Account 2 " + ac2.getBalance());
        System.out.println("Account 3 " + ac3.getBalance());
    }
}
