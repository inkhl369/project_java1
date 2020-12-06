package serverforkyrsach;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyBDConnection {
    private Connection myConnection;

 public MyBDConnection(){}
 
 public void init()
 {
  try
  {
   Class.forName("com.mysql.jdbc.Driver");
   myConnection=DriverManager.getConnection("jdbc:mysql://localhost/kyrsach", "root", "12345");
  }
  catch(ClassNotFoundException | SQLException e)
  {
   System.out.println(e);
  }
 }
   
 public Connection getMyConnection()
 {
  return myConnection;
 }
    
 public void close(ResultSet rs)
 {
  if(rs !=null)
  {
   try
   {
    rs.close();
   }
   catch(Exception e){}
  }
 }
    
 public void close(java.sql.Statement stmt)
 {
  if(stmt !=null)
  {
   try
   {
    stmt.close();
   }
   catch(Exception e){}
  }
 }
     
 public void destroy()
 {
  if(myConnection !=null)
  {
   try
   {
    myConnection.close();
   }
   catch(Exception e){}
  }
 }    
}
