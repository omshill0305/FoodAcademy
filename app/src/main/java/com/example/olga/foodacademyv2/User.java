package com.example.olga.foodacademyv2;

public class User {
    private String Datum;
    private String LastName;
    private String Feedback;

    public User(String fName,String lName, String fFood){
        Datum = fName;
        LastName = lName;
        Feedback = fFood;
    }

    public String getDatum() {
        return Datum;
    }

    public void setDatum(String datum) {
        Datum = datum;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String feedback) {
        Feedback = feedback;
    }
}
