package com.qkm.wiki.controller;

import com.qkm.wiki.req.CategoryQueryReq;
import com.qkm.wiki.req.CategorySaveReq;
import com.qkm.wiki.resp.CommonResp;
import com.qkm.wiki.resp.CategoryQueryResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@RestController
@RequestMapping("/category")
public class CategoryController {


    @Resource
    private CategoryService CategoryService;

    @GetMapping("/all")
    public CommonResp all(){
        CommonResp<List<CategoryQueryResp>> resp = new CommonResp<>();
        List<CategoryQueryResp> list = CategoryService.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid CategoryQueryReq req){
        CommonResp<PageResp<CategoryQueryResp>> resp = new CommonResp<>();
        PageResp<CategoryQueryResp> list = CategoryService.list(req);
        resp.setContent(list);
        return resp;
    }

    /**
     * Desp: 这是编辑和保存的接口
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody CategorySaveReq req){
        CommonResp resp = new CommonResp<>();
        CategoryService.save(req);
        return resp;
    }

    /**
     * Desp: 这是电子书管理删除接口
     * @param
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public CommonResp delete(@PathVariable Long id){
        CommonResp resp = new CommonResp<>();
        CategoryService.delete(id);
        return resp;
    }
}
