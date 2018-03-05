import java.util.HashMap;

public class VendingMachine {
    private HashMap<Selection, Tray> products;
    private double cash;
    private double credit;

    public VendingMachine(HashMap<Selection, Tray> products, double cash) {
        this.products = products;
        this.cash = cash;
        this.credit = 0.00;
    }

    public double getCash() {
        return cash;
    }

    public double getCredit() {
        return credit;
    }

    public void addMoney(double amountEntered){
        credit += amountEntered;
    }

    public double getRefund(){
        double refundAmount = credit;
        credit = 0;
        return refundAmount;
    }
}
