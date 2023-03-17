public class Driver{
    private int driverID;
    private String name;
    private String carInfo; // "Year Make Model" 
    private String driversLicense;
    private boolean history; // Clean driving history?

    public Driver(int driverID, String name, String carInfo, String driversLicense, boolean history){
        this.driverID = driverID;
        this.name = name;
        this.carInfo = carInfo;
        this.driversLicense = driversLicense;
        this.history = history;
    }

    public void setDriverID(int newDriverID){
        driverID = newDriverID;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setCarInfo(String newCarInfo){
        carInfo = newCarInfo;
    }

    public void setDriversLicense(String newDriversLicense){
        driversLicense = newDriversLicense;
    }

    public int getDriverID(){
        return driverID;
    }

    public String getName(){
        return name;
    }

    public String getCarInfo(){
        return carInfo;
    }

    public String getDriversLicense(){
        return driversLicense;
    }


}