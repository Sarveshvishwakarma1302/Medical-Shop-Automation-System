
package dao;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Tables {
    public static void main(String[] args) {
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st = con.createStatement();
//st.executeUpdate(
//    "CREATE TABLE appuser (" +
//    "appuser_pk INT AUTO_INCREMENT PRIMARY KEY, " +
//    "userRole VARCHAR(200), " +
//    "name VARCHAR(200), " +
//    "dob VARCHAR(50), " +
//    "mobileNumber VARCHAR(50), " +
//    "email VARCHAR(200), " +
//    "username VARCHAR(200), " +
//    "password VARCHAR(50), " +
//    "address VARCHAR(200))"
//);
//st.executeUpdate("insert into appuser (userRole,name,dob,mobileNumber,email,username,password,address) values('Admin','Admin','16-12-2000','1111444455','admin@email.com','admin','admin','india')");
//st.executeUpdate(
//    "CREATE TABLE medicine (" +
//    "medicine_pk INT AUTO_INCREMENT PRIMARY KEY, " +
//    "uniqueId VARCHAR(200), " +
//    "name VARCHAR(200), " +
//    "companyName VARCHAR(200), " +
//    "quantity bigint,"+
//     "price bigint)");  
st.executeUpdate(
    "CREATE TABLE bill (" +
    "bill_pk INT AUTO_INCREMENT PRIMARY KEY, " +
    "billId VARCHAR(200), " +
    "billDate VARCHAR(50), " +
    "totalPaid  bigint," +
    "generatedBy VARCHAR(50))");
JOptionPane.showMessageDialog(null, "Table Created Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}