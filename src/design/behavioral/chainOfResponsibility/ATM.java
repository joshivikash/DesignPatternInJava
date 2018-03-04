package design.behavioral.chainOfResponsibility;

public class ATM {

    public static void main(String[] args) {
        ATMDispenser atmDispenser = new ATMDispenser(22700);
        atmDispenser.dispenseMoney();
    }

}
