package com.foo;

import com.foo.client.CarClientImpl;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static final Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("client-beans.xml");

        CarClientImpl service = (CarClientImpl) ctx.getBean("carClient");

        service.fillUp();

    }
}


