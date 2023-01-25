package com.xuecheng.content.service;/**
 * @title: CourseBaseInfoService
 * @projectName xuecheng-plus-project2080
 * @description:
 * @author Adidas
 * @date 2023/1/25 18:09
 */

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @description 课程基本信息管理业务接口
 * @author Adidas
 * @date 2023/1/25 18:09
 * @version 1.0
 */
public interface CourseBaseInfoService {
    /***
     * @description 课程查询
     * @param pageParams
     * @param queryCourseParamsDto
     * @return
     * @author
     * @date
    */
   public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
