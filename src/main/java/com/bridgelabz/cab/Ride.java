package com.bridgelabz.cab;

public class Ride {
    public int time;
    public double distance;
    public RideCategory category;

    public Ride(double distance, int time){
        this.distance= distance;
        this.time = time;
    }
    public Ride(RideCategory category, double distance, int time) {
        this.distance = distance;
        this.time = time;
        this.category = category;
    }
}
