package org.example.spaceship.seat;

import org.example.Species;


public abstract class Seat {
    //TODO: Make class abstract, and sort out construction
    protected final Species type;
    protected final String ID;
    protected String nameOfPersonBooking;


    public Seat(Species type, String id) {
        this.type = type;
        ID = id;
    }



    public Species getType() {
        return type;
    }

    public boolean isBooked() {
        return nameOfPersonBooking != null;
    }

    public void book(String name) {
        this.nameOfPersonBooking = name;
    }

    public void serveMeal(String meal) {
        if (this.isBooked())
            if (this.isBooked())
                System.out.println("Served " + meal + " to Passenger " + nameOfPersonBooking + " on  seat " + ID);
    }


    public String getID() {
        return ID;
    }

    public String getNameOfPersonBooking() {
        return nameOfPersonBooking;
    }
}
