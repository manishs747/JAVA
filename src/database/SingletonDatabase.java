package database;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SingletonDatabase {
	
	private static SingletonDatabase dbIsntance;
    private static Connection con ;
    private static Statement stmt;
    
    private SingletonDatabase() {
		// private constructor
	}
    
    public static SingletonDatabase getInstance(){
        if(dbIsntance==null){
            dbIsntance= new SingletonDatabase();
        }
        return dbIsntance;
        }
    
    public  Connection getConnection(){

        if(con==null){
            try {
            	Class.forName("com.mysql.jdbc.Driver");
            	System.out.println("Driver loaded!");
            	/*Properties p = getProperty();
                System.out.println("prop is "+ p);
            	String host= p.getProperty("host");
				 String username = p.getProperty("username");
				 String password = p.getProperty("password");
				 System.out.println(host+username+password);*/
            	
                String host = "jdbc:mysql://localhost:3306/manish_db";
                String username = "presto";
                String password = "pr3st0";
                con = DriverManager.getConnection( host, username, password );
            } catch (SQLException ex) {
                Logger.getLogger(SingletonDatabase.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

        return con;
    }

	public Properties getProperty() {
		GetPropertyValues g = new GetPropertyValues();
		Properties p;
		try {
			p = g.getPropValues();
			return p;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = SingletonDatabase.getInstance().getConnection();
		 stmt=con.createStatement();  
		  
		ResultSet rs=stmt.executeQuery("select * from city");  
		  
		while(rs.next())  {
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
		  
		}
		con.close();  

	}

}
