package com.example.demo.model.vo;

import com.example.demo.model.entity.Picture;
import com.example.demo.model.entity.Post;
import lombok.Data;
import java.util.List;

@Data
public class SearchVO {
    private List<?> dataList;
    private Long total;

    private static final long serialVersionUID = 1L;
}