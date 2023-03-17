public class DriverPayment {
    private double payRate; //Based on distance traveled and time spent delivering
    private double totalPayment; //Based on payRate + additional tips

    public DriverPayment(double payRate, double totalPayment){ //DriverPayment constructor
        this.payRate = payRate;
        this.totalPayment = totalPayment;
    }

    public void setPayRate(double newPayRate){ //Setter
        payRate = newPayRate;
    }

    public void setTotalPayment(double newTotalPayment){ //Setter
        totalPayment = newTotalPayment;
    }

    public double getPayRate(){ //Getter
        return payRate;
    }

    public double getTotalPayment(){ //Getter
        return totalPayment;
    }

    public void calculatePayRate(double miles, double time){ //Based on distance traveled and time spent delivering

    }

    public void calculateTotalPayment(double payRate, double tips){ //Based on payRate + additional tips

    }
}
