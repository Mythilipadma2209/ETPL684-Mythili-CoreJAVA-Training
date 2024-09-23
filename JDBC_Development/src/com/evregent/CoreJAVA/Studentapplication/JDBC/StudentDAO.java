package com.evregent.CoreJAVA.Studentapplication.JDBC;
import java.sql.*;
public class StudentDAO {
	                       
	public int addStudent(StudentBean student)// 427	Ram		935
	  {
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  try
		  	{
			  con=StudentDB.getConnection();  		  
			  String ins_str ="insert into student values(?,?,?,?)";
			  pstmt = con.prepareStatement(ins_str);
			  pstmt.setInt(1, student.getStudentId());
			  pstmt.setString(2, student.getStudentName());
			  pstmt.setFloat(3, student.getStudentmarks());
			  pstmt.setString(4, student.getRemark());
			  int updateCount = pstmt.executeUpdate();
			  con.close();
			  return updateCount;
		  	}
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }  
	  }
}
