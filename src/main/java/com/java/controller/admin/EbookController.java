package com.java.controller.admin;

import com.github.pagehelper.PageInfo;
import com.java.pojo.EbookEntry;
import com.java.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/book")
public class EbookController {
    @Autowired
    private EbookService ebookService;

    @RequestMapping("/toEbookList")
    public String toEbookList(@RequestParam(defaultValue = "1") Integer pageNum,
                              @RequestParam(defaultValue = "3") Integer pageSize,
                              Model model){
        List<EbookEntry> bookList = ebookService.findEbooks(pageNum,pageSize);
        PageInfo<EbookEntry> pageInfo = new PageInfo<>(bookList);
        model.addAttribute("pageInfo",pageInfo);
        return "admin/ebookList.jsp";
    }

    /*@RequestMapping("/getCatogories")
    public @ResponseBody
    List<Map<String,Object>> getCatogories(){
        return ebookService.findCatogories();
    }*/

    /*@RequestMapping("/getEbooksByCatogory")
    public @ResponseBody List<EbookEntry> getEbooksByCatogory(Long catgoryId){
        *//*String id = catgoryId.toString();
        boolean flag = id.matches("[123]");
        if (flag){
            return ebookService.findEbooksByCatogory(catgoryId);
        }else {
            return null;
        }*//*
        return ebookService.findEbooksByCatogory(catgoryId);
    }*/

    /*@RequestMapping("/addEbook")
    public boolean addEbook(EbookEntry ebookEntry){
        return ebookService.saveEbookEntry(ebookEntry);
    }*/
}





































