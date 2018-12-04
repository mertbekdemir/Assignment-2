import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * The driver class for a car.
 * 
 * @author Mike Mulder
 * @version 1.0
 */
public class TestRunner 
{
   /**
    * Execute the testrunner
    * 
    * @param    args default args 
    * @return   
    */
    public static void main(String[] args)
   {
       System.out.println("----- New Test Run -----");
       
       Result result = JUnitCore.runClasses(AircraftTestSuite.class);

       for (Failure failure : result.getFailures()) 
       {
           System.out.println("X " + failure.toString());
       }
       
       System.out.println("Y " + result.wasSuccessful());
   }
}
