package com.java.mapper;

import com.java.pojo.EbookEntry;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EbookMapper {

    @Select("SELECT * FROM ebook_entry ORDER BY id DESC")
    List<EbookEntry> selectEbooks();


    /*@Select("SELECT * FROM ebook_catogory")
    List<Map<String,Object>> selectCatogories();

    List<EbookEntry> selectEbooksByCatogory(Long catgoryId);

    int insertEbookEntry(EbookEntry record);*/

}

















