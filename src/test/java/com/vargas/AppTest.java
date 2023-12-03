package com.vargas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }
    
    @Test
    public void fibonacciOf10Is55() {

        assertEquals(55,App.calculateFibonacci(10));
    }
    
    @Test
    public void fibonacciOf5Is5() {

        assertEquals(5,App.calculateFibonacci(5));

    }

    @Test
    public void fibonacciOf0Is() {

        assertEquals(0,App.calculateFibonacci(0));

    }
    @Test(expected = IllegalArgumentException.class)
    public void fibonacciOfNegative() {
        assertEquals(0 ,App.calculateFibonacci(-1));
    }    
}
