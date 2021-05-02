
package librarysystem;

//import com.sun.jdi.connect.spi.Connection;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
//import java.sql.SQLException;

public class LibrarySystem {

    public static void main(String[] args) {
    
        try {
            Login l=new Login();
           
            l.setVisible(true);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/library","root","Ehab@Salah#11991571");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM members");
            rs.first();
            System.out.println("id: "+rs.getInt(0)+" name: "+rs.getInt(1)+
                    "address: "+rs.getInt(2));
            System.out.println("connection pass");
        } catch (Exception ex) {
            System.out.println("fail");
        }
    }
    
}
