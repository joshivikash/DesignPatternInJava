package design.behavioral.chainOfResponsibility;

public class ATMDispenser implements Chain {
    protected int amount;

    public ATMDispenser(int amount) {
        this.amount = amount;
    }

    public void dispenseMoney() {
        if (amount % 100 != 0) {
            System.out.println("Amount should be in multiples of 100");
            return;
        }
        doChain();
    }

    @Override
    public void doChain() {
        TwoThousandRupeesDispenser twoThousandRupeesDispenser = new TwoThousandRupeesDispenser(amount);
        twoThousandRupeesDispenser.doChain();
    }
}
