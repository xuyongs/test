package com.java.service;

import com.java.pojo.EbookEntry;

import java.util.List;

public interface EbookService {
    List<EbookEntry> findEbooks(Integer pageNum, Integer pageSize);

    /*List<Map<String,Object>> findCatogories();
    List<EbookEntry> findEbooksByCatogory(Long catgoryId);
    boolean saveEbookEntry(EbookEntry record);*/
}
























