/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitouch.medicines;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author prachisharma
 */
public class GetConnection {
    private Connection conn=null;
	
	public Connection getConnection() {
	try {
//		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicalstore","root","Cpmanpa9719");
//                System.out.println("Connection establish");
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	finally
	{
		return conn;
	}
        
    }
}
