import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AircraftTest
{
    private static Grader grader = new Grader("AircraftTest", 43);
    
    @AfterClass
    public static void grade()
    {
        System.out.println("Score: " + grader.getTestName() + ": " + grader.getMarks() + " / " + grader.getMax());
    }
    
    @Test
    public void testGetManufacturer()
    {
        final Aircraft acA;
        final Aircraft acB;
        final Aircraft acC;
        final Aircraft acD;
        final Aircraft acE;
        final Aircraft acF;
        
        acA = new Aircraft("A",   "D", Aircraft.EARLIEST_YEAR, Aircraft.MIN_ENGINES, false, "G");
        acB = new Aircraft("B1",  "E", Aircraft.LATEST_YEAR,   Aircraft.MAX_ENGINES, true, "H");
        acC = new Aircraft("C-c", "F", 1999, "https://www.foo.com");        
        acD = new Aircraft("A",   "D", "G");
        acE = new Aircraft("B1",  "E", "H");
        acF = new Aircraft("C-c", "F", "I");
        
        assertEquals("A",   acA.getManufacturer());
        grader.addMark(1);
        assertEquals("B1",  acB.getManufacturer());
        grader.addMark(1);
        assertEquals("C-c", acC.getManufacturer());
        grader.addMark(1);
        assertEquals("A",   acD.getManufacturer());
        grader.addMark(1);
        assertEquals("B1",  acE.getManufacturer());
        grader.addMark(1);
        assertEquals("C-c", acF.getManufacturer());
        grader.addMark(1);
    }
    
    @Test
    public void testGetModelName()
    {
        final Aircraft acA;
        final Aircraft acB;
        final Aircraft acC;
        final Aircraft acD;
        final Aircraft acE;
        final Aircraft acF;
        
        acA = new Aircraft("A", "D",   Aircraft.EARLIEST_YEAR, Aircraft.MIN_ENGINES, false, "G");
        acB = new Aircraft("B", "e1",  Aircraft.LATEST_YEAR,   Aircraft.MAX_ENGINES, true, "H");
        acC = new Aircraft("C", "c-2", 1999, "https://www.foo.com");
        acD = new Aircraft("A", "D",   "G");
        acE = new Aircraft("B", "e1",  "H");
        acF = new Aircraft("C", "c-2", "I");
        
        assertEquals("D",   acA.getModelName());
        grader.addMark(1);
        assertEquals("e1",  acB.getModelName());
        grader.addMark(1);
        assertEquals("c-2", acC.getModelName());
        grader.addMark(1);
        assertEquals("D",   acD.getModelName());
        grader.addMark(1);
        assertEquals("e1",  acE.getModelName());
        grader.addMark(1);
        assertEquals("c-2", acF.getModelName());
        grader.addMark(1);
    }

    @Test
    public void testGetModelYear()
    {
        final Aircraft acA;
        final Aircraft acB;
        final Aircraft acC;
        final Aircraft acD;
        final Aircraft acE;
        final Aircraft acF;
        
        acA = new Aircraft("A",   "D", Aircraft.EARLIEST_YEAR, Aircraft.MIN_ENGINES, true, "G");
        acB = new Aircraft("B1",  "E", Aircraft.LATEST_YEAR, Aircraft.MAX_ENGINES, false, "H");
        acC = new Aircraft("C-c", "F", 1999, "https://www.foo.com");
        acD = new Aircraft("A",   "D", Aircraft.EARLIEST_YEAR, Aircraft.MIN_ENGINES, true, "G");
        acE = new Aircraft("B1",  "E", Aircraft.LATEST_YEAR, Aircraft.MAX_ENGINES, false, "H");
        acF = new Aircraft("C-c", "F", 1999, "https://www.foo.com");
        
        assertEquals(1920, acA.getModelYear());
        grader.addMark(1);
        assertEquals(2018, acB.getModelYear());
        grader.addMark(1);
        assertEquals(1999, acC.getModelYear());
        grader.addMark(1);
        assertEquals(1920, acD.getModelYear());
        grader.addMark(1);
        assertEquals(2018, acE.getModelYear());
        grader.addMark(1);
        assertEquals(1999, acF.getModelYear());
        grader.addMark(1);
    }    
    
    @Test
    public void testGetNumEngines()
    {
        final Aircraft acA;
        final Aircraft acB;
        final Aircraft acC;
        final Aircraft acD;
        final Aircraft acE;
        final Aircraft acF;
        
        acA = new Aircraft("A",   "D", Aircraft.EARLIEST_YEAR, Aircraft.MIN_ENGINES, false, "G");
        acB = new Aircraft("B1",  "E", Aircraft.LATEST_YEAR,   Aircraft.MAX_ENGINES, true, "H");
        acC = new Aircraft("C-c", "F", 1999, "https://www.foo.com");
        acD = new Aircraft("A",   "D", "G");
        acE = new Aircraft("B1",  "E", "H");
        acF = new Aircraft("C-c", "F", "I");
        
        assertEquals(1,   acA.getNumEngines());
        grader.addMark(1);
        assertEquals(4, acB.getNumEngines());
        grader.addMark(1);
        assertEquals(1, acC.getNumEngines());        
        grader.addMark(1);
        assertEquals(1,  acD.getNumEngines());
        grader.addMark(1);
        assertEquals(1,  acE.getNumEngines());
        grader.addMark(1);
        assertEquals(1,  acF.getNumEngines());
        grader.addMark(1);
    }    
    
    @Test
    public void testIsJet()
    {
        final Aircraft acA;
        final Aircraft acB;
        final Aircraft acC;
        final Aircraft acD;
        final Aircraft acE;
        final Aircraft acF;
        
        acA = new Aircraft("A",   "D", Aircraft.EARLIEST_YEAR, Aircraft.MIN_ENGINES, false, "G");
        acB = new Aircraft("B1",  "E", Aircraft.LATEST_YEAR,   Aircraft.MAX_ENGINES, true, "H");
        acC = new Aircraft("C-c", "F", 1999, "https://www.foo.com");
        acD = new Aircraft("A",   "D", "G");
        acE = new Aircraft("B1",  "E", "H");
        acF = new Aircraft("C-c", "F", "I");
        
        assertEquals(false,   acA.isJet());
        grader.addMark(1);
        assertEquals(true,  acB.isJet());
        grader.addMark(1);
        assertEquals(false,  acC.isJet());        
        grader.addMark(1);
        assertEquals(false,  acD.isJet());
        grader.addMark(1);
        assertEquals(false,  acE.isJet());
        grader.addMark(1);
        assertEquals(false,  acF.isJet());
        grader.addMark(1);
    }    
    
    @Test
    public void testGetSpecsPage()
    {
        final Aircraft acA;
        final Aircraft acB;
        final Aircraft acC;
        final Aircraft acD;
        final Aircraft acE;
        final Aircraft acF;
        
        acA = new Aircraft("A",   "D", Aircraft.EARLIEST_YEAR, Aircraft.MIN_ENGINES, false, "http://www.foo.com");
        acB = new Aircraft("B1",  "E", Aircraft.LATEST_YEAR,   Aircraft.MAX_ENGINES, true,  "https://www.foo.com");
        acC = new Aircraft("C-c", "F", 1999, "http://foo.com/bar");
        acD = new Aircraft("A",   "D", "http://www.foo.com");
        acE = new Aircraft("B1",  "E", "https://www.foo.com");
        acF = new Aircraft("C-c", "F", "http://foo.com/bar");
        
        assertEquals("http://www.foo.com",  acA.getSpecsPage());
        grader.addMark(1);
        assertEquals("https://www.foo.com", acB.getSpecsPage());
        grader.addMark(1);
        assertEquals("http://foo.com/bar",  acC.getSpecsPage());
        grader.addMark(1);
        assertEquals("http://www.foo.com",  acD.getSpecsPage());
        grader.addMark(1);
        assertEquals("https://www.foo.com", acE.getSpecsPage());
        grader.addMark(1);
        assertEquals("http://foo.com/bar",  acF.getSpecsPage());
        grader.addMark(1);
    }    
    
    
    @Test
    public void testGetAircraftDetails()
    {
        final Aircraft acA;
        final Aircraft acB;
        final Aircraft acC;
        final Aircraft acD;
        final Aircraft acE;
        final Aircraft acF;
        
        acA = new Aircraft("A",   "D", Aircraft.EARLIEST_YEAR, Aircraft.MIN_ENGINES, true,  "http://www.foo.com");
        acB = new Aircraft("B1",  "E", Aircraft.LATEST_YEAR,   Aircraft.MAX_ENGINES, false, "https://www.foo.com");
        acC = new Aircraft("C-c", "F", 1999, "http://foo.com/bar");
        acD = new Aircraft("A",   "D", "http://www.foo.com");
        acE = new Aircraft("B1",  "E", "https://www.foo.com");
        acF = new Aircraft("C-c", "F", "http://foo.com/bar");
        
        assertEquals("1920 D manufactured by A with 1 jet engine. Specifications are available at http://www.foo.com.", acA.getAircraftDetails());
        grader.addMark(1);
        assertEquals("2018 E manufactured by B1 with 4 engines. Specifications are available at https://www.foo.com.", acB.getAircraftDetails());
        grader.addMark(1);
        assertEquals("1999 F manufactured by C-c with 1 engine. Specifications are available at http://foo.com/bar.", acC.getAircraftDetails());
        grader.addMark(1);
        assertEquals("2018 D manufactured by A with 1 engine. Specifications are available at http://www.foo.com.", acD.getAircraftDetails());
        grader.addMark(1);
        assertEquals("2018 E manufactured by B1 with 1 engine. Specifications are available at https://www.foo.com.", acE.getAircraftDetails());
        grader.addMark(1);
        assertEquals("2018 F manufactured by C-c with 1 engine. Specifications are available at http://foo.com/bar.", acF.getAircraftDetails());
        grader.addMark(1);
        grader.addMark(1);
    } 
}
