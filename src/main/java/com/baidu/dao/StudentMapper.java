package com.baidu.dao;

import com.baidu.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//@Mapper//告诉mybatis这是dao接口，创建此接口的代理对象
public interface StudentMapper {
    Student selectById(@Param("stuId") Integer id);
}
