package com.company.api;

import com.company.Account;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface AccountService {

    @WebMethod
    public void insertAccount(Account account);

    @WebMethod
    public List<Account> getAccounts(String name);
}