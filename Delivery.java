public class Delivery{
    private int deliveryNumber; //key
    private double estimatedDeliveryTime; //estimated delivery time calculated by system
    private double timestamp; //how long the delivery actually took
    private double distance; //the distance travelled to make the delivery

    public Delivery(int deliveryNum, double estimate, double time, double dist){
        //Set all inputted information when a new instance is created
        this.deliveryNumber = deliveryNum;
        this.estimatedDeliveryTime = estimate;
        this.timestamp = time;
        this.distance = dist;

    }

    //Getters
    public int getDeliveryNumber(){
        return deliveryNumber;
    }

    public double getEstimatedDeliveryTime(){
        return estimatedDeliveryTime;
    }

    public double getTimestamp(){
        return timestamp;
    }

    public double getDistance(){
        return distance;
    }

    //Setters
    public void setDeliveryNumber(int newNum){
        deliveryNumber = newNum;
    }

    public void setEstimatedDeliveryTime(double newEst){
        estimatedDeliveryTime = newEst;
    }

    public void setTimestamp(double newTime){
        timestamp = newTime;
    }

    public void setDistance(double newDist){
        distance = newDist;
    }

}