package model;


public class Ward extends Department  {
    int numofBeds;
    boolean availabilty;
    String dateofLastInspection;

    public Ward(int numofBeds, boolean availabilty, String dateofLastInspection) {
        this.numofBeds = numofBeds;
        this.availabilty = availabilty;
        this.dateofLastInspection = dateofLastInspection;
    }

    public int getNumofBeds() {
        return numofBeds;
    }

    public void setNumofBeds(int numofBeds) {
        this.numofBeds = numofBeds;
    }

    public boolean isAvailabilty() {
        return availabilty;
    }

    public void setAvailabilty(boolean availabilty) {
        this.availabilty = availabilty;
    }

    public String getDateofLastInspection() {
        return dateofLastInspection;
    }

    public void setDateofLastInspection(String dateofLastInspection) {
        this.dateofLastInspection = dateofLastInspection;
    }
}
