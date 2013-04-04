package com.company.ws;/**
 * Author: wge
 * Date: 04/04/2013
 * Time: 16:34
 */

import com.company.Account;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface RemoteAccountService extends Remote
{
        public void insertAccount(Account account) throws RemoteException;

        public List<Account> getAccounts(String name) throws RemoteException;
}

