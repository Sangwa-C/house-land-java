package models;

public class Lands {
    private String location;
    private String description;
    private String price;
    private String purpose;
    private int plotNumber;

    public Lands(String location, String description, String price, int plotNumber) {
        this.location = location;
        this.description = description;
        this.price = price;
        this.plotNumber = plotNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getPlotNumber() {
        return plotNumber;
    }

    public void setPlotNumber(int plotNumber) {
        this.plotNumber = plotNumber;
    }
}

