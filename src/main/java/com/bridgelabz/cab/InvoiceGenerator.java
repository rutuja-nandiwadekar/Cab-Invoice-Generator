package com.bridgelabz.cab;

import java.util.HashMap;
import java.util.Map;

public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KM = 10;
    private static final int MINIMUM_COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;
    static Map map = new HashMap();

    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KM + time * MINIMUM_COST_PER_TIME;
        return Math.max(totalFare, MINIMUM_FARE);
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride:rides){
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }

    public void addRides(String userId, Ride[] rides) {
        map.put(userId, rides);
    }

    public InvoiceSummary getInvoiceService(String userId) {
        Ride[] ride = (Ride[]) map.get(userId);
        InvoiceSummary invoiceSummary = new InvoiceGenerator().calculateFare(ride);
        return invoiceSummary;
    }

    public void calculateFare(String userId, Ride[] rides) {
    }
}
