public class Restaurant{ 
    private int resID;  //restaurant ID
    private String resName;  //restaurant name
    private String resAddress;  //restaurant address
    private String phoneNumber;  //restaurant phone number

    //creates a restaurant object and defines all the variables above
    public Restaurant(int resID, String resName, String resAddress, String phoneNumber){    
        this.resID = resID;
        this.resName = resName;
        this.resAddress = resAddress;
        this.phoneNumber = phoneNumber;
    }

    public void setResID(int newResID){   //sets the restaurant ID
        resID = newResID;
    }

    public void setResName(String newResName){    //sets the restaurant name
        resName = newResName;
    }

    public void setResAddress(String newResAddress){  //sets the restaurant address
        resAddress = newResAddress;
    }

    public void setPhoneNumber(String newPhoneNumber){ //sets the restaurant phone number
        phoneNumber = newPhoneNumber;
    }

    public int getResID(){   //gets the restaurant ID
        return resID;
    }

    public String getResName(){    //gets the driver's name
        return resName;
    }

    public String getResAddress(){ //gets the restaurant address
        return resAddress;
    }

    public String getPhoneNumber(){  //gets the restaurant phone number
        return phoneNumber;
    }
}
