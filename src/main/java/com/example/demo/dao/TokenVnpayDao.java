package com.example.demo.dao;

import com.example.demo.entity.TokenVnpay;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface TokenVnpayDao {
	@Insert
	int insert(TokenVnpay tokenVnpay);

	@Select
	TokenVnpay findByCustomerId(Integer customerId);
	
	@Select
	TokenVnpay findById(Integer id);
	
	@Delete(sqlFile = true)
	int deleteById(Integer id);
}
