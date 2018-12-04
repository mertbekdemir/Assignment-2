
/**
 * This class describes aircrafts
 *
 * @author Mert Bekdemir
 * @version 1409
 */
public class Aircraft
{
    //Constants
    public static final int LATEST_YEAR = 2018;
    public static final int EARLIEST_YEAR = 1920;
    public static final int MAX_ENGINES = 4;
    public static final int MIN_ENGINES = 1;

    //Instance variables
    private int modelYear = 2018;
    private String manufacturer;
    private String modelName;
    private int numEngines = 1;
    private boolean jet = false;
    private String specsPage;

    /**
     * @param manufacturer describes manufacturer of aircraft
     * @param modelName describes modelName of aircraft
     * @param modelYear describes year aircraft was made
     * @param numEngines describes engine number of aircraft
     * @param jet checks if the aircraft is jet or aircraft
     * @param specsPage prints out the webpage for specs of aicraft
     */

    public Aircraft(String manufacturer, String modelName, int modelYear, int numEngines, boolean jet,
    String specsPage )
    {
        setManufacturer(manufacturer);
        setModelName(modelName);
        setModelYear(modelYear);
        setNumEngines(numEngines);
        setJet(jet);
        setSpecsPage(specsPage);

    }

    /**
     * @param manufacturer describes manufacturer of aircraft
     * @param modelName describes modelName of aircraft
     * @param specsPage prints out the webpage for specs of aicraft
     */
    public Aircraft(String manufacturer, String modelName, String specsPage)
    {
        setManufacturer(manufacturer);
        setModelName(modelName);
        setSpecsPage(specsPage);
    }    

    /**
     * @param manufacturer describes manufacturer of aircraft
     * @param modelName describes modelName of aircraft
     * @param modelYear describes year aircraft was made
     * @param specificationsPage prints out the webpage for specs of aicraft
     */
    public Aircraft(String manufacturer, String modelName, int modelYear, String specsPage)
    {
        setManufacturer(manufacturer);
        setModelName(modelName);
        setModelYear(modelYear);
        setSpecsPage(specsPage);
    }
    //Setter Methods
    /**
     * Mutator setModelYear sets model year of aircraft
     */
    public final void setModelYear(int modelYear) {
        if(modelYear >= 1920 && modelYear <= 2018) {
            this.modelYear = modelYear;
        }else if (modelYear > 2018) {
            throw new IllegalArgumentException("Sorry, the model year "+modelYear+" is in the future.");
        }else{
            throw new IllegalArgumentException("Sorry, the model year "+modelYear+" is too old.");   
        }
    }

    /**
     * Mutator setNumEngines sets number of engines of aircraft
     */
    public final void setNumEngines(int numEngines) {
        if((numEngines <= MAX_ENGINES) && (numEngines >= MIN_ENGINES)) {
            this.numEngines = numEngines;   
        }
        else if(numEngines < MIN_ENGINES) {
            throw new IllegalArgumentException("Sorry, "+numEngines+" is too few engines for an aircraft.");
        }
        else if(numEngines > MAX_ENGINES) {
            throw new IllegalArgumentException("Sorry, "+numEngines+" is too many engines for an aircraft.");
        }

    }

    /**
     * Mutator setManufacturer sets manufacturer of aircraft
     */
    public final void setManufacturer(String manufacturer) {
        if(manufacturer != null && !manufacturer.equals("")) {
            this.manufacturer = manufacturer;
        }else if(manufacturer == null) {
            throw new IllegalArgumentException("The Manufacturer is not valid.");   
        }else{
            throw new IllegalArgumentException("The Manufacturer is not set.");   
        }
    }

    /**
     * Mutator setModelName sets model name of aircraft
     */
    public final void setModelName (String modelName) {
        if(modelName != null && modelName.length() > 0) {
            this.modelName = modelName;
        }else if(modelName == null) {
            throw new IllegalArgumentException("The Model Name is not valid.");
        }else{
            throw new IllegalArgumentException("The Model Name is not set.");
        }

    }

    /**
     * Mutator setJet sets the aircraft as jet or aircraft
     */
    public final void setJet(boolean isJet) {
        this.jet = isJet;
    }

    /**
     * Mutator setSpecsPage sets specs page of airfcraft
     */
    public final void setSpecsPage(String specificationsPage) {
        if(specificationsPage != null && !specificationsPage.equals("")) {
            this.specsPage = specificationsPage;
        }else if(specificationsPage == null) {
            throw new IllegalArgumentException("The Specifications Page is not valid.");
        }else{
            throw new IllegalArgumentException("The Specifications Page is not set.");
        }
    }
    //Accessor Methods
    /**
     * @return getModelYear returns model year of aircraft
     */
    public int getModelYear() {
        return this.modelYear;   
    }

    /**
     * @return getManufacturer returns manufacturer of aircraft
     */
    public String getManufacturer() {
        return this.manufacturer;
    }

    /**
     * @return getModelName returns model name of aircraft
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return getNumEngines returns number of engines aircraft has
     */
    public int getNumEngines() {
        return this.numEngines;
    }

    /**
     * @return getJet returns if aircraft is jet or not
     */
    public boolean isJet() {
        return this.jet;
    }

    /**
     * @return getSpecsPage returns specifications page of aircraft
     */
    public String getSpecsPage() {
        return this.specsPage;
    }

    public String getAircraftDetails() {
        if(!jet) {
            if(numEngines > 1) {
                return(getModelYear() + " " + getModelName() + " manufactured by " + getManufacturer() + " with " + 
                getNumEngines() + " engines. Specifications are available at " + getSpecsPage() + ".");
            }else{
                return(getModelYear() + " " + getModelName() + " manufactured by " + getManufacturer() + " with " + 
                getNumEngines() + " engine. Specifications are available at " + getSpecsPage() + ".");
            }
        }
        else{
            if(numEngines > 1) {
                return(getModelYear() + " " + getModelName() + " manufactured by " + getManufacturer() + " with " + 
                getNumEngines() + " jet engines. Specifications are available at " + getSpecsPage() + ".");
            }else{
                return(getModelYear() + " " + getModelName() + " manufactured by " + getManufacturer() + " with " + 
                getNumEngines() + " jet engine. Specifications are available at " + getSpecsPage() + ".");
            }

        }
       
    }
}