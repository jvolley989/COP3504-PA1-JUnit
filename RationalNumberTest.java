/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import RationalNumber.RationalNumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jennawheeler
 */
public class RationalNumberTest {

    public RationalNumberTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class RationalNumber.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RationalNumber.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetNumerator(){
        System.out.println("Test getNumerator");
        
        RationalNumber test1 = new RationalNumber();
        
        test1.setNumerator((int) -5);
        assertEquals((int) -5, test1.getNumerator());
        
        test1.setNumerator((int) 0);
        asserEquals((int)0, test1.getNumerator);
        
        test1.setNumerator((int) 6);
        asserEquals((int)6, test1.getNumerator);
        
    }
    
    @Test
    public void testGetDenominator() {
        System.out.println("Test getDenominator");
        
        RationalNumber test2 = new RationalNumber();
        
        test2.setNumerator((int) -3);
        assertEquals((int) -3, test2.getNumerator());
        
        test2.setNumerator((int) 0);
        asserEquals((int)0, test2.getNumerator);
        
        test2.setNumerator((int) 7);
        asserEquals((double)7, test2.getNumerator);
        
               
    }
    
    @Test

}