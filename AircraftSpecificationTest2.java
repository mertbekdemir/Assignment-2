import org.junit.AfterClass;
import org.junit.Test;

public class AircraftSpecificationTest2
    extends SpecificationTest
{
    private static Grader grader = new Grader("AircraftSpecificationTest2", 10);
    private static Class<?> aircraftClass;
    
    static
    {
        try
        {
            aircraftClass = Class.forName("Aircraft");
        }
        catch (ClassNotFoundException ex)
        {
            aircraftClass = null;
        }
    }
    
    @AfterClass
    public static void grade()
    {
        System.out.println("Score: " + grader.getTestName() + ": " + grader.getMarks() + " / " + grader.getMax());
    }

    @Test
    public void testEarliestYearConstant()
    {
        testField(aircraftClass, "EARLIEST_YEAR", int.class, new String[]
        {
            "public", 
            "static", 
            "final",
        }, new String[]
        {
        });
        grader.addMark(1);
    }

    @Test
    public void testLatestYearConstant()
    {
        testField(aircraftClass, "LATEST_YEAR", int.class, new String[]
        {
            "public", 
            "static", 
            "final",
        }, new String[]
        {
        });
        grader.addMark(1);
    }

    @Test
    public void testMinEnginesConstant()
    {
        testField(aircraftClass, "MIN_ENGINES", int.class, new String[]
        {
            "public", 
            "static", 
            "final",
        }, new String[]
        {
        });
        grader.addMark(1);
    }

    @Test
    public void testMaxEnginesConstant()
    {
        testField(aircraftClass, "MAX_ENGINES", int.class, new String[]
        {
            "public", 
            "static", 
            "final",
        }, new String[]
        {
        });
        grader.addMark(1);
    }

    @Test
    public void testModelYear()
    {
        testField(aircraftClass, "modelYear", int.class, new String[]
        {
            "private"
        }, new String[]
        {
            "static",
        });
        grader.addMark(1);
    }

    @Test
    public void testModelName()
    {
        testField(aircraftClass, "modelName", String.class, new String[]
        {
            "private"
        }, new String[]
        {
            "static",
        });
        grader.addMark(1);
    }

    @Test
    public void testManufacturer()
    {
        testField(aircraftClass, "manufacturer", String.class, new String[]
        {
            "private"
        }, new String[]
        {
            "static",
        });
        grader.addMark(1);
    }

    @Test
    public void testNumEngines()
    {
        testField(aircraftClass, "numEngines", int.class, new String[]
        {
            "private"
        }, new String[]
        {
            "static",
        });
        grader.addMark(1);
    }
    
    @Test
    public void testJet()
    {
        testField(aircraftClass, "jet", boolean.class, new String[]
        {
            "private"
        }, new String[]
        {
            "static",
        });
        grader.addMark(1);
    }

    @Test
    public void testSpecsPage()
    {
        testField(aircraftClass, "specsPage", String.class, new String[]
        {
            "private"
        }, new String[]
        {
            "static",
        });
        grader.addMark(1);
    }
}
