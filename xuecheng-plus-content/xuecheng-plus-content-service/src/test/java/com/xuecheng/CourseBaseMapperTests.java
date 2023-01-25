package com.xuecheng;/**
 * @title: CourseBaseMapperTests
 * @projectName xuecheng-plus-project2080
 * @description:
 * @author Adidas
 * @date 2023/1/25 17:19
 */

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.mapper.CourseBaseMapper;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseInfoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description TODO
 * @author Adidas
 * @date 2023/1/25 17:19
 * @version 1.0
 */

@SpringBootTest
class CourseBaseMapperTests {
    @Autowired
    CourseBaseMapper courseBaseMapper;

    @Autowired
    CourseBaseInfoService courseBaseInfoService;
    @Test
    void testCourseBaseMapper() {
        CourseBase courseBase = courseBaseMapper.selectById(74L);
        Assertions.assertNotNull(courseBase);
    }

    @Test
    void testCourseBaseInfoService() {

        PageParams pageParams = new PageParams();
        //PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto
        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams, new QueryCourseParamsDto());
        System.out.println(courseBasePageResult);

    }
}

