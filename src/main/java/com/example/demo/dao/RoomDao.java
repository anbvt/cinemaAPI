package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.dto.RoomDto;

@Dao
@ConfigAutowireable
public interface RoomDao {
    @Select
    List<RoomDto> findAll();

    @Select
    Optional<RoomDto> findById(String id);

    @Select
    List<RoomDto> getByBranch(String id, String showdate);
    
    @Select
    List<RoomDto> findByBranchId(String branchid);
}
