package com.bridgelabz.cab;

public class InvoiceService {
    private static final double MINIMUM_COST_PER_KM = 10;
    private static final int MINIMUM_COST_PER_TIME = 1;

    public double calculateFare(double distance, int time) {
        return distance* MINIMUM_COST_PER_KM + time * MINIMUM_COST_PER_TIME;
    }
}
