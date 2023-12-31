package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.entity.TypeOfMovie;

@Dao
@ConfigAutowireable
public interface TypeOfMovieDao {
    @Select
    List<TypeOfMovie> findAll();

    @Select
    Optional<TypeOfMovie> findById(String id);
}
