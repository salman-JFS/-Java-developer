import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ForwardDirOnly {
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
            String query = "select * from student";

            //TYPE_FORWARD_ONLY -- Default
            ResultSet rs = statement.executeQuery(query);
            System.out.println("-------------Read Date-----------");
            while (rs.next()){
                System.out.println(rs.getInt("id")+ " | "+ rs.getString("stdName")+
                        " | "+ rs.getInt("age"));
            }
        }
        catch (Exception e)
        {
             e.printStackTrace();
        }
    }
}










