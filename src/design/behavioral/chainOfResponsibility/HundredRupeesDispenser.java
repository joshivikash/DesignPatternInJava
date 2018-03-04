package design.behavioral.chainOfResponsibility;

public class HundredRupeesDispenser extends ATMDispenser {

    public HundredRupeesDispenser(int amount) {
        super(amount);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void doChain() {
        int numOf100RsNotes = amount / 100;
        if (numOf100RsNotes > 0) {
            System.out.println("Dispensing " + numOf100RsNotes + " 100 Rupees Notes");
        }
    }

}
