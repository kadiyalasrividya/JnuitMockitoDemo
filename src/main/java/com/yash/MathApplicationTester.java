package com.yash;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

    // @RunWith attaches a runner with the test class to initialize the test data
    @RunWith(MockitoJUnitRunner.class)
    public class MathApplicationTester {
        //@InjectMocks annotation is used to create and inject the mock object
        @InjectMocks
        MathApplication mathApplication = new MathApplication();
        //@Mock annotation is used to create the mock object to be injected
        @Mock
        CalculatorService calcService;
        @Test
        public void testAdd(){
            when(calcService.add(10.0,20.0)).thenReturn(30.00);
            Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
        }
        @Test
        public void testSub(){
            when(calcService.subtract(20.0,10.0)).thenReturn(10.00);
            Assert.assertEquals(mathApplication.subtract(20.0, 10.0),10.0,0);
        }
        @Test
        public void testMul(){
            when(calcService.multiply(5.0,2.0)).thenReturn(10.00);
            Assert.assertEquals(mathApplication.multiply(5.0, 2.0),10.0,0);
        }
}
