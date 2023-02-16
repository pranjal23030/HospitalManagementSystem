package model;

public class Doctor {
    String name;
    String speciality;
    String years_of_experience;
    boolean availability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getYears_of_experience() {
        return years_of_experience;
    }

    public void setYears_of_experience(String years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Doctor(String name, String speciality, String years_of_experience, boolean availability) {
        this.name = name;
        this.speciality = speciality;
        this.years_of_experience = years_of_experience;
        this.availability = availability;
    }
}
