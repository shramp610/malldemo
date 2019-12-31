package com.example.mallmanager.service.impl;

import com.example.mallmanager.dto.ProductCategoryPO;
import com.example.mallmanager.mapper.ProductCategoryMapper;
import com.example.mallmanager.pojo.UiTree;
import com.example.mallmanager.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author: zhengXiangBo
 * @Date: 2019/12/28
 * @Description:
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Resource
    private ProductCategoryMapper productCategoryMapper;
    @Override
    public List<UiTree> findProductCategoryListByParentId(Integer parentId) {
        List<ProductCategoryPO> productCategoryPOS = productCategoryMapper.selectByParentId(parentId);
        List<UiTree> uiTrees = ConvertToUITree(productCategoryPOS);
        return uiTrees;
    }

    @Override
    public Integer insertProductCategory(ProductCategoryPO record) {
        return productCategoryMapper.insert(record);
    }

    private List<UiTree> ConvertToUITree(List<ProductCategoryPO> productCategoryPOS) {
        List<UiTree> uiTrees = new ArrayList<>();
        for(ProductCategoryPO po:productCategoryPOS){
            UiTree uiTree = new UiTree();
            uiTree.setId(po.getId());
            uiTree.setState(po.getParentId()==0?"closed":"open");
            uiTree.setText(po.getName());
            uiTrees.add(uiTree);
        }
        return uiTrees;
    }
}
