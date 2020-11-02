import java.sql.*;
public class App {
    public static void main(String[] args) throws Exception {
        try {
            String location = "C:/Medium/UCanAccess/project1/MyDB.accdb"; // Insert your DB's location here
            String databaseURL = "jdbc:ucanaccess://" + location;
            Connection connection = DriverManager.getConnection(databaseURL);
            System.out.println("Connection done Successfully");   
        } catch (Exception e) {
            System.out.println(e);
        }        
    }
}
