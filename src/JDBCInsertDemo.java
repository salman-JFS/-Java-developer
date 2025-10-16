import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCInsertDemo {
    //1. load the driver class
    //2. connection from db
    //3. create statement
    //4. execute query

    public static void main(String[] args)  {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");//load driver class

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd", "root", "Salman@9525075286");
            Statement statement = con.createStatement();
            String query = "INSERT INTO student (id, stdName, age) values (4, 'Ismail', 20)";

            //ResultSet rs = statement.executeQuery(query);
            int update = statement.executeUpdate(query);
            System.out.println("-------------Read Date-----------");
            System.out.println("Inserted "+ update+ " Rows");
        }
        catch (Exception e)
        {
             e.printStackTrace();
        }
    }
}










