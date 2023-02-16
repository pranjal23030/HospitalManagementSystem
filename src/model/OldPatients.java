package model;

public class OldPatients {
    int id;
    String name;
    String address;
    String phone_number;
    String registered_date;
    String gender;

    public OldPatients(int id, String name, String address, String phone_number, String registered_date, String gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.registered_date = registered_date;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getRegistered_date() {
        return registered_date;
    }

    public void setRegistered_date(String registered_date) {
        this.registered_date = registered_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
