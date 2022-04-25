package com.bridgelabz.cab;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        //new InvoiceGenerator = obj , InvoiceGenerator()=constructor
        //alt enter instance variable step 2
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        //delta for deprecated
        Assert.assertEquals(25, fare, 0.0);
    }
    
    //STEP 1 V2 : Minimum Fare
    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance =0.1;
        int time =1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5,fare,0.0);
    }

    //STEP 2 : Multiple rides
    @Test
    public void givenMultipleRides_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides ={new Ride(2.0,5),
                new Ride(0.1,1) };
        double fare = invoiceGenerator.calculateFare(rides);
        Assert.assertEquals(30,fare,0.0);
    }
}

