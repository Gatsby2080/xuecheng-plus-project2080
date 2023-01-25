package com.xuecheng.content.model.dto;/**
 * @title: QueryCourseParamsDto
 * @projectName xuecheng-plus-project2080
 * @description:
 * @author Adidas
 * @date 2023/1/25 10:42
 */

import lombok.Data;
import lombok.ToString;

/**
 * @description TODO
 * @author Adidas
 * @date 2023/1/25 10:42
 * @version 1.0
 */
@Data
@ToString
public class QueryCourseParamsDto {
    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;
}
