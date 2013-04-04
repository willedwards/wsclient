package com.foo.client;/**
 * Author: wge
 * Date: 04/04/2013
 * Time: 16:30
 */

import com.company.ws.CarService;
import org.apache.log4j.Logger;

public class CarClientImpl
{
    private static final Logger log = Logger.getLogger(CarClientImpl.class);

    private CarService service;

    public  CarClientImpl(CarService service) {
        this.service = service;
    }

    public void foo() {
            String model = service.getModel();
            log.info("model = " + model);
    }

}
