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
        
        //SUBTRACT SECTION
        
        //MULTIPLY SECTION
        
          //negativeFourEights
        assertEquals((int) 8, negativeFourEights.perform("mult", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, negativeFourEights.perform("mult", negativeTwoSevenths).getDenominator());
        
        /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.perform("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.perform("mult", oneOverZero).getDenominator());
        
        
        /*if we have not contacted him about the result for 0/0 then we should go with our test case that indicates our expected value
        to be 0/0. If when we actually run our test when we do eventually have our full code and there is an error then we can change it.
        we must have something though*/
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
        
        /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.perform("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.perform("mult", oneOverZero).getDenominator());
        
        
        /*if we have not contacted him about the result for 0/0 then we should go with our test case that indicates our expected value
        to be 0/0. If when we actually run our test when we do eventually have our full code and there is an error then we can change it.
        we must have something though*/
        //assertEquals((int) 0, negativeThreeHalves.perform("mult", zeroOverZero).getNumerator());
        //assertEquals((int) 0, negativeThreeHalves.perform("mult", zeroOverZero).getDenominator());
        
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
        
        /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
        //assertEquals( java.lang.String "0/0", (int) null, fourOverZero.perform("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, fourOverZero.perform("mult", oneOverZero).getDenominator());
        
        
        /*if we have not contacted him about the result for 0/0 then we should go with our test case that indicates our expected value
        to be 0/0. If when we actually run our test when we do eventually have our full code and there is an error then we can change it.
        we must have something though*/
        //assertEquals((int) 0, fourOverZero.perform("mult", zeroOverZero).getNumerator());
        //assertEquals((int) 0, fourOverZero.perform("mult", zeroOverZero).getDenominator());
        
        assertEquals((int) 20, fourOverZero.perform("mult", fiveSevenths).getNumerator());
        assertEquals((int) 56, fourOverZero.perform("mult", fiveSevenths).getDenominator());
        
        assertEquals((int) 16, fourOverZero.perform("mult", negativeFourThirds).getNumerator());
        assertEquals((int) 24, fourOverZero.perform("mult", negativeFourThirds).getDenominator());
        
        assertEquals((int) -20, fourOverZero.perform("mult", fiveHalves).getNumerator());
        assertEquals((int) 16, fourOverZero.perform("mult", fiveHalves).getDenominator());
        
        
          //zeroOverZero
          /* These will all come out to be an error depending on what we chose to do with our expected value = error 
          computations. If we choose the method I indicated above then I will finish this section once we decide */
          
        assertEquals((int) 8, zeroOverZero.perform("mult", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, zeroOverZero.perform("mult", negativeTwoSevenths).getDenominator());
        
        /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
        //assertEquals( java.lang.String "0/0", (int) null, zeroOverZero.perform("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, zeroOverZero.perform("mult", oneOverZero).getDenominator());
        
        
        /*if we have not contacted him about the result for 0/0 then we should go with our test case that indicates our expected value
        to be 0/0. If when we actually run our test when we do eventually have our full code and there is an error then we can change it.
        we must have something though*/
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
        
        /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.perform("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.perform("mult", oneOverZero).getDenominator());
        
        
        /*if we have not contacted him about the result for 0/0 then we should go with our test case that indicates our expected value
        to be 0/0. If when we actually run our test when we do eventually have our full code and there is an error then we can change it.
        we must have something though*/
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
        
        /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
        //assertEquals( java.lang.String "0/0", (int) null, sevenThirds.perform("mult", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sevenThirds.perform("mult", oneOverZero).getDenominator());
        
        
        /*if we have not contacted him about the result for 0/0 then we should go with our test case that indicates our expected value
        to be 0/0. If when we actually run our test when we do eventually have our full code and there is an error then we can change it.
        we must have something though*/
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
        
        /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.perform("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeFourEights.perform("div", oneOverZero).getDenominator());
   
/*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
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
        
        /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.perform("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, negativeThreeHalves.perform("div", oneOverZero).getDenominator());
        
        
        /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
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
        
        /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
        //assertEquals( java.lang.String "0/0", (int) null, fourOverZero.perform("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, fourOverZero.perform("div", oneOverZero).getDenominator());
        
        
        /*if we have not contacted him about the result for 0/0 then we should go with our test case that indicates our expected value
        to be 0/0. If when we actually run our test when we do eventually have our full code and there is an error then we can change it.
        we must have something though*/
        //assertEquals((int) 0, fourOverZero.perform("div", zeroOverZero).getNumerator());
        //assertEquals((int) 0, fourOverZero.perform("div", zeroOverZero).getDenominator());
        
        assertEquals((int) 20, fourOverZero.perform("div", fiveSevenths).getNumerator());
        assertEquals((int) 56, fourOverZero.perform("div", fiveSevenths).getDenominator());
        
        assertEquals((int) 16, fourOverZero.perform("div", negativeFourThirds).getNumerator());
        assertEquals((int) 24, fourOverZero.perform("div", negativeFourThirds).getDenominator());
        
        assertEquals((int) -20, fourOverZero.perform("div", fiveHalves).getNumerator());
        assertEquals((int) 16, fourOverZero.perform("div", fiveHalves).getDenominator());
        
        
          //zeroOverZero
          /* These will all come out to be an error depending on what we chose to do with our expected value = error 
          computations. If we choose the method I indicated above then I will finish this section once we decide */
          
        assertEquals((int) 8, zeroOverZero.perform("div", negativeTwoSevenths).getNumerator());
        assertEquals((int) 56, zeroOverZero.perform("div", negativeTwoSevenths).getDenominator());
        
        /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
        //assertEquals( java.lang.String "0/0", (int) null, zeroOverZero.perform("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, zeroOverZero.perform("div", oneOverZero).getDenominator());
        
        
        /*if we have not contacted him about the result for 0/0 then we should go with our test case that indicates our expected value
        to be 0/0. If when we actually run our test when we do eventually have our full code and there is an error then we can change it.
        we must have something though*/
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
        
        /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.perform("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.perform("div", oneOverZero).getDenominator());
        
        
       /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
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
        
        /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
        //assertEquals( java.lang.String "0/0", (int) null, sevenThirds.perform("div", oneOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sevenThirds.perform("div", oneOverZero).getDenominator());
        
        
        /*Is this how we would indicate that we expect an error. We must show the test for this no? This is what I came
        up with. I was looking through the Assert method and this is probably the closest I could find. I found it on this site 
         http://junit.sourceforge.net/junit3.8.1/javadoc/junit/framework/Assert.html#assertEquals. If we do 
         use this we must extend java.lang.RationalNumber. Let me know if you think this will work or what we should do otherwise. Just an idea
         because i am pretty lost at what to do here. Jenna */
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.perform("div", zeroOverZero).getNumerator());
        //assertEquals( java.lang.String "0/0", (int) null, sixEights.perform("div", zeroOverZero).getDenominator());
        
        
        assertEquals((int) 49, sevenThirds.perform("div", fiveSevenths).getNumerator());
        assertEquals((int) 15, sevenThirds.perform("div", fiveSevenths).getDenominator());
        
        assertEquals((int) -21, sevenThirds.perform("div", negativeFourThirds).getNumerator());
        assertEquals((int) 12, sevenThirds.perform("div", negativeFourThirds).getDenominator());
        
        assertEquals((int) 14, sevenThirds.perform("div", fiveHalves).getNumerator());
        assertEquals((int) 15, sevenThirds.perform("div", fiveHalves).getDenominator());
    }
}