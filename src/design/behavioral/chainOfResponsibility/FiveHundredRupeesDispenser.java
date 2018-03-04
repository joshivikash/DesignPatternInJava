package design.behavioral.chainOfResponsibility;

public class FiveHundredRupeesDispenser extends ATMDispenser {

    public FiveHundredRupeesDispenser(int amount) {
        super(amount);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void doChain() {
        int numOf500RsNotes = amount / 500;
        if (numOf500RsNotes > 0) {
            System.out.println("Dispensing " + numOf500RsNotes + " 500 Rupees Notes");
        }
        HundredRupeesDispenser hundredRupeesDispenser = new HundredRupeesDispenser(amount % 500);
        hundredRupeesDispenser.doChain();
    }

}
