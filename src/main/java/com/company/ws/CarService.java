package com.company.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CarService
{
    @WebMethod
    String getModel();
}
