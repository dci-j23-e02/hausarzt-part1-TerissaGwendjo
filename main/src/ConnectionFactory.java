package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:postgresql://localhost:5432/hausarzt";
    public static final String USER = "postgres"; //postgres is the default username
    public static final String PASSWORD = "12345";

    /**
     * Get a connection to database
     * @return Connection object
     * */
    public static Connection getConnection(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(URL, USER, PASSWORD); // where the connection was created
            if(conn != null){
                System.out.println("Connected to the database!");
            }else{
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
        }

        return  conn; // Return the connection object

    }

    /*Test Connection */
    public static void main(String[] args) {

        Connection connection = getConnection();
    }

}
