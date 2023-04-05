package com.jsp.teacher.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.teacher.dto.Teacher;
import com.jsp.teacher.utility.HelperClass;

public class Teacherdao {
	
HelperClass helperClass = new HelperClass();
	
	
	public Teacher saveTeacher(Teacher Teacher)
	{
		Connection connection = helperClass.getConnection();
		String sql = "INSERT INTO teacher VALUES(?,?,?)";
		try {
			PreparedStatement preparedstatement =  connection.prepareStatement(sql);
			preparedstatement.setInt(1,Teacher.getId());
			preparedstatement.setString(2, Teacher.getName());
			preparedstatement.setString(3,Teacher.getEmail());
			
			preparedstatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return new Teacher();
		
		
	}
	
	public void updateStuden(String name,int id)
	{
		Connection connection = helperClass.getConnection();
		String sql = "UPDATE teacher SET name=? WHERE id=?";
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, id);
			
			preparedStatement.execute();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		finally {

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	public void deletStuden(int id)
	{

		
		Connection connection= helperClass.getConnection();
		
		String sql = "DELETE FROM teacher where id = ?";
		
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			
			preparedStatement.execute();
			
			
			System.out.println("Successfully Deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void readTeacher(int id)
	{
		Connection connection = helperClass.getConnection();
		String sql = "Select * from teacher where id = ?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			
			ResultSet resultset = preparedStatement.executeQuery();
			
			while(resultset.next())
			{
				System.out.println(resultset.getInt(1));
				System.out.println(resultset.getString(2));
				System.out.println(resultset.getString(3));
				System.out.println("==========================");
			
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally{
			System.out.println("Read");
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		

		
	}
	
	
	public void ReadAll()
	{
	 	Connection connection= helperClass.getConnection();
	 	String sql = "Select * from Teacher";
	 	try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultset = preparedStatement.executeQuery();
			
			while(resultset.next())
			{
				System.out.println(resultset.getInt(1));
				System.out.println(resultset.getString(2));
				System.out.println(resultset.getString(3));
				System.out.println("==========================");
				
			}				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	finally {
	 		System.out.println("Read ALL");
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	 	}
	 	
	}

}
