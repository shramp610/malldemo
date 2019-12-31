package com.example.mallmanager.mapper;

import com.example.mallmanager.dto.TestPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestPO record);

    int insertSelective(TestPO record);

    TestPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestPO record);

    int updateByPrimaryKey(TestPO record);
}