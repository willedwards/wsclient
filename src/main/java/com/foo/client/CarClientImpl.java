package com.foo.client;

/**
 * Author: wge
 * Date: 04/04/2013
 * Time: 16:30
 *
 * The package foo is here to show that no magic is required in terms of matching package names.
 */

import com.company.Petrol;
import com.company.ws.CarService;
import org.apache.log4j.Logger;

public class CarClientImpl
{
    private static final Logger log = Logger.getLogger(CarClientImpl.class);

    private CarService service;

    public  CarClientImpl(CarService service) {
        this.service = service;
    }

    // This does a number of things, but the unit tests break each part up into testable methods.
    public void fillUp() {

        log.info("model = " + service.getModel());

        Petrol fuel = new Petrol();
        fuel.litres = 5.0;
        service.addPetrol(fuel);

        log.info("is full = " + service.isFull());

    }

}
