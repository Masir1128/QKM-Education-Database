package com.qkm.wiki.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Category;
import com.qkm.wiki.domain.CategoryExample;
import com.qkm.wiki.mapper.CategoryMapper;
import com.qkm.wiki.req.CategoryQueryReq;
import com.qkm.wiki.req.CategorySaveReq;
import com.qkm.wiki.resp.CategoryQueryResp;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.util.CopyUtil;
import com.qkm.wiki.util.SnowFlake;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@Service
public class CategoryService {

    @Resource
    private CategoryMapper CategoryMapper;

    @Resource
    private SnowFlake snowFlake ;

    public PageResp<CategoryQueryResp> list(CategoryQueryReq req){

        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();

        PageHelper.startPage(req.getPage(),req.getSize());
        List<Category> categoryList = CategoryMapper.selectByExample(categoryExample);
        PageInfo<Category> pageInfo = new PageInfo<>(categoryList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<CategoryResp> respList = new ArrayList<>();
//        for(Category category : categoryList){
////            CategoryResp categoryResp = new CategoryResp();
////            BeanUtils.copyProperties(category,categoryResp);
//            // 对象复制
//            CategoryResp categoryResp = CopyUtil.copy(category, CategoryResp.class);
//            respList.add(categoryResp);
//        }

        // 列表复制
        List<CategoryQueryResp> list = CopyUtil.copyList(categoryList, CategoryQueryResp.class);

        PageResp<CategoryQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(CategorySaveReq req){
        Category category = CopyUtil.copy(req,Category.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            category.setId(snowFlake.nextId());

            CategoryMapper.insert(category);
        }else {
            // 更新
            CategoryMapper.updateByPrimaryKey(category);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        CategoryMapper.deleteByPrimaryKey(id);
    }
}
