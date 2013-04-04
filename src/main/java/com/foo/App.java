package com.foo;

import com.foo.client.AccountClientImpl;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static final Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("client-beans.xml");

        //CarService service = (CarService) ctx.getBean("carWebService");
        //CarClientImpl service = (CarClientImpl) ctx.getBean("carClient");
        AccountClientImpl service = (AccountClientImpl) ctx.getBean("accountClient");

        service.foo();
    }
}


