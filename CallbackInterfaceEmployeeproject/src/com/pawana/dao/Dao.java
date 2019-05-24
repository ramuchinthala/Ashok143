package com.pawana.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.sql.DataSource;

//import com.mysql.jdbc.ResultSet;
import com.pawana.empdtls.Employee;
public class Dao {
 private DataSource ds;

public void setDs(DataSource ds) {
	this.ds = ds;
}
public String insert(Employee emp) {
  String name=emp.getName();
  int id=emp.getId();
  double salary=emp.getSalary();
  int age=emp.getAge();
  PreparedStatement psmt=null;
  try {
	psmt= ds.getConnection().prepareStatement("insert into emp2 values (?,?,?,?)");
	psmt.setString(1, name);
	psmt.setInt(2,id);
	psmt.setDouble(3, salary);
	psmt.setInt(4, age);
	psmt.executeUpdate();
} catch (SQLException e) {
	e.printStackTrace();
}
 int res=0;
 try {
	res=psmt.executeUpdate();
} catch (SQLException e) {
	e.printStackTrace();
}
 if(res==1) {
	 return "insert successfully";
 }else
	 return "insertion unsuccessfully";
}
 
 public String update(Employee emp) {
	 String name=emp.getName();
	 int id=emp.getId();
	 PreparedStatement psmt=null;
	 try {
		psmt=ds.getConnection().prepareStatement("update emp2 set name=? where id=?");
		psmt.setString(1, name);
		psmt.setInt(2, id);
		psmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	 
 
 int res=0;
 try {
	res=psmt.executeUpdate();
} catch (SQLException e) {
	e.printStackTrace();
}
 if(res==1) {
	 return "update successfully";
 }else
	 return "update unsuccessfully";
 }
 public String delete(Employee emp) {
	// String name=emp.getName();
	 int id=emp.getId();
	 PreparedStatement psmt=null;
	 try {
		psmt=ds.getConnection().prepareStatement("delete from emp2 where id=?");
		//psmt.setString(1, name);
		psmt.setInt(1, id);
		psmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	 int res=0;
	 try {
		int result=psmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	 if(res==1) {
		 return "delete successfully";
		 
	 }else
		 return "delete unsuccessfully";
	 
 }
 public String view(Employee emp) {
	 String name=emp.getName();
	  int id=emp.getId();
	  double salary=emp.getSalary();
	  int age=emp.getAge();
	  PreparedStatement psmt=null;
	  try {
		psmt=ds.getConnection().prepareStatement("select * from emp2");
		psmt.setString(1, name);
		psmt.setInt(2,id);
		psmt.setDouble(3, salary);
		psmt.setInt(4, age);
		psmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	 ResultSet rs=null;
	 String result=null;
	 try {
		rs=psmt.executeQuery();
		while(rs.next());
		result=(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
	} catch (SQLException e) {
		e.printStackTrace();
	}
    return result;
 }}

