package com.example.demo.model.dto.post;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * 💡【原子笔记】：ES 实体类映射
 * indexName 对应 ES 里的“表名”
 */
@Document(indexName = "post")
@Data
public class PostEsDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @Field(type = FieldType.Keyword)
    private String url;

    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart")
    private String title;

    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart")
    private String content;

    @Field(type = FieldType.Keyword)
    private String tags;

    @Field(type = FieldType.Long)
    private Long userId;

    @Field(type = FieldType.Date)
    private Date createTime;

    @Field(type = FieldType.Date)
    private Date updateTime;
}