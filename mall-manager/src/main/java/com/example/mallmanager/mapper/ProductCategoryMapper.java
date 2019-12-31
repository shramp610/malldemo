package com.example.mallmanager.mapper;

import com.example.mallmanager.dto.ProductCategoryPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductCategoryMapper {
    int insert(ProductCategoryPO record);

    int insertSelective(ProductCategoryPO record);

    List<ProductCategoryPO> selectByParentId(Integer parentId);
}