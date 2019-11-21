//package co.grandcircus.Lab24;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class UsersDao {
//	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	
//	public int updateUsers(Users users) {
//		String updateQuery = "insert into users (fname, lname, email, phone) values(?, ?, ?, ?)";
//		return jdbcTemplate.update(updateQuery, users.getFname(), users.getLname(), users.getEmail(),
//				users.getPhone());
//	}
//
//}
