public class Refund {
    private double refund; //What the customer paid for their order, payment given back to them

    public Refund(double refund){ //Constructor
        this.refund = refund;
    }

    public void setRefund(double newRefund){ //Setter
        refund = newRefund;
    }

    public double getRefund(){ //Getter
        return refund;
    }
}
