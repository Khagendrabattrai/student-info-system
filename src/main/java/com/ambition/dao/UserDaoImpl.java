package com.ambition.dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.ambition.domain.User;
import com.ambition.util.DbConnectionUtl;

public class UserDaoImpl implements UserDao {
	public static final String INSERT_SQL = "insert into student_tbl(name,grade,roll_no,email,password,address)values(?,?,?,?,?,?)";

	@Override
	public void saveStudentInfo(User user) {
		try (PreparedStatement ps = DbConnectionUtl.getConnection().prepareStatement(INSERT_SQL);) {
			ps.setString(1, user.getName());
			ps.setInt(2, user.getGrade());
			ps.setInt(3, user.getRollNo());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getPassword());
			ps.setString(6, user.getAddress());
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();

		}
	}
}
