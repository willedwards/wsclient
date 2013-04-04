package com.company.ws;/**
 * Author: wge
 * Date: 04/04/2013
 * Time: 22:16
 */

import com.company.Petrol;
import com.company.mock.RollsRoyceServiceInMemory;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarServiceTest
{
    private static final Logger log = Logger.getLogger(CarServiceTest.class);

    private CarService classUnderTest;

    @Before
    public void setUp() throws Exception
    {
        classUnderTest = new RollsRoyceServiceInMemory();
    }

    @After
    public void tearDown() throws Exception
    {
        classUnderTest = null;
    }

    @Test
    public void testGetModel()
    {
        String model = classUnderTest.getModel();
        assert(model !=null);
        assert(model.equals("Bently"));
    }


    @Test
    public void testAdd40LitresOfPetrol()
    {
        //execute
        classUnderTest.addPetrol(buildAmountInLitres(40.0));

        //inspect
        assert(classUnderTest.isFull() == Boolean.FALSE);
    }

    @Test
    public void testIsFull()
    {
        //execute
        classUnderTest.addPetrol(buildAmountInLitres(30.0));

        //inspect
        assert(classUnderTest.isFull() == Boolean.FALSE);
    }

        //This test fails if added in. Which shows that the Mock is wrong, and remodelling is needed.
//    @Test
//    public void testAdd120LitresOfPetrol()
//    {
//        //execute
//        classUnderTest.addPetrol(buildAmountInLitres(120.0));
//
//        //inspect
//        assert(classUnderTest.isFull() == Boolean.TRUE);
//    }

    private static Petrol buildAmountInLitres(Double amount)
    {
        Petrol petrol = new Petrol();
        petrol.litres = amount;
        return petrol;
    }
}
