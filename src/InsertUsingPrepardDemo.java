import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingPrepardDemo {
    //1. load the driver class
    //2. connection from db
    //3. create statement
    //4. execute query

    public static void main(String[] args)  {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");//load driver class

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd", "root", "Salman@9525075286");

            String query = "INSERT INTO student (id, stdName, age) values (?,?,?)";

            PreparedStatement pstmt = con.prepareStatement(query);

//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter id for student : ");
//            int id1 = sc.nextInt();

            pstmt.setInt(1,51);
            pstmt.setString(2,"shahjad");
            pstmt.setInt(3,28);

            pstmt.executeUpdate();

            pstmt.setInt(1,52);
            pstmt.setString(2,"Rahman");
            pstmt.setInt(3,20);

            pstmt.executeUpdate();

            System.out.println("Inserted multiple Row");
            con.close();
        }
        catch (Exception e)
        {
             e.printStackTrace();
        }
    }
}










