/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fm.backend;
import java.sql.*;
/**
 *
 * @author Pink
 */
public class connection {
    
   //JDBC and database properties.
	private static final String DB_DRIVER = 
		           "org.postgresql.Driver";
	private static final String DB_URL = 
		        "jdbc:postgresql://dblabs.it.teithe.gr:5432/it185225";
	private static final String DB_USERNAME = "it185225";
	private static final String DB_PASSWORD = "Paok1234";
 
		
        public  Statement ConnectDB(){
        Connection conn = null;
        Statement statement=null;
		try{
			//Register the JDBC driver
			Class.forName(DB_DRIVER);
 
			//Open the connection
			conn = DriverManager.
			getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                             
			if(conn != null){
                            statement=conn.createStatement();
//                            String sql="select \"FM\".insert_broadcast('a','DDD','KOST');";
//                            Statement.execute(sql);
			   System.out.println("Successfully connected.");
                           return statement;
			}else{
                           System.out.println("Failed to connect.");
                           return statement;
			}
		}catch(Exception e){
			e.printStackTrace();
                        
		}
               return statement;
        }

//  public static void main(String[] args) {
//      connection  conn=new connection();
//      conn.ConnectDB();
//    }
        
    }

