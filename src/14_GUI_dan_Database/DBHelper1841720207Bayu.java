package backend;

import java.sql.*;
//import javax.swing.JOptionPane;
public class DBHelper1841720207Bayu {
     private static Connection mKoneksi;
     
      public static void bukaKoneksiBayu(){
           if(mKoneksi == null){
              try{
                 String url = "jdbc:mysql://localhost:3306/dbperpus"; 
                 String user = "root";
                 String password = ""; 
                 DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); 
                 mKoneksi = DriverManager.getConnection(url, user, password);
              }catch(SQLException t){  
                   System.out.println("Error koneksi! ");
                   
              }   
           }
      } 
      public static int insertQueryGetIdBayu(String query){
           bukaKoneksiBayu();         
           int num = 0;         
           int result = -1; 
           
           try{
               Statement stmt = mKoneksi.createStatement();             
               num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
               
               ResultSet rs = stmt.getGeneratedKeys(); 
               
               if(rs.next()){
                    result = rs.getInt(1); 
               }
               rs.close();             
               stmt.close(); 
           }catch (Exception e){
                e.printStackTrace();             
                result = -1; 
           }
            return result; 
      }
      
      public static boolean executeQueryBayu(String query){
           bukaKoneksiBayu();         
           boolean result = false; 
           
           try{
               Statement stmt = mKoneksi.createStatement();             
               stmt.executeUpdate(query);                          
               
               result = true;                          
               
               stmt.close();
           }catch(Exception e){
                e.printStackTrace();
                //System.out.println("Error membuat koneksi" + e.getMessage());
           }
           return result;
      }
      
       public static ResultSet selectQueryBayu(String query) {
            bukaKoneksiBayu();         
            ResultSet rs = null;
            
            try{
                Statement stmt = mKoneksi.createStatement();             
                rs = stmt.executeQuery(query); 
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("Error membuat koneksi" + e.getMessage());
            }
            return rs;
       }
}
