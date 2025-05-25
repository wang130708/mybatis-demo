package com.biancheng.test;

import com.biancheng.mapper.UserInfoMapper;
import com.biancheng.po.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test3 {
    public static void main(String[] args) throws IOException {
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
        SqlSession ss = ssf.openSession();

        UserInfo userInfo = ss.getMapper(UserInfoMapper.class).selectUserOrderById1(2);
        System.out.println(userInfo);
    }
}
