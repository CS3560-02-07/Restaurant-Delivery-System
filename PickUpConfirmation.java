public class PickUpConfirmation{ 
    private boolean pickUpConfirm;  //confirmation if delivery was picked up by driver
    private int confirmNumber;  //creates a restaraurant confirmation number

    //creates a PickUpConfirmation object and defines all the variables above
    public PickUpConfirmation(boolean pickUpConfirm, int confirmNumber){    
        this.pickUpConfirm = pickUpConfirm;
        this.confirmNumber = confirmNumber;
    }

    public void setPickUpConfirm(boolean newPickUpConfirm){   //sets the delivery confirmation
        pickUpConfirm = newPickUpConfirm;
    }

    public void setConfirmNumber(int newConfirmNumber){    //sets the restaraurant confirmation number
        confirmNumber = newConfirmNumber;
    }


    public boolean setPickUpConfirm(){   //gets the delivery confirmation
        return pickUpConfirm;
    }

    public int setConfirmNumber(){    //gets the restaraurant confirmation number
        return confirmNumber;
    }
}
