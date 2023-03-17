public class PickUpConfirmation{ 
    private Boolean pickUpConfirm;  //confirmation if delivery was picked up by driver
    private int confirmNumber;  //creates a restaraurant confirmation number

    //creates a PickUpConfirmation object and defines all the variables above
    public PickUpConfirmation(Boolean pickUpConfirm, int confirmNumber){    
        this.pickUpConfirm = pickUpConfirm;
        this.confirmNumber = confirmNumber;
    }

    public void setPickUpConfirm(Boolean newPickUpConfirm){   //sets the delivery confirmation
        pickUpConfirm = newPickUpConfirm;
    }

    public void setConfirmNumber(int newConfirmNumber){    //sets the restaraurant confirmation number
        confirmNumber = newConfirmNumber;
    }


    public Boolean setPickUpConfirm(){   //gets the delivery confirmation
        return pickUpConfirm;
    }

    public int setConfirmNumber(){    //gets the restaraurant confirmation number
        return confirmNumber;
    }
}
