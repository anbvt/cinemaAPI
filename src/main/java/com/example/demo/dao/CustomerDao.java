package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.entity.Customer;

@Dao
@ConfigAutowireable
public interface CustomerDao {
	@Select
	List<Customer> findAll();

	@Select
	Optional<Customer> findByEmail(String email);

	@Select
	Optional<Customer> findById(Integer id);

	@Select
	public Customer findByKey(String email, String password);

	@Insert(exclude = { "id", "address" })
	int insert(Customer customer);

	@Delete
	int delete(Customer customer);

	@Update(include = { "active" })
	int updateActive(Customer customer);

	@Update(include = { "token" })
	int updateToken(Customer customer);

	@Select
	Optional<Customer> findByToken(String token);
	
	@Update(exclude = { "email", "avatar", "keyfacebook", "token", "created_at", "password", "active" })
	int updateProfile(Customer customer);
	
	@Update(include = { "avatar" })
	int updateAvatar(Customer customer);
	
	@Update(include = { "password" })
	int updatePassword(Customer customer);
}
