package com.example.demo.dao;

import com.example.demo.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface TestDao {
    public ArrayList<TestDto> TestList();
    public void InsertTest(TestDto dto);
}
