package com.biancheng.test;

import com.biancheng.po.Website;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        // 读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        // 根据配置文件构建SqlSessionFactory
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
        // 通过SqlSessionFactory创建SqlSession
        SqlSession ss = ssf.openSession();

        Website website = new Website();
        website.setName("haha");
        website.setUrl("abc");
        website.setAge(40);
        website.setCountry("BC");
        website.setCreatetime(new Date());
        ss.insert("com.biancheng.mapper.WebsiteMapper.insertWebsite", website);
        ss.commit();

//        Website website = new Website();
//        website.setId(1);
//        website.setName("张三");
//        website.setUrl("CD");
//        website.setAge(10);
//        website.setCountry("BC");
//        website.setCreatetime(new Date());
//        ss.update("com.biancheng.mapper.WebsiteMapper.updateWebsite", website);
//        ss.commit();

        ss.delete("com.biancheng.mapper.WebsiteMapper.deleteWebsite", 1);
        ss.commit();

        List<Website> list = ss.selectList("com.biancheng.mapper.WebsiteMapper.queryAllInfo");
        for (Website websites : list) {
            System.out.println(websites);
        }
        ss.close();
    }
}
