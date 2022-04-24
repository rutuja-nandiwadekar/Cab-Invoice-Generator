package com.bridgelabz.cab;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        //new InvoiceService = obj , InvoiceService()=constructor
        //alt enter instance variable step 2
        InvoiceService invoiceService = new InvoiceService();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceService.calculateFare(distance, time);
        //delta for deprecated
        Assert.assertEquals(25, fare, 0.0);
    }
    //STEP 1 V2 : Minimum Fare
    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinFare(){
        InvoiceService invoiceGenerator = new InvoiceService();
        double distance =0.1;
        int time =1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5,fare,0.0);
    }
}

