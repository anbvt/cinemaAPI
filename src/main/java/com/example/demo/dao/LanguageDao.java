package com.example.demo.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.entity.Language;

@Dao
@ConfigAutowireable
public interface LanguageDao {
	@Select
	Language findById(int id);
	
	@Select
	List<Language> findAll();
}
