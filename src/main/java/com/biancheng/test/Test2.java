package com.biancheng.test;

import com.biancheng.mapper.StudentMapper;
import com.biancheng.po.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test2 {
    public static void main(String[] args) throws IOException {
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
        SqlSession ss = ssf.openSession();

        Student student = ss.getMapper(StudentMapper.class).selectById(2);
        System.out.println(student);

    }
}
