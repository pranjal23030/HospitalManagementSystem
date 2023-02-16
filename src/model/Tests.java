package model;

public class Tests {
    int id;
    String test_type;
    double amount;

    public Tests(int id, String test_type, double amount) {
        this.id = id;
        this.test_type = test_type;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTest_type() {
        return test_type;
    }

    public void setTest_type(String test_type) {
        this.test_type = test_type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
