package com.company.ws;

import com.company.Petrol;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CarService
{
    @WebMethod
    String getModel();

    @WebMethod
    void addPetrol(Petrol petrol);

    @WebMethod
    Boolean isFull();
}
