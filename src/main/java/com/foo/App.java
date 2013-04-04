package com.foo;

import com.company.api.Car;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static final Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("client-beans.xml");
        Car service = (Car) ctx.getBean("carWebService");

        log.info(service.getModel());
    }
}


