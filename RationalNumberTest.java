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

  //extends java.lang.RationalNumber; (see my comment in the mult section to see why I put this), Jenna

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
        
        // -4/8
        assertEquals((int) -44, negativeFourEights.perform("add", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 56, negativeFourEights.perform("add", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, negativeFourEights.perform("add", zeroOverZero).getNumerator());
          //assertEquals((int) 8, negativeFourEights.perform("add", zeroOverZero).getNumerator());
        
        assertEquals((int) 12, negativeFourEights.perform("add", fiveSevenths).getNumerator()); 
        assertEquals((int) 56, negativeFourEights.perform("add", fiveSevenths).getDenominator());
        
        assertEquals((int) -44, negativeFourEights.perform("add", negativeFourThirds).getNumerator()); 
        assertEquals((int) 24, negativeFourEights.perform("add", negativeFourThirds).getDenominator());
        
        assertEquals((int) 32, negativeFourEights.perform("add", fiveHalves).getNumerator()); 
        assertEquals((int) 16, negativeFourEights.perform("add", fiveHalves).getDenominator());
        
        // -3/2
        assertEquals((int) -25, negativeThreeHalves.perform("add", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 14, negativeThreeHalves.perform("add", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, negativeThreeHalves.perform("add", zeroOverZero).getNumerator());
          //assertEquals((int) 8, negativeThreeHalves.perform("add", zeroOverZero).getNumerator());
        
        assertEquals((int) -11, negativeThreeHalves.perform("add", fiveSevenths).getNumerator()); 
        assertEquals((int) 14, negativeThreeHalves.perform("add", fiveSevenths).getDenominator());
        
        assertEquals((int) -17, negativeThreeHalves.perform("add", negativeFourThirds).getNumerator()); 
        assertEquals((int) 6, negativeThreeHalves.perform("add", negativeFourThirds).getDenominator());
        
        assertEquals((int) 2, negativeThreeHalves.perform("add", fiveHalves).getNumerator()); 
        assertEquals((int) 2, negativeThreeHalves.perform("add", fiveHalves).getDenominator());
        
        // 6/8
        assertEquals((int) 26, sixEights.perform("add", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 56, sixEights.perform("add", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, sixEights.perform("add", zeroOverZero).getNumerator());
          //assertEquals((int) 8, sixEights.perform("add", zeroOverZero).getNumerator());
        
        assertEquals((int) 82, sixEights.perform("add", fiveSevenths).getNumerator()); 
        assertEquals((int) 56, sixEights.perform("add", fiveSevenths).getDenominator());
        
        assertEquals((int) -14, sixEights.perform("add", negativeFourThirds).getNumerator()); 
        assertEquals((int) 24, sixEights.perform("add", negativeFourThirds).getDenominator());
        
        assertEquals((int) 52, sixEights.perform("add", fiveHalves).getNumerator()); 
        assertEquals((int) 16, sixEights.perform("add", fiveHalves).getDenominator());
        
        // 7/3
        assertEquals((int) 43, sevenThirds.perform("add", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 21, sevenThirds.perform("add", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, sevenThirds.perform("add", zeroOverZero).getNumerator());
          //assertEquals((int) 8, sevenThirds.perform("add", zeroOverZero).getNumerator());
        
        assertEquals((int) 64, sevenThirds.perform("add", fiveSevenths).getNumerator()); 
        assertEquals((int) 21, sevenThirds.perform("add", fiveSevenths).getDenominator());
        
        assertEquals((int) 9, sevenThirds.perform("add", negativeFourThirds).getNumerator()); 
        assertEquals((int) 9, sevenThirds.perform("add", negativeFourThirds).getDenominator());
        
        assertEquals((int) 29, sevenThirds.perform("add", fiveHalves).getNumerator()); 
        assertEquals((int) 6, sevenThirds.perform("add", fiveHalves).getDenominator());
        
        //SUBTRACT SECTION
        
        // -4/8
        assertEquals((int) -12, negativeFourEights.perform("sub", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 56, negativeFourEights.perform("sub", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, negativeFourEights.perform("sub", zeroOverZero).getNumerator());
          //assertEquals((int) 8, negativeFourEights.perform("sub", zeroOverZero).getNumerator());
        
        assertEquals((int) -68, negativeFourEights.perform("sub", fiveSevenths).getNumerator()); 
        assertEquals((int) 56, negativeFourEights.perform("sub", fiveSevenths).getDenominator());
        
        assertEquals((int) 20, negativeFourEights.perform("sub", negativeFourThirds).getNumerator()); 
        assertEquals((int) 24, negativeFourEights.perform("sub", negativeFourThirds).getDenominator());
        
        assertEquals((int) -48, negativeFourEights.perform("sub", fiveHalves).getNumerator()); 
        assertEquals((int) 16, negativeFourEights.perform("sub", fiveHalves).getDenominator());
        
        // -3/2
        assertEquals((int) -17, negativeThreeHalves.perform("sub", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 14, negativeThreeHalves.perform("sub", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, negativeThreeHalves.perform("sub", zeroOverZero).getNumerator());
          //assertEquals((int) 8, negativeThreeHalves.perform("sub", zeroOverZero).getNumerator());
        
        assertEquals((int) -31, negativeThreeHalves.perform("sub", fiveSevenths).getNumerator()); 
        assertEquals((int) 14, negativeThreeHalves.perform("sub", fiveSevenths).getDenominator());
        
        assertEquals((int) -17, negativeThreeHalves.perform("sub", negativeFourThirds).getNumerator()); 
        assertEquals((int) 6, negativeThreeHalves.perform("sub", negativeFourThirds).getDenominator());
        
        assertEquals((int) 8, negativeThreeHalves.perform("sub", fiveHalves).getNumerator()); 
        assertEquals((int) 2, negativeThreeHalves.perform("sub", fiveHalves).getDenominator());
        
        // 6/8
        assertEquals((int) 58, sixEights.perform("sub", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 56, sixEights.perform("sub", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, sixEights.perform("sub", zeroOverZero).getNumerator());
          //assertEquals((int) 8, sixEights.perform("sub", zeroOverZero).getNumerator());
        
        assertEquals((int) 82, sixEights.perform("sub", fiveSevenths).getNumerator()); 
        assertEquals((int) 56, sixEights.perform("sub", fiveSevenths).getDenominator());
        
        assertEquals((int) 2, sixEights.perform("sub", negativeFourThirds).getNumerator()); 
        assertEquals((int) 24, sixEights.perform("sub", negativeFourThirds).getDenominator());
        
        assertEquals((int) -28, sixEights.perform("sub", fiveHalves).getNumerator()); 
        assertEquals((int) 16, sixEights.perform("sub", fiveHalves).getDenominator());
        
        // 7/3
        assertEquals((int) 55, sevenThirds.perform("sub", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 21, sevenThirds.perform("sub", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, sevenThirds.perform("sub", zeroOverZero).getNumerator());
          //assertEquals((int) 8, sevenThirds.perform("sub", zeroOverZero).getNumerator());
        
        assertEquals((int) 34, sevenThirds.perform("sub", fiveSevenths).getNumerator()); 
        assertEquals((int) 21, sevenThirds.perform("sub", fiveSevenths).getDenominator());
        
        assertEquals((int) 11, sevenThirds.perform("sub", negativeFourThirds).getNumerator()); 
        assertEquals((int) 3, sevenThirds.perform("sub", negativeFourThirds).getDenominator());
        
        assertEquals((int) -1, sevenThirds.perform("sub", fiveHalves).getNumerator()); 
        assertEquals((int) 6, sevenThirds.perform("sub", fiveHalves).getDenominator());
        
        //MULTIPLY SECTION
        
          //negativeFourEights
        assertEquals((int) 8, negativeFourEights.perform("mult", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, negativeFourEights.perform("mult", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.perform("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.perform("mult", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, negativeFourEights.perform("mult", zeroOverZero).getNumerator());
        //assertEquals((int) 0, negativeFourEights.perform("mult", zeroOverZero).getDenominator());
        
        assertEquals((int) 20, negativeFourEights.perform("mult", fiveSevenths).getNumerator());
        assertEquals((int) 56, negativeFourEights.perform("mult", fiveSevenths).getDenominator());
        
        assertEquals((int) 16, negativeFourEights.perform("mult", negativeFourThirds).getNumerator());
        assertEquals((int) 24, negativeFourEights.perform("mult", negativeFourThirds).getDenominator());
        
        assertEquals((int) -20, negativeFourEights.perform("mult", fiveHalves).getNumerator());
        assertEquals((int) 16, negativeFourEights.perform("mult", fiveHalves).getDenominator());
        
        
          //negativeThreeHalves
        assertEquals((int) 6, negativeThreeHalves.perform("mult", negativeTwoSevenths).getNumerator());
        assertEquals((int) 14, negativeThreeHalves.perform("mult", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.perform("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.perform("mult", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        // assertEquals((int) 0, negativeThreeHalves.perform("mult", zeroOverZero).getNumerator());
        // assertEquals((int) 0, negativeThreeHalves.perform("mult", zeroOverZero).getDenominator());
        
        assertEquals((int) -15, negativeThreeHalves.perform("mult", fiveSevenths).getNumerator());
        assertEquals((int) 14, negativeThreeHalves.perform("mult", fiveSevenths).getDenominator());
        
        assertEquals((int) 12, negativeThreeHalves.perform("mult", negativeFourThirds).getNumerator());
        assertEquals((int) 6, negativeThreeHalves.perform("mult", negativeFourThirds).getDenominator());
        
        assertEquals((int) -15, negativeThreeHalves.perform("mult", fiveHalves).getNumerator());
        assertEquals((int) 4, negativeThreeHalves.perform("mult", fiveHalves).getDenominator());
        
        
          //fourOverZero
          /* These will all come out to be an error depending on what we chose to do with our expected value = error 
          computations. If we choose the method I indicated above then I will finish this section once we decide */
          
        assertEquals((int) 8, fourOverZero.perform("mult", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, fourOverZero.perform("mult", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, fourOverZero.perform("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, fourOverZero.perform("mult", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, fourOverZero.perform("mult", zeroOverZero).getNumerator());
        //assertEquals((int) 0, fourOverZero.perform("mult", zeroOverZero).getDenominator());
        
        assertEquals((int) 20, fourOverZero.perform("mult", fiveSevenths).getNumerator());
        assertEquals((int) 56, fourOverZero.perform("mult", fiveSevenths).getDenominator());
        
        assertEquals((int) 16, fourOverZero.perform("mult", negativeFourThirds).getNumerator());
        assertEquals((int) 24, fourOverZero.perform("mult", negativeFourThirds).getDenominator());
        
        assertEquals((int) -20, fourOverZero.perform("mult", fiveHalves).getNumerator());
        assertEquals((int) 16, fourOverZero.perform("mult", fiveHalves).getDenominator());
        
        
          //zeroOverZero
          /*Not sure if 0/0 returns 0/0 or error*/
          
        assertEquals((int) 8, zeroOverZero.perform("mult", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, zeroOverZero.perform("mult", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, zeroOverZero.perform("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, zeroOverZero.perform("mult", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, zeroOverZero.perform("mult", zeroOverZero).getNumerator());
        //assertEquals((int) 0, zeroOverZero.perform("mult", zeroOverZero).getDenominator());
        
        assertEquals((int) 20, zeroOverZero.perform("mult", fiveSevenths).getNumerator());
        assertEquals((int) 56, zeroOverZero.perform("mult", fiveSevenths).getDenominator());
        
        assertEquals((int) 16, zeroOverZero.perform("mult", negativeFourThirds).getNumerator());
        assertEquals((int) 24, zeroOverZero.perform("mult", negativeFourThirds).getDenominator());
        
        assertEquals((int) -20, zeroOverZero.perform("mult", fiveHalves).getNumerator());
        assertEquals((int) 16, zeroOverZero.perform("mult", fiveHalves).getDenominator());
        
        
        //sixEights
        assertEquals((int) -12, sixEights.perform("mult", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, sixEights.perform("mult", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.perform("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.perform("mult", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, sixEights.perform("mult", zeroOverZero).getNumerator());
        //assertEquals((int) 0, sixEights.perform("mult", zeroOverZero).getDenominator());
        
        assertEquals((int) 30, sixEights.perform("mult", fiveSevenths).getNumerator());
        assertEquals((int) 56, sixEights.perform("mult", fiveSevenths).getDenominator());
        
        assertEquals((int) -24, sixEights.perform("mult", negativeFourThirds).getNumerator());
        assertEquals((int) 24, sixEights.perform("mult", negativeFourThirds).getDenominator());
        
        assertEquals((int) 30, sixEights.perform("mult", fiveHalves).getNumerator());
        assertEquals((int) 16, sixEights.perform("mult", fiveHalves).getDenominator());
        
        
        //sevenThirds
        assertEquals((int) -14, sevenThirds.perform("mult", negativeTwoSevenths).getNumerator());
        assertEquals((int) 21, sevenThirds.perform("mult", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, sevenThirds.perform("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sevenThirds.perform("mult", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, sevenThirds.perform("mult", zeroOverZero).getNumerator());
        //assertEquals((int) 0, sevenThirds.perform("mult", zeroOverZero).getDenominator());
        
        assertEquals((int) 35, sevenThirds.perform("mult", fiveSevenths).getNumerator());
        assertEquals((int) 21, sevenThirds.perform("mult", fiveSevenths).getDenominator());
        
        assertEquals((int) -28, sevenThirds.perform("mult", negativeFourThirds).getNumerator());
        assertEquals((int) 9, sevenThirds.perform("mult", negativeFourThirds).getDenominator());
        
        assertEquals((int) 35, sevenThirds.perform("mult", fiveHalves).getNumerator());
        assertEquals((int) 6, sevenThirds.perform("mult", fiveHalves).getDenominator());
        
        
        
        //DIVIDE SECTION
        
          //negativeFourEights
        assertEquals((int) 28, negativeFourEights.perform("div", negativeTwoSevenths).getNumerator());
        assertEquals((int) 16, negativeFourEights.perform("div", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.perform("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.perform("div", oneOverZero).getDenominator());
   
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.perform("div", zeroOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.perform("div", zeroOverZero).getDenominator());
        
        assertEquals((int) -28, negativeFourEights.perform("div", fiveSevenths).getNumerator());
        assertEquals((int) 40, negativeFourEights.perform("div", fiveSevenths).getDenominator());
        
        assertEquals((int) 12, negativeFourEights.perform("div", negativeFourThirds).getNumerator());
        assertEquals((int) 32, negativeFourEights.perform("div", negativeFourThirds).getDenominator());
        
        assertEquals((int) -8, negativeFourEights.perform("div", fiveHalves).getNumerator());
        assertEquals((int) 40, negativeFourEights.perform("div", fiveHalves).getDenominator());
        
        
                  //negativeThreeHalves
        assertEquals((int) 21, negativeThreeHalves.perform("div", negativeTwoSevenths).getNumerator());
        assertEquals((int) 4, negativeThreeHalves.perform("div", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.perform("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.perform("div", oneOverZero).getDenominator());
        
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.perform("div", zeroOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.perform("div", zeroOverZero).getDenominator());
        
        assertEquals((int) -21, negativeThreeHalves.perform("div", fiveSevenths).getNumerator());
        assertEquals((int) 10, negativeThreeHalves.perform("div", fiveSevenths).getDenominator());
        
        assertEquals((int) 9, negativeThreeHalves.perform("div", negativeFourThirds).getNumerator());
        assertEquals((int) 8, negativeThreeHalves.perform("div", negativeFourThirds).getDenominator());
        
        assertEquals((int) -6, negativeThreeHalves.perform("div", fiveHalves).getNumerator());
        assertEquals((int) 10, negativeThreeHalves.perform("div", fiveHalves).getDenominator());
        
        
          //fourOverZero
          /* These will all come out to be an error depending on what we chose to do with our expected value = error 
          computations. If we choose the method I indicated above then I will finish this section once we decide */
          
        assertEquals((int) 8, fourOverZero.perform("div", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, fourOverZero.perform("div", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, fourOverZero.perform("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, fourOverZero.perform("div", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, fourOverZero.perform("div", zeroOverZero).getNumerator());
        //assertEquals((int) 0, fourOverZero.perform("div", zeroOverZero).getDenominator());
        
        assertEquals((int) 20, fourOverZero.perform("div", fiveSevenths).getNumerator());
        assertEquals((int) 56, fourOverZero.perform("div", fiveSevenths).getDenominator());
        
        assertEquals((int) 16, fourOverZero.perform("div", negativeFourThirds).getNumerator());
        assertEquals((int) 24, fourOverZero.perform("div", negativeFourThirds).getDenominator());
        
        assertEquals((int) -20, fourOverZero.perform("div", fiveHalves).getNumerator());
        assertEquals((int) 16, fourOverZero.perform("div", fiveHalves).getDenominator());
        
        
          //zeroOverZero
          /*Not sure if 0/0 returns 0/0 or error*/
          
        assertEquals((int) 8, zeroOverZero.perform("div", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, zeroOverZero.perform("div", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, zeroOverZero.perform("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, zeroOverZero.perform("div", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, zeroOverZero.perform("div", zeroOverZero).getNumerator());
        //assertEquals((int) 0, zeroOverZero.perform("div", zeroOverZero).getDenominator());
        
        assertEquals((int) 20, zeroOverZero.perform("div", fiveSevenths).getNumerator());
        assertEquals((int) 56, zeroOverZero.perform("div", fiveSevenths).getDenominator());
        
        assertEquals((int) 16, zeroOverZero.perform("div", negativeFourThirds).getNumerator());
        assertEquals((int) 24, zeroOverZero.perform("div", negativeFourThirds).getDenominator());
        
        assertEquals((int) -20, zeroOverZero.perform("div", fiveHalves).getNumerator());
        assertEquals((int) 16, zeroOverZero.perform("div", fiveHalves).getDenominator());
        
        
        //sixEights
        assertEquals((int) -42, sixEights.perform("div", negativeTwoSevenths).getNumerator());
        assertEquals((int) 16, sixEights.perform("div", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.perform("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.perform("div", oneOverZero).getDenominator());
        
        
       /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.perform("div", zeroOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.perform("div", zeroOverZero).getDenominator());
        
        
        assertEquals((int) 42, sixEights.perform("div", fiveSevenths).getNumerator());
        assertEquals((int) 40, sixEights.perform("div", fiveSevenths).getDenominator());
        
        assertEquals((int) -18, sixEights.perform("div", negativeFourThirds).getNumerator());
        assertEquals((int) 32, sixEights.perform("div", negativeFourThirds).getDenominator());
        
        assertEquals((int) 12, sixEights.perform("div", fiveHalves).getNumerator());
        assertEquals((int) 40, sixEights.perform("div", fiveHalves).getDenominator());
        
        
        //sevenThirds
        assertEquals((int) -49, sevenThirds.perform("div", negativeTwoSevenths).getNumerator());
        assertEquals((int) 6, sevenThirds.perform("div", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, sevenThirds.perform("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sevenThirds.perform("div", oneOverZero).getDenominator());
        
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.perform("div", zeroOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.perform("div", zeroOverZero).getDenominator());
        
        
        assertEquals((int) 49, sevenThirds.perform("div", fiveSevenths).getNumerator());
        assertEquals((int) 15, sevenThirds.perform("div", fiveSevenths).getDenominator());
        
        assertEquals((int) -21, sevenThirds.perform("div", negativeFourThirds).getNumerator());
        assertEquals((int) 12, sevenThirds.perform("div", negativeFourThirds).getDenominator());
        
        assertEquals((int) 14, sevenThirds.perform("div", fiveHalves).getNumerator());
        assertEquals((int) 15, sevenThirds.perform("div", fiveHalves).getDenominator());
    }


@Test
    public void testAddRational() {
        System.out.println("Test addRational");
        
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
        
        
        //ADDITION
        
        // -4/8
        assertEquals((int) -44, negativeFourEights.addRational("add", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 56, negativeFourEights.addRational("add", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, negativeFourEights.perform("add", zeroOverZero).getNumerator());
          //assertEquals((int) 8, negativeFourEights.perform("add", zeroOverZero).getNumerator());
        
        assertEquals((int) 12, negativeFourEights.addRational("add", fiveSevenths).getNumerator()); 
        assertEquals((int) 56, negativeFourEights.addRational("add", fiveSevenths).getDenominator());
        
        assertEquals((int) -44, negativeFourEights.addRational("add", negativeFourThirds).getNumerator()); 
        assertEquals((int) 24, negativeFourEights.addRational("add", negativeFourThirds).getDenominator());
        
        assertEquals((int) 32, negativeFourEights.addRational("add", fiveHalves).getNumerator()); 
        assertEquals((int) 16, negativeFourEights.addRational("add", fiveHalves).getDenominator());
        
        // -3/2
        assertEquals((int) -25, negativeThreeHalves.addRational("add", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 14, negativeThreeHalves.addRational("add", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, negativeThreeHalves.perform("add", zeroOverZero).getNumerator());
          //assertEquals((int) 8, negativeThreeHalves.perform("add", zeroOverZero).getNumerator());
        
        assertEquals((int) -11, negativeThreeHalves.addRational("add", fiveSevenths).getNumerator()); 
        assertEquals((int) 14, negativeThreeHalves.addRational("add", fiveSevenths).getDenominator());
        
        assertEquals((int) -17, negativeThreeHalves.addRational("add", negativeFourThirds).getNumerator()); 
        assertEquals((int) 6, negativeThreeHalves.addRational("add", negativeFourThirds).getDenominator());
        
        assertEquals((int) 2, negativeThreeHalves.addRational("add", fiveHalves).getNumerator()); 
        assertEquals((int) 2, negativeThreeHalves.addRational("add", fiveHalves).getDenominator());
        
        // 6/8
        assertEquals((int) 26, sixEights.addRational("add", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 56, sixEights.addRational("add", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, sixEights.perform("add", zeroOverZero).getNumerator());
          //assertEquals((int) 8, sixEights.perform("add", zeroOverZero).getNumerator());
        
        assertEquals((int) 82, sixEights.addRational("add", fiveSevenths).getNumerator()); 
        assertEquals((int) 56, sixEights.addRational("add", fiveSevenths).getDenominator());
        
        assertEquals((int) -14, sixEights.addRational("add", negativeFourThirds).getNumerator()); 
        assertEquals((int) 24, sixEights.addRational("add", negativeFourThirds).getDenominator());
        
        assertEquals((int) 52, sixEights.addRational("add", fiveHalves).getNumerator()); 
        assertEquals((int) 16, sixEights.addRational("add", fiveHalves).getDenominator());
        
        // 7/3
        assertEquals((int) 43, sevenThirds.addRational("add", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 21, sevenThirds.addRational("add", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, sevenThirds.perform("add", zeroOverZero).getNumerator());
          //assertEquals((int) 8, sevenThirds.perform("add", zeroOverZero).getNumerator());
        
        assertEquals((int) 64, sevenThirds.addRational("add", fiveSevenths).getNumerator()); 
        assertEquals((int) 21, sevenThirds.addRational("add", fiveSevenths).getDenominator());
        
        assertEquals((int) 9, sevenThirds.addRational("add", negativeFourThirds).getNumerator()); 
        assertEquals((int) 9, sevenThirds.addRational("add", negativeFourThirds).getDenominator());
        
        assertEquals((int) 29, sevenThirds.addRational("add", fiveHalves).getNumerator()); 
        assertEquals((int) 6, sevenThirds.addRational("add", fiveHalves).getDenominator());
}
        
        @Test
    public void testSubRational() {
        System.out.println("Test subRational");
        
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
        
        
        //SUBTRACTION
        
        // -4/8
        assertEquals((int) -12, negativeFourEights.subRational("sub", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 56, negativeFourEights.subRational("sub", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, negativeFourEights.perform("sub", zeroOverZero).getNumerator());
          //assertEquals((int) 8, negativeFourEights.perform("sub", zeroOverZero).getNumerator());
        
        assertEquals((int) -68, negativeFourEights.subRational("sub", fiveSevenths).getNumerator()); 
        assertEquals((int) 56, negativeFourEights.subRational("sub", fiveSevenths).getDenominator());
        
        assertEquals((int) 20, negativeFourEights.subRational("sub", negativeFourThirds).getNumerator()); 
        assertEquals((int) 24, negativeFourEights.subRational("sub", negativeFourThirds).getDenominator());
        
        assertEquals((int) -48, negativeFourEights.subRational("sub", fiveHalves).getNumerator()); 
        assertEquals((int) 16, negativeFourEights.subRational("sub", fiveHalves).getDenominator());
        
        // -3/2
        assertEquals((int) -17, negativeThreeHalves.subRational("sub", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 14, negativeThreeHalves.subRational("sub", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, negativeThreeHalves.perform("sub", zeroOverZero).getNumerator());
          //assertEquals((int) 8, negativeThreeHalves.perform("sub", zeroOverZero).getNumerator());
        
        assertEquals((int) -31, negativeThreeHalves.subRational("sub", fiveSevenths).getNumerator()); 
        assertEquals((int) 14, negativeThreeHalves.subRational("sub", fiveSevenths).getDenominator());
        
        assertEquals((int) -17, negativeThreeHalves.subRational("sub", negativeFourThirds).getNumerator()); 
        assertEquals((int) 6, negativeThreeHalves.subRational("sub", negativeFourThirds).getDenominator());
        
        assertEquals((int) 8, negativeThreeHalves.subRational("sub", fiveHalves).getNumerator()); 
        assertEquals((int) 2, negativeThreeHalves.subRational("sub", fiveHalves).getDenominator());
        
        // 6/8
        assertEquals((int) 58, sixEights.subRational("sub", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 56, sixEights.subRational("sub", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, sixEights.perform("sub", zeroOverZero).getNumerator());
          //assertEquals((int) 8, sixEights.perform("sub", zeroOverZero).getNumerator());
        
        assertEquals((int) 82, sixEights.subRational("sub", fiveSevenths).getNumerator()); 
        assertEquals((int) 56, sixEights.subRational("sub", fiveSevenths).getDenominator());
        
        assertEquals((int) 2, sixEights.subRational("sub", negativeFourThirds).getNumerator()); 
        assertEquals((int) 24, sixEights.subRational("sub", negativeFourThirds).getDenominator());
        
        assertEquals((int) -28, sixEights.subRational("sub", fiveHalves).getNumerator()); 
        assertEquals((int) 16, sixEights.subRational("sub", fiveHalves).getDenominator());
        
        // 7/3
        assertEquals((int) 55, sevenThirds.subRational("sub", negativeTwoSevenths).getNumerator()); 
        assertEquals((int) 21, sevenThirds.subRational("sub", negativeTwoSevenths).getDenominator());
        
          //Umm, shouldn't this throw an error because adding 0/0?
          //assertEquals((int) -4, sevenThirds.perform("sub", zeroOverZero).getNumerator());
          //assertEquals((int) 8, sevenThirds.perform("sub", zeroOverZero).getNumerator());
        
        assertEquals((int) 34, sevenThirds.subRational("sub", fiveSevenths).getNumerator()); 
        assertEquals((int) 21, sevenThirds.subRational("sub", fiveSevenths).getDenominator());
        
        assertEquals((int) 11, sevenThirds.subRational("sub", negativeFourThirds).getNumerator()); 
        assertEquals((int) 3, sevenThirds.subRational("sub", negativeFourThirds).getDenominator());
        
        assertEquals((int) -1, sevenThirds.subRational("sub", fiveHalves).getNumerator()); 
        assertEquals((int) 6, sevenThirds.subRational("sub", fiveHalves).getDenominator());
        
}

@Test
    public void testMultRational() {
        System.out.println("Test multRational");
        
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
        
        
                //MULTIPLICATION
        
          //negativeFourEights
        assertEquals((int) 8, negativeFourEights.multRational("mult", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, negativeFourEights.multRational("mult", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.multRational("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.multRational("mult", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, negativeFourEights.multRational("mult", zeroOverZero).getNumerator());
        //assertEquals((int) 0, negativeFourEights.multRational("mult", zeroOverZero).getDenominator());
        
        assertEquals((int) 20, negativeFourEights.multRational("mult", fiveSevenths).getNumerator());
        assertEquals((int) 56, negativeFourEights.multRational("mult", fiveSevenths).getDenominator());
        
        assertEquals((int) 16, negativeFourEights.multRational("mult", negativeFourThirds).getNumerator());
        assertEquals((int) 24, negativeFourEights.multRational("mult", negativeFourThirds).getDenominator());
        
        assertEquals((int) -20, negativeFourEights.multRational("mult", fiveHalves).getNumerator());
        assertEquals((int) 16, negativeFourEights.multRational("mult", fiveHalves).getDenominator());
        
        
          //negativeThreeHalves
        assertEquals((int) 6, negativeThreeHalves.multRational("mult", negativeTwoSevenths).getNumerator());
        assertEquals((int) 14, negativeThreeHalves.multRational("mult", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.multRational("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.multRational("mult", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, negativeThreeHalves.multRational("mult", zeroOverZero).getNumerator());
        //assertEquals((int) 0, negativeThreeHalves.multRational("mult", zeroOverZero).getDenominator());
        
        assertEquals((int) -15, negativeThreeHalves.multRational("mult", fiveSevenths).getNumerator());
        assertEquals((int) 14, negativeThreeHalves.multRational("mult", fiveSevenths).getDenominator());
        
        assertEquals((int) 12, negativeThreeHalves.multRational("mult", negativeFourThirds).getNumerator());
        assertEquals((int) 6, negativeThreeHalves.multRational("mult", negativeFourThirds).getDenominator());
        
        assertEquals((int) -15, negativeThreeHalves.multRational("mult", fiveHalves).getNumerator());
        assertEquals((int) 4, negativeThreeHalves.multRational("mult", fiveHalves).getDenominator());
        
        
          //fourOverZero
          /* These will all come out to be an error depending on what we chose to do with our expected value = error 
          computations. If we choose the method I indicated above then I will finish this section once we decide */
          
        assertEquals((int) 8, fourOverZero.multRational("mult", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, fourOverZero.multRational("mult", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, fourOverZero.multRational("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, fourOverZero.multRational("mult", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, fourOverZero.multRational("mult", zeroOverZero).getNumerator());
        //assertEquals((int) 0, fourOverZero.multRational("mult", zeroOverZero).getDenominator());
        
        assertEquals((int) 20, fourOverZero.multRational("mult", fiveSevenths).getNumerator());
        assertEquals((int) 56, fourOverZero.multRational("mult", fiveSevenths).getDenominator());
        
        assertEquals((int) 16, fourOverZero.multRational("mult", negativeFourThirds).getNumerator());
        assertEquals((int) 24, fourOverZero.multRational("mult", negativeFourThirds).getDenominator());
        
        assertEquals((int) -20, fourOverZero.multRational("mult", fiveHalves).getNumerator());
        assertEquals((int) 16, fourOverZero.multRational("mult", fiveHalves).getDenominator());
        
        
          //zeroOverZero
          /*Not sure if 0/0 returns 0/0 or error*/
          
        assertEquals((int) 8, zeroOverZero.multRational("mult", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, zeroOverZero.multRational("mult", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, zeroOverZero.multRational("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, zeroOverZero.multRational("mult", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, zeroOverZero.multRational("mult", zeroOverZero).getNumerator());
        //assertEquals((int) 0, zeroOverZero.multRational("mult", zeroOverZero).getDenominator());
        
        assertEquals((int) 20, zeroOverZero.multRational("mult", fiveSevenths).getNumerator());
        assertEquals((int) 56, zeroOverZero.multRational("mult", fiveSevenths).getDenominator());
        
        assertEquals((int) 16, zeroOverZero.multRational("mult", negativeFourThirds).getNumerator());
        assertEquals((int) 24, zeroOverZero.multRational("mult", negativeFourThirds).getDenominator());
        
        assertEquals((int) -20, zeroOverZero.multRational("mult", fiveHalves).getNumerator());
        assertEquals((int) 16, zeroOverZero.multRational("mult", fiveHalves).getDenominator());
        
        
        //sixEights
        assertEquals((int) -12, sixEights.multRational("mult", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, sixEights.multRational("mult", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.multRational("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.multRational("mult", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, sixEights.multRational("mult", zeroOverZero).getNumerator());
        //assertEquals((int) 0, sixEights.multRational("mult", zeroOverZero).getDenominator());
        
        assertEquals((int) 30, sixEights.multRational("mult", fiveSevenths).getNumerator());
        assertEquals((int) 56, sixEights.multRational("mult", fiveSevenths).getDenominator());
        
        assertEquals((int) -24, sixEights.multRational("mult", negativeFourThirds).getNumerator());
        assertEquals((int) 24, sixEights.multRational("mult", negativeFourThirds).getDenominator());
        
        assertEquals((int) 30, sixEights.multRational("mult", fiveHalves).getNumerator());
        assertEquals((int) 16, sixEights.multRational("mult", fiveHalves).getDenominator());
        
        
        //sevenThirds
        assertEquals((int) -14, sevenThirds.multRational("mult", negativeTwoSevenths).getNumerator());
        assertEquals((int) 21, sevenThirds.multRational("mult", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, sevenThirds.multRational("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sevenThirds.multRational("mult", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, sevenThirds.multRational("mult", zeroOverZero).getNumerator());
        //assertEquals((int) 0, sevenThirds.multRational("mult", zeroOverZero).getDenominator());
        
        assertEquals((int) 35, sevenThirds.multRational("mult", fiveSevenths).getNumerator());
        assertEquals((int) 21, sevenThirds.multRational("mult", fiveSevenths).getDenominator());
        
        assertEquals((int) -28, sevenThirds.multRational("mult", negativeFourThirds).getNumerator());
        assertEquals((int) 9, sevenThirds.multRational("mult", negativeFourThirds).getDenominator());
        
        assertEquals((int) 35, sevenThirds.multRational("mult", fiveHalves).getNumerator());
        assertEquals((int) 6, sevenThirds.multRational("mult", fiveHalves).getDenominator());
}
        
        
        
@Test
    public void testDivRational() {
        System.out.println("Test divRational");
        
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
        
        
                //DIVISION
        
          //negativeFourEights
        assertEquals((int) 28, negativeFourEights.divRational("div", negativeTwoSevenths).getNumerator());
        assertEquals((int) 16, negativeFourEights.divRational("div", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.divRational("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.divRational("div", oneOverZero).getDenominator());
   
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.divRational("div", zeroOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.divRational("div", zeroOverZero).getDenominator());
        
        assertEquals((int) -28, negativeFourEights.divRational("div", fiveSevenths).getNumerator());
        assertEquals((int) 40, negativeFourEights.divRational("div", fiveSevenths).getDenominator());
        
        assertEquals((int) 12, negativeFourEights.divRational("div", negativeFourThirds).getNumerator());
        assertEquals((int) 32, negativeFourEights.divRational("div", negativeFourThirds).getDenominator());
        
        assertEquals((int) -8, negativeFourEights.divRational("div", fiveHalves).getNumerator());
        assertEquals((int) 40, negativeFourEights.divRational("div", fiveHalves).getDenominator());
        
        
                  //negativeThreeHalves
        assertEquals((int) 21, negativeThreeHalves.divRational("div", negativeTwoSevenths).getNumerator());
        assertEquals((int) 4, negativeThreeHalves.divRational("div", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.divRational("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.divRational("div", oneOverZero).getDenominator());
        
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.divRational("div", zeroOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.divRational("div", zeroOverZero).getDenominator());
        
        assertEquals((int) -21, negativeThreeHalves.divRational("div", fiveSevenths).getNumerator());
        assertEquals((int) 10, negativeThreeHalves.divRational("div", fiveSevenths).getDenominator());
        
        assertEquals((int) 9, negativeThreeHalves.divRational("div", negativeFourThirds).getNumerator());
        assertEquals((int) 8, negativeThreeHalves.divRational("div", negativeFourThirds).getDenominator());
        
        assertEquals((int) -6, negativeThreeHalves.divRational("div", fiveHalves).getNumerator());
        assertEquals((int) 10, negativeThreeHalves.divRational("div", fiveHalves).getDenominator());
        
        
          //fourOverZero
          /* These will all come out to be an error depending on what we chose to do with our expected value = error 
          computations. If we choose the method I indicated above then I will finish this section once we decide */
          
        assertEquals((int) 8, fourOverZero.divRational("div", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, fourOverZero.divRational("div", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, fourOverZero.divRational("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, fourOverZero.divRational("div", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, fourOverZero.divRational("div", zeroOverZero).getNumerator());
        //assertEquals((int) 0, fourOverZero.divRational("div", zeroOverZero).getDenominator());
        
        assertEquals((int) 20, fourOverZero.divRational("div", fiveSevenths).getNumerator());
        assertEquals((int) 56, fourOverZero.divRational("div", fiveSevenths).getDenominator());
        
        assertEquals((int) 16, fourOverZero.divRational("div", negativeFourThirds).getNumerator());
        assertEquals((int) 24, fourOverZero.divRational("div", negativeFourThirds).getDenominator());
        
        assertEquals((int) -20, fourOverZero.divRational("div", fiveHalves).getNumerator());
        assertEquals((int) 16, fourOverZero.divRational("div", fiveHalves).getDenominator());
        
        
          //zeroOverZero
          /*Not sure if 0/0 returns 0/0 or error*/
          
        assertEquals((int) 8, zeroOverZero.divRational("div", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, zeroOverZero.divRational("div", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, zeroOverZero.divRational("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, zeroOverZero.divRational("div", oneOverZero).getDenominator());
        
        
        /*Not sure if 0/0 returns 0/0 or error*/
        //assertEquals((int) 0, zeroOverZero.divRational("div", zeroOverZero).getNumerator());
        //assertEquals((int) 0, zeroOverZero.divRational("div", zeroOverZero).getDenominator());
        
        assertEquals((int) 20, zeroOverZero.divRational("div", fiveSevenths).getNumerator());
        assertEquals((int) 56, zeroOverZero.divRational("div", fiveSevenths).getDenominator());
        
        assertEquals((int) 16, zeroOverZero.divRational("div", negativeFourThirds).getNumerator());
        assertEquals((int) 24, zeroOverZero.divRational("div", negativeFourThirds).getDenominator());
        
        assertEquals((int) -20, zeroOverZero.divRational("div", fiveHalves).getNumerator());
        assertEquals((int) 16, zeroOverZero.divRational("div", fiveHalves).getDenominator());
        
        
        //sixEights
        assertEquals((int) -42, sixEights.divRational("div", negativeTwoSevenths).getNumerator());
        assertEquals((int) 16, sixEights.divRational("div", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.divRational("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.divRational("div", oneOverZero).getDenominator());
        
        
       /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.divRational("div", zeroOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.divRational("div", zeroOverZero).getDenominator());
        
        
        assertEquals((int) 42, sixEights.divRational("div", fiveSevenths).getNumerator());
        assertEquals((int) 40, sixEights.divRational("div", fiveSevenths).getDenominator());
        
        assertEquals((int) -18, sixEights.divRational("div", negativeFourThirds).getNumerator());
        assertEquals((int) 32, sixEights.divRational("div", negativeFourThirds).getDenominator());
        
        assertEquals((int) 12, sixEights.divRational("div", fiveHalves).getNumerator());
        assertEquals((int) 40, sixEights.divRational("div", fiveHalves).getDenominator());
        
        
        //sevenThirds
        assertEquals((int) -49, sevenThirds.divRational("div", negativeTwoSevenths).getNumerator());
        assertEquals((int) 6, sevenThirds.divRational("div", negativeTwoSevenths).getDenominator());
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, sevenThirds.divRational("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sevenThirds.divRational("div", oneOverZero).getDenominator());
        
        
        /*Should give an error, not sure of the ideal way to write it*/
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.divRational("div", zeroOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.divRational("div", zeroOverZero).getDenominator());
        
        
        assertEquals((int) 49, sevenThirds.divRational("div", fiveSevenths).getNumerator());
        assertEquals((int) 15, sevenThirds.divRational("div", fiveSevenths).getDenominator());
        
        assertEquals((int) -21, sevenThirds.divRational("div", negativeFourThirds).getNumerator());
        assertEquals((int) 12, sevenThirds.divRational("div", negativeFourThirds).getDenominator());
        
        assertEquals((int) 14, sevenThirds.divRational("div", fiveHalves).getNumerator());
        assertEquals((int) 15, sevenThirds.divRational("div", fiveHalves).getDenominator());
    }

}