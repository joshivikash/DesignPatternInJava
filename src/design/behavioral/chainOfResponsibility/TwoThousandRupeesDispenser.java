package design.behavioral.chainOfResponsibility;

public class TwoThousandRupeesDispenser extends ATMDispenser {

    public TwoThousandRupeesDispenser(int amount) {
        super(amount);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void doChain() {
        int numberOf2000RsNotes = amount / 2000;
        if (numberOf2000RsNotes > 0) {
            System.out.println("Dispensing " + numberOf2000RsNotes + " 2000 Rupees Notes");
        }
        FiveHundredRupeesDispenser fiveHundredRupeesDispenser = new FiveHundredRupeesDispenser(amount % 2000);
        fiveHundredRupeesDispenser.doChain();
    }

}
