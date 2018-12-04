import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AircraftConstructorTest
{
    private static Grader grader = new Grader("AircraftConstructorTest", 21);
    
    @AfterClass
    public static void grade()
    {
        System.out.println("Score: " + grader.getTestName() + ": " + grader.getMarks() + " / " + grader.getMax());
    }
    
    @Test
    public void testEarliestYearConstant()
    {
        assertEquals(1920, Aircraft.EARLIEST_YEAR);
        grader.addMark(1);
    }

    @Test
    public void testLatestYearConstant()
    {
        assertEquals(2018, Aircraft.LATEST_YEAR);
        grader.addMark(1);
    }

    @Test
    public void testMinEnginesConstant()
    {
        assertEquals(1, Aircraft.MIN_ENGINES);
        grader.addMark(1);
    }

    @Test
    public void testMaxEnginesConstant()
    {
        assertEquals(4, Aircraft.MAX_ENGINES);
        grader.addMark(1);
    }
    
    @Test
    public void testBadManufacturer()
    {
        try
        {
            new Aircraft(null, "A", 1920, 1, false, "http://foo.com");
            fail("null manufacturer must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("The Manufacturer is not valid.", ex.getMessage());
            grader.addMark(1);
        }
        
        try
        {
            new Aircraft("", "Bar", 1881, 2, true, "http://foo.com");
            fail("empty manufacturer must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("The Manufacturer is not set.", ex.getMessage());
            grader.addMark(1);
        }
    }
    
    @Test
    public void testBadModelName()
    {
        try
        {
            new Aircraft("A", null, 1920, 1, false, "http://foo.com");
            fail("null model name must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("The Model Name is not valid.", ex.getMessage());
            grader.addMark(1);
        }
        
        try
        {
            new Aircraft("Bar", "", 1881, 2, true, "http://foo.com");
            fail("empty model name must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("The Model Name is not set.", ex.getMessage());
            grader.addMark(1);
        }
    }
    
    @Test
    public void testModelYearTooOld()
    {
        try
        {
            new Aircraft("Bar", "Foo", 1919, 1, false, "http://foo.com");
            fail("years earlier than 1920 must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("Sorry, the model year 1919 is too old.", ex.getMessage());
            grader.addMark(1);
        }
        
        try
        {
            new Aircraft("Bar", "Foo", 1879, 2, true, "http://foo.com");
            fail("years earlier than 1920 must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("Sorry, the model year 1879 is too old.", ex.getMessage());
            grader.addMark(1);
        }
        
        try
        {
            new Aircraft("Bar", "Foo", 0, 2, true, "http://foo.com");
            fail("years earlier than 1920 must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("Sorry, the model year 0 is too old.", ex.getMessage());
            grader.addMark(1);
        }
    }
    
    
    @Test
    public void testModelYearFuture()
    {
        try
        {
            new Aircraft("Bar", "Foo", 2019, 1, false, "http://foo.com");
            fail("years greater than 2019 must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("Sorry, the model year 2019 is in the future.", ex.getMessage());
            grader.addMark(1);
        }
        
        try
        {
            new Aircraft("Bar", "Foo", 2020, 2, true, "http://foo.com");
            fail("years greater than 2019 must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("Sorry, the model year 2020 is in the future.", ex.getMessage());
            grader.addMark(1);
        }
        
        try
        {
            new Aircraft("Bar", "Foo", 30000, 2, true, "http://foo.com");
            fail("years greater than 2019 must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("Sorry, the model year 30000 is in the future.", ex.getMessage());
            grader.addMark(1);
        }
    }
    
    @Test
    public void testNumEnginesTooLow()
    {
        try
        {
            new Aircraft("Bar", "Foo", 2018, 0, false, "http://foo.com");
            fail("num engines less than 1 must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("Sorry, 0 is too few engines for an aircraft.", ex.getMessage());
            grader.addMark(1);
        }
        
        try
        {
            new Aircraft("Bar", "Foo", 2018, -1, false, "http://foo.com");
            fail("negative num enginese must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("Sorry, -1 is too few engines for an aircraft.", ex.getMessage());
            grader.addMark(1);
        }
    }    
    
    @Test
    public void testNumEnginesTooHigh()
    {
        try
        {
            new Aircraft("Bar", "Foo", 1921, 5, false, "http://foo.com");
            fail("num engines greater than 4 must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("Sorry, 5 is too many engines for an aircraft.", ex.getMessage());
            grader.addMark(1);
        }
        
        try
        {
            new Aircraft("Bar", "Foo", 1921, 6, false, "http://foo.com");
            fail("num engines greater than 4 must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("Sorry, 6 is too many engines for an aircraft.", ex.getMessage());
            grader.addMark(1);
        }
        
        try
        {
            new Aircraft("Bar", "Foo", 1921, 1000, false, "http://foo.com");
            fail("num engines greater than 4 must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("Sorry, 1000 is too many engines for an aircraft.", ex.getMessage());
            grader.addMark(1);
        }
    }

    @Test
    public void testBadWebPage()
    {
        try
        {
            new Aircraft("A", "Foo", 1921, 1, false, null);
            fail("null web page must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("The Specifications Page is not valid.", ex.getMessage());
            grader.addMark(1);
        }
        
        try
        {
            new Aircraft("B", "Bar", 1921, 1, false, "");
            fail("empty web page must throw an IllegalArgumentException");
        }
        catch(final IllegalArgumentException ex)
        {
            assertEquals("The Specifications Page is not set.", ex.getMessage());
            grader.addMark(1);
        }
    }
}
