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
        asserEquals((int)7, test2.getNumerator);
        
               
    }
    
    @Test
    public void testSetNumerator(){
        System.out.println("Test setNumerator");
        
        RationalNumber test3 = new RationalNumber();
        
        test3.setNumerator((int) -7);
        assertEquals((int) -7, test3.getNumerator());
        
        test3.setNumerator((int) 0);
        asserEquals((int) 0, test3.getNumerator());
        
        test3.setNumerator((int) 8);
        asserEquals((int) 8, test3.getNumerator());        
    }
    
    @Test
    public void testSetDenominator(){
        System.out.println("Test setDenominator");
        
        RationalNumber test4 = new RationalNumber();
        
        test4.setNumerator((int) -2);
        assertEquals((int) -2, test4.getNumerator());
        
        test4.setNumerator((int) 0);
        assertEquals((int) 0, test4.getNumerator());
        
        test4.setNumerator((int) 6);
        assertEquals((int) 6, test4.getNumerator());        
    }
    
    @Test
    public void testPerform() {
        System.out.println("Test perform");
        
        //Setup the internal rationals to test against
        RationalNumber negativeFourEights = new RationalNumber(-4, 8);
        RationalNumber negativeThreeHalves = new RationalNumber(-3, 2);
        RationalNumber fourOverZero = new RationalNumber(4, 0);
        RationalNumber zeroOverZero = new RationalNumber(0, 0);
        RationalNumber sixEights = new RationalNumber(6, 8);
        RationalNumber sevenThirds = new RationalNumber(7, 3);
        
        //Setup the rationals to pass to the rationals to test against
        RationalNumber negativeTwoSevenths = new RationalNumber(-2, 7);
        RationalNumber oneOverZero = new RationalNumber(1, 0);
        RationalNumber zeroOverZero_too = new RationalNumber(0, 0);
        RationalNumber fiveSevenths = new RationalNumber(5, 7);
        RationalNumber negativeFourThirds = new RationalNumber(-4, 3);
        RationalNumber fiveHalves = new RationalNumber(5, 2);
        
        
        //ADD SECTION
        assertEquals((int) -44, negativeFourEights.perform("add", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 56, negativeFourEights.perform("add", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, negativeFourEights.perform("add", zeroOverZero).getNumerator());
          //assertEquals((int) 8, negativeFourEights.perform("add", zeroOverZero).getNumerator());
        
        assertEquals((int) 12, negativeFourEights.perform("add", fiveSevenths).getNumerator()); 
        assertEquals((int) 56, negativeFourEights.perform("add", fiveSevenths).getDenominator());
        
        //SUBTRACT SECTION
        
        //MULTIPLY SECTION
        
        //DIVIDE SECTION
    }
}