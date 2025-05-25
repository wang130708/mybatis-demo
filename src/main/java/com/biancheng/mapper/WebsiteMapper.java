package com.biancheng.mapper;

import com.biancheng.po.Website;

import java.util.List;

public interface WebsiteMapper {
    List<Website> queryAllInfo();
    void insertWebsite(Website website);
    void updateWebsite(Website website);
    void deleteWebsite(int id);
}
