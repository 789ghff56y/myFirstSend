package com.baidu.service.impl;

import com.baidu.dao.StudentMapper;
import com.baidu.model.Student;
import com.baidu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student queryStudent(Integer id) {
        Student student = studentMapper.selectById(id);
        return student;
    }
}
