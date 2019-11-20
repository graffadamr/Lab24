package co.grandcircus.Lab24;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Product> findAllProducts() {
		return jdbcTemplate.query("select * from products", new BeanPropertyRowMapper<Product>(Product.class));
	}


}
