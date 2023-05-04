import java.util.ArrayList;
public class Driver{
    private int driverID;  
    private String name;
    private String carInfo; // "Year Make Model" 
    private String driversLicense;
    private ArrayList<Delivery> history;
    private String userName;

    public void setDriverID(int newDriverID){   //sets the driver's ID number
        driverID = newDriverID;
    }

    public void setName(String newName){    //sets the driver's name
        name = newName;
    }

    public void setCarInfo(String newCarInfo){  //sets the driver's car info
        carInfo = newCarInfo;
    }

    public void setDriversLicense(String newDriversLicense){ //sets the driver's license info
        driversLicense = newDriversLicense;
    }

    public int getDriverID(){   //gets the driver's ID number
        return driverID;
    }

    public String getName(){    //gets the driver's name
        return name;
    }

    public String getCarInfo(){ //gets the driver's car info
        return carInfo;
    }

    public String getDriversLicense(){  //gets the driver's license info
        return driversLicense;
    }

    public ArrayList<Delivery> getHistory(){ //get delivery history
        return history;
    }


}
