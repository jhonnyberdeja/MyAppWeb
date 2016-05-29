package JhonnyJB.ControlDeStock.conection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ManagerConnections {

	public static Connection getConection() throws Exception{

        // Establece el nombre del driver a utilizar

        String dbDriver = "com.mysql.jdbc.Driver";
         
        // Establece la conexion a utilizar

        String dbConnString = "jdbc:mysql://localhost/productosDB";
            
        // Establece el usuario de la base de datos

        String dbUser = "root";

        // Establece la contraseña de la base de datos

        String dbPassword = "123456";

        // Establece el driver de conexion

        Class.forName(dbDriver).newInstance();

        // Retorna la conexion

        return DriverManager.getConnection(dbConnString, dbUser, dbPassword);

	}
}
