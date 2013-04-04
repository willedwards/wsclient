package com.company.mock;/**
 * Author: wge
 * Date: 04/04/2013
 * Time: 22:10
 */

import com.company.Petrol;
import com.company.ws.CarService;
import org.apache.log4j.Logger;


public class RollsRoyceServiceInMemory implements CarService
{
    private static final Logger log = Logger.getLogger(RollsRoyceServiceInMemory.class);

    private static final Double MAX_LIMIT = 120.0;

    private Double fuelLevel = 0.0;

    @Override
    public String getModel()
    {
        return "Bently";
    }

    @Override
    public void addPetrol(Petrol petrol)
    {
        //lets just keep adding 30 each time
        fuelLevel += 30;
    }

    @Override
    public Boolean isFull()
    {
        return (fuelLevel > MAX_LIMIT);
    }
}
