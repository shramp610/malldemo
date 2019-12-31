package com.example.mallmanager.dto;

import java.io.Serializable;
import lombok.Data;

/**
 * product_category
 * @author 
 */
@Data
public class ProductCategoryPO implements Serializable {
    /**
     * id
     */
    private Integer id;

    private String name;

    /**
     * 父节点id

     */
    private Integer parentId;

    /**
     * 当前节点状态

     */
    private Integer status;

    /**
     * 排序权重

     */
    private Integer order;

    private static final long serialVersionUID = 1L;
}