package com.foo.client;/**
 * Author: wge
 * Date: 04/04/2013
 * Time: 16:30
 */

import com.company.Account;
import com.company.api.AccountService;
import org.apache.log4j.Logger;

import java.util.List;

public class AccountClientImpl
{
    private static final Logger log = Logger.getLogger(AccountClientImpl.class);

    private AccountService service;

    public AccountClientImpl(AccountService service) {
        this.service = service;
    }

    public void foo() {
            Account account = new Account();
            account.setName("fred");
            service.insertAccount(account);

            List<Account> foundAccountsMatchingFred  = service.getAccounts("fred");

            int x = 2; //there should be one...
    }

}
