package models;

import org.sql2o.Connection;
import org.sql2o.Sql2o;

import javax.swing.*;
import java.util.List;


public class Lands {
    private String name;
    private String email;
    private String property;
    private String location;
    private String meansOfPayment;
    private int price;
    private int id;

    public Lands(String name, String email, String property, String location, String meansOfPayment, int price) {
        this.name = name;
        this.email = email;
        this.property = property;
        this.location = location;
        this.meansOfPayment = meansOfPayment;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMeansOfPayment() {
        return meansOfPayment;
    }

    public void setMeansOfPayment(String meansOfPayment) {
        this.meansOfPayment = meansOfPayment;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void save(){
        try (Connection con =  DB.sql2o.open()){
            String sql = "INSERT INTO lands (name, email, property, location, meansOfPayment)";
            this.id =(int) con.createQuery(sql, true)
                .addParameter("name", this.name)
                    .addParameter("email", this.email)
                    .addParameter("property", property)
                    .addParameter("location", this.location)
                    .addParameter("meansOfPayment", this.meansOfPayment )
                    .executeUpdate()
                    .getKey();
        }

    }

    public static List<Lands> allLands(){
        String sql = "SELECT * FROM lands;";
        try (Connection con = DB.sql2o.open()){

            return con.createQuery(sql).executeAndFetch(Lands.class);

        }
    }
}




