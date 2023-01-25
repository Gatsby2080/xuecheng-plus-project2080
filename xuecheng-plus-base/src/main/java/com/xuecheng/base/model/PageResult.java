package com.xuecheng.base.model;/**
 * @title: PageResult
 * @projectName xuecheng-plus-project2080
 * @description:
 * @author Adidas
 * @date 2023/1/25 10:49
 */

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @description TODO
 * @author Adidas
 * @date 2023/1/25 10:49
 * @version 1.0
 */
@Data
@ToString
public class PageResult<T> implements Serializable {
    // 数据列表
    private List<T> items;
    //总记录数
    private long counts;
    //当前页码
    private long page;
    //每页记录数
    private long pageSize;
    public PageResult(List<T> items, long counts, long page, long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }
}

