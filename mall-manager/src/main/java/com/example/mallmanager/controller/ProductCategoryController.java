package com.example.mallmanager.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.example.mallmanager.dto.ProductCategoryPO;
import com.example.mallmanager.dto.TestPO;
import com.example.mallmanager.pojo.UiTree;
import com.example.mallmanager.service.ProductCategoryService;
import com.example.mallmanager.service.impl.TestDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: zhengXiangBo
 * @Date: 2019/12/28
 * @Description:
 */
@Slf4j
@Controller
@RequestMapping("/product_category")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    /**
     * 获取列表树
     * @param parentId
     * @return
     */
    @RequestMapping(value = "/list", produces = "application/json;charset=utf-8")
    @ResponseBody
    public List<UiTree> getProductCategory(@RequestParam(value = "parentId", defaultValue = "0") Integer parentId) {
        return productCategoryService.findProductCategoryListByParentId(parentId);
    }

}
