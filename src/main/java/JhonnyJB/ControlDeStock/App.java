package JhonnyJB.ControlDeStock;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import JhonnyJB.ControlDeStock.conection.SessionManager;
import JhonnyJB.ControlDeStock.pojos.Lana;

/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger LOGGER = Logger.getLogger(App.class);
	public static void main( String[] args )
    {
		LOGGER.info("Starting AppWeb");

			Lana bolsaDeLana = new Lana("lanzul", "rojo", new Double(500),new Double(1000), 'B', "todo bien");

            Session session = SessionManager.getSession();

            Transaction tx = session.beginTransaction();

            session.save(bolsaDeLana);

            tx.commit();

            session.close();


		LOGGER.info("Conection successful");
    }
}
