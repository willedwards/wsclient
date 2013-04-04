package com.foo.client;
/**
 * Author: wge
 * Date: 04/04/2013
 * Time: 11:44
 */

import com.company.api.Car;
import org.apache.log4j.Logger;

public class CarServiceImpl
{
    private static final Logger log = Logger.getLogger(CarServiceImpl.class);

    private final Car service;

    public CarServiceImpl(Car service) {
        this.service = service;
    }

    public String fooGetModel() {
       return  service.getModel();
    }

}
