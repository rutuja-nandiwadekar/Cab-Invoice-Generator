package com.bridgelabz.cab;

public enum RideCategory implements InvoiceGenerator {
    PREMIUM(15,2,20),NORMAL(10,1,5);

    public double minimumFarePerRide;
    public int pricePerMin;
    public double pricePerKm;

    RideCategory(double pricePerKm, int pricePerMin, double minimumFarePerRide) {
        this.pricePerKm=pricePerKm;
        this.pricePerMin=pricePerMin;
        this.minimumFarePerRide = minimumFarePerRide;
    }

    @Override
    public double calculateCategoryFare(double distance, int time) {
        double totalFare = distance*pricePerKm+time*pricePerMin;
        return Math.max(totalFare,minimumFarePerRide);
    }
}