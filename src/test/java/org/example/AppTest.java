package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.example.App.fizzBuzz;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testFizzBuzz(){
      assertEquals("1",fizzBuzz(1));
      assertEquals("2",fizzBuzz(2));
      assertEquals("FIZZ",fizzBuzz(3));
      assertEquals("4",fizzBuzz(4));
      assertEquals("BUZZ",fizzBuzz(5));
      assertEquals("FIZZ",fizzBuzz(6));
      assertEquals("FIZZBUZZ",fizzBuzz(15));

    }
}
