package com.java.service.impl;

import com.github.pagehelper.PageHelper;

import com.java.mapper.EbookMapper;
import com.java.pojo.EbookEntry;
import com.java.service.EbookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookServiceImpl implements EbookService {

@Autowired
private EbookMapper ebookMapper;
    @Override
    public List<EbookEntry> findEbooks(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return ebookMapper.selectEbooks();
    }

    /*@Override
    public List<Map<String, Object>> findCatogories() {
        return ebookMapper.selectCatogories();
    }

    @Override
    public List<EbookEntry> findEbooksByCatogory(Long catgoryId) {
        return ebookMapper.selectEbooksByCatogory(catgoryId);
    }

    @Override
    public boolean saveEbookEntry(EbookEntry record) {
        return ebookMapper.insertEbookEntry(record)>=1;
    }*/
//...................
}









































