package JhonnyJB.ControlDeStock;

import org.apache.log4j.Logger;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger LOGGER = Logger.getLogger(App.class);
	public static void main( String[] args )
    {
		LOGGER.info("This is debug : Jhonny berdeja");
	
		System.out.println( "Hellovv World!" + System.getProperties() );
    
    }
}
