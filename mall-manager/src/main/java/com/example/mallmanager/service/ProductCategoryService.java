package com.example.mallmanager.service;

import com.example.mallmanager.dto.ProductCategoryPO;
import com.example.mallmanager.pojo.UiTree;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhengXiangBo
 * @Date: 2019/12/28
 * @Description:
 */
public interface ProductCategoryService {
    List<UiTree> findProductCategoryListByParentId(Integer parentId);
    Integer insertProductCategory(ProductCategoryPO record);

}
