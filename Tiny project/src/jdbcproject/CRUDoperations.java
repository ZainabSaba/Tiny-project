package jdbcproject;

import java.sql.*;
import java.util.Scanner;


public class CRUDoperations {

	public void insert() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdeveloper","root","Zainab@123");
				Statement St=con.createStatement();)
		{
			String query = "insert into employers values(151,'joseph','Manager',210000)";
			int count = St.executeUpdate(query);
			if(count==0) 
			{
				System.out.println(" The Value Is Not Inserted");
			} 
			else 
			{
				System.out.println("The Value Is Inserted");
			}
		}
		catch(SQLException Se) 
		{
			System.out.println(Se.getMessage());
			Se.printStackTrace();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	public void Select() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdeveloper","root","Zainab@123");
				Statement St=con.createStatement();)
		{
			String query = "select * from employers";
			ResultSet rs=St.executeQuery(query);
			
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
		}
		catch(SQLException Se) 
		{
			System.out.println(Se.getMessage());
			Se.printStackTrace();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	
	public void update() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdeveloper","root","Zainab@123");
				Statement St=con.createStatement();)
		{
			String query = "update employers set name='ronald' where emp_id=143 ";
			int count = St.executeUpdate(query);
			if(count==0) 
			{
				System.out.println("Not Updated");
			} 
			else 
			{
				System.out.println("Updated");
			}
		}
		catch(SQLException Se) 
		{
			System.out.println(Se.getMessage());
			Se.printStackTrace();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	public void delete() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdeveloper","root","Zainab@123");
				Statement St=con.createStatement();)
		{
			String query = "delete from employers where emp_id=137";
			int count = St.executeUpdate(query);
			if(count==0) 
			{
				System.out.println("Not Deleted");
			} 
			else 
			{
				System.out.println("Deleted");
			}
		}
		catch(SQLException Se) 
		{
			System.out.println(Se.getMessage());
			Se.printStackTrace();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) 
	{
		CRUDoperations E= new CRUDoperations();
		System.out.println("Employers Details");
		System.out.println("Enter numbers between(1-4) for the CRUD operation you require ");
		System.out.println("Enter corresponding number(1.Insert, 2.Select, 3.Update, 4.Delete)");
		Scanner s=new Scanner(System.in);
		int Opp=s.nextInt();
		switch(Opp) 
		{
		case 1:
			E.insert();
			break;
		case 2:
			E.Select();
			break;
		case 3:
			E.update();
			break;
		case 4:
			E.delete();
			break;
		default:
			System.out.println("Invalid Input Please Enter Numbers (1-4)");
		}
		s.close();
		
	}
		


	}


