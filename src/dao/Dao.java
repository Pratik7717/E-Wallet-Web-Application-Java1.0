package dao;

import model.Register;
import model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Dao {
	private int i;
	private boolean check;
	
	public int save(Register rg) {
		Connection con=Myconnection.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("insert into userinfo(fname,lname,mob,uname,pass) values(?,?,?,?,?)");
			ps.setString(1, rg.getFname());
			ps.setString(2, rg.getLname());
			ps.setString(3, rg.getMob());
			ps.setString(4, rg.getUname());
			ps.setString(5, rg.getPass());
			
			i=ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		return i;
	}
	
	public boolean validate(Login in) {
		Connection con=Myconnection.getConnection();
		ResultSet rs=null;
		check=false;
		try {
			PreparedStatement ps=con.prepareStatement("select * from userinfo where uname=? AND pass=?");
			ps.setString(1, in.getUname());
			ps.setString(2, in.getPass());
			rs=ps.executeQuery();
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		try {
			if(rs.next()) {
				check=true;
				return check;
			}
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		return check;
	}
	
	
	
	
	
}
