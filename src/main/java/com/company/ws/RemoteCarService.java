package com.company.ws;/**
 * Author: wge
 * Date: 04/04/2013
 * Time: 16:34
 */

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface RemoteCarService extends Remote
{
        public String getModel() throws RemoteException;

}

