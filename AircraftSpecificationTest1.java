import org.junit.AfterClass;
import org.junit.Test;

public class AircraftSpecificationTest1
    extends SpecificationTest
{
    private static Grader grader = new Grader("AircraftSpecificationTest1", 15);
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
    public void testModelYear()
    {
        testField(aircraftClass, "modelYear", int.class, new String[]
        {
            "private",
        }, new String[]
        {
            "static",
        });
        grader.addMark(1);
        testMethod(aircraftClass, "getModelYear", int.class, new String[]
        {
            "public"
        }, new String[]
        {
            "static", "final"
        });
        grader.addMark(1);
    }

    @Test
    public void testModelName()
    {
        testField(aircraftClass, "modelName", String.class, new String[]
        {
            "private",
        }, new String[]
        {
            "static",
        });
        grader.addMark(1);
        testMethod(aircraftClass, "getModelName", String.class, new String[]
        {
            "public"
        }, new String[]
        {
            "static", "final"
        });
        grader.addMark(1);
    }

    @Test
    public void testManufacturer()
    {
        testField(aircraftClass, "manufacturer", String.class, new String[]
        {
            "private",
        }, new String[]
        {
            "static",
        });
        grader.addMark(1);
        testMethod(aircraftClass, "getManufacturer", String.class, new String[]
        {
            "public"
        }, new String[]
        {
            "static", "final"
        });
        grader.addMark(1);
    }

    @Test
    public void testNumEngines()
    {
        testField(aircraftClass, "numEngines", int.class, new String[]
        {
            "private",
        }, new String[]
        {
            "static",
        });
        grader.addMark(1);
        testMethod(aircraftClass, "getNumEngines", int.class, new String[]
        {
            "public"
        }, new String[]
        {
            "static", "final"
        });
        grader.addMark(1);
    }

    @Test
    public void testSpecsPage()
    {
        testField(aircraftClass, "specsPage", String.class, new String[]
        {
              "private",
        }, new String[]
        {
              "static",
        });
        grader.addMark(1);
        testMethod(aircraftClass, "getSpecsPage", String.class, new String[]
        {
               "public"
        }, new String[]
        {
               "static", "final"
        });
        grader.addMark(1);
    }

    @Test
    public void testGetAircraftDetails()
    {
        testMethod(aircraftClass, "getAircraftDetails", String.class, new String[]
        {
               "public"
        }, new String[]
        {
               "static", "final"
        });
        grader.addMark(1);
    }
    
    @Test
    public void testConstructor()
    {
        testNumberOfConstructors(aircraftClass, 3);
        grader.addMark(1);
        testConstructor(aircraftClass, 
                        new String[]
                        {
                            "public",
                        },
                        new Class[]
                        {
                            String.class,
                            String.class,
                            int.class,
                            int.class,
                            boolean.class,
                            String.class,
                        });
        grader.addMark(1);
        testConstructor(aircraftClass, 
                        new String[]
                        {
                            "public",
                        },
                        new Class[]
                        {
                            String.class,
                            String.class,
                            String.class,
                        });
        grader.addMark(1);
        testConstructor(aircraftClass, 
                        new String[]
                        {
                            "public",
                        },
                        new Class[]
                        {
                            String.class,
                            String.class,
                            int.class,
                            String.class,
                        });
        grader.addMark(1);
    }
}
