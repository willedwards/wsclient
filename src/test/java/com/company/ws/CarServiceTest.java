package com.company.ws;/**
 * Author: wge
 * Date: 04/04/2013
 * Time: 22:16
 */

import com.company.Petrol;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class CarServiceTest
{
    private static final Logger log = Logger.getLogger(CarServiceTest.class);

    private CarService classUnderTest;

    @Before
    public void setUp() throws Exception
    {   ApplicationContext ctx = new ClassPathXmlApplicationContext("client-beans.xml");

        classUnderTest = (CarService) ctx.getBean("carWebService");
    }

    @After
    public void tearDown() throws Exception
    {
        classUnderTest.drainTank();
        classUnderTest = null;
    }

    @Test
    public void testGetModel()
    {
        String model = classUnderTest.getModel();
        assert (model != null);
        assertEquals(model, "Bentley");
    }


    @Test
    public void testAdd40LitresOfPetrol()
    {
        //execute
        classUnderTest.addPetrol(buildAmountInLitres(40.0));

        //inspect
        assert (classUnderTest.isFull() == Boolean.FALSE);
    }

    @Test
    public void testIsFull()
    {
        //execute
        classUnderTest.addPetrol(buildAmountInLitres(30.0));

        //inspect
        assert (classUnderTest.isFull() == Boolean.FALSE);
    }

    //This test fails if added in. Which shows that the Mock is wrong, and remodelling is needed.
    @Test
    public void testAdd120LitresOfPetrol()
    {
        //execute
        classUnderTest.drainTank();
        classUnderTest.addPetrol(buildAmountInLitres(120.0));

        //inspect
        assert (classUnderTest.isFull() == Boolean.TRUE);
    }

    private static Petrol buildAmountInLitres(Double amount)
    {
        Petrol petrol = new Petrol();
        petrol.litres = amount;
        return petrol;
    }
}
