package com.bridgelabz.cab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceGeneratorTest {
    InvoiceGenerator invoiceGenerator = null;
    @Before
    public void setUp() throws Exception {
        invoiceGenerator = new InvoiceGenerator();
    }
    //STEP 1 : Calculate Fare
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        //new InvoiceGenerator = obj , InvoiceGenerator()=constructor
        //alt enter instance variable step 2
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        //delta for deprecated
        Assert.assertEquals(25, fare, 0.0);
    }
    
    //STEP 2 : Minimum Fare
    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinFare(){
        double distance =0.1;
        int time =1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5,fare,0.0);
    }

    //STEP 3 : Enhanced Invoice
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)};
        InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }

    //STEP 4 : Invoice Service
    @Test
    public void givenUserAndRides_ShouldReturnInvoiceSummary() {
        String user1 = "abc.com";
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)};
        invoiceGenerator.addRides(user1, rides);
        String user2 = "abcd.com";
        Ride[] rides1 = {new Ride(2.0, 5),
                new Ride(0.1, 1)};
        invoiceGenerator.addRides(user2, rides1);
        InvoiceSummary summary = invoiceGenerator.getInvoiceService(user1);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }
}

