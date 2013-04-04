package com.company.api;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Car
{
    @WebMethod(operationName="getModel")
    String getModel();
}
