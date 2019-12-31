package com.example.mallmanager.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * test
 * @author 
 */
@Data
public class TestPO implements Serializable {
    private Integer id;

    private String title;

    private String author;

    private Date date;

    private static final long serialVersionUID = 1L;
}