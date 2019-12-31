package com.example.mallmanager.service.impl;

import com.example.mallmanager.mapper.TestMapper;
import com.example.mallmanager.dto.TestPO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: zhengXiangBo
 * @Date: 2019/12/27
 * @Description:
 */
@Component
public class TestDao implements TestMapper {
    @Resource
    private TestMapper testMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return testMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TestPO record) {
        return testMapper.insert(record);
    }

    @Override
    public int insertSelective(TestPO record) {
        return  testMapper.insert(record);
    }

    @Override
    public TestPO selectByPrimaryKey(Integer id) {
        return testMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TestPO record) {
        return testMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TestPO record) {
        return testMapper.updateByPrimaryKey(record);
    }
}
