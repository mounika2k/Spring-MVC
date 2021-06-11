package com.hexaware.main.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.hexaware.main.beans.Account;
import com.hexaware.main.beans.User;

@Component
public class DBConfig {

	/*
	 * Using JDBC Templating class to write queries.
	 * 1.Reach out to Basic DataSource Bean created in SBCF
	 * 2.Use Templete class to write queries
	 */
	
	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	private void setDataSource(DataSource dataSource) {
		jdbc = new NamedParameterJdbcTemplate(dataSource);
		
	}
	  
	   
	  
	    
	public int addUser(User user) {
		Map<String,Object> map=new HashMap<>();
		map.put("name", user.getName());
		map.put("username", user.getUsername());
		map.put("password", user.getPassword());
		
		String sql="insert into user(name,username,password)values(:name,:username,:password)";
		return jdbc.update(sql,map);
			
	}
	public User processLogin(User user) {
		Map<String,Object> map=new HashMap<>();
		map.put("username", user.getUsername());
		map.put("password", user.getPassword());
		String sql="select username,password from user where username=:username and password=:password";
		return jdbc.queryForObject(sql, map, new UserMapper());
	}
class UserMapper implements RowMapper<User>{
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException{
		User u=new User();		
		u.setId(Long.parseLong(Integer.toString(rs.getInt("id"))));
		u.setName(rs.getString("name"));
		u.setUsername(rs.getString("username"));
		u.setPassword(rs.getString("password"));

		return u;
	}
}

		public int addAccount(Account account) {
			Map<String,Object> map=new HashMap<>();
			map.put("name", account.getName());
			map.put("email", account.getEmail());
			map.put("pan", account.getPan());
			map.put("contact", account.getContact());
			
			String sql="insert into account(name,email,pan,contact)values(:name,:email,:pan,:contact)";
			return jdbc.update(sql,map);
				
		}
		public List<User> getAllUsers(){
			String sql="select * from user";
			return jdbc.query(sql, new UserMapper());
		}
		public List<Account> getAllAccounts(){
			String sql="select * from account";
			return jdbc.query(sql, new AccountMapper());
		}
		class AccountMapper implements RowMapper<Account>{
			@Override
			public Account mapRow(ResultSet rs, int rowNum) throws SQLException{
				Account a=new Account();		
				a.setName(rs.getString("name"));
				a.setEmail(rs.getString("email"));
				a.setPan(rs.getString("pan"));
				a.setContact(rs.getString("contact"));
				return a;
			}
		}
}




	
