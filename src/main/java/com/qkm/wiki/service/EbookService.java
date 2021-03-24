package com.qkm.wiki.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Ebook;
import com.qkm.wiki.domain.EbookExample;
import com.qkm.wiki.mapper.EbookMapper;
import com.qkm.wiki.req.EbookQueryReq;
import com.qkm.wiki.req.EbookSaveReq;
import com.qkm.wiki.resp.EbookQueryResp;
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
public class EbookService {

    @Resource
    private EbookMapper EbookMapper;

    @Resource
    private SnowFlake snowFlake ;

    public PageResp<EbookQueryResp> list(EbookQueryReq req){

        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if(!ObjectUtils.isEmpty( req.getName())){
            criteria.andNameLike("%" + req.getName() + "%");
        }if(!ObjectUtils.isEmpty(req.getCategoryId2())) {
            criteria.andCategory2IdEqualTo(req.getCategoryId2());
        }
        PageHelper.startPage(req.getPage(),req.getSize());
        List<Ebook> ebookList = EbookMapper.selectByExample(ebookExample);
        PageInfo<Ebook> pageInfo = new PageInfo<>(ebookList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<EbookResp> respList = new ArrayList<>();
//        for(Ebook ebook : ebookList){
////            EbookResp ebookResp = new EbookResp();
////            BeanUtils.copyProperties(ebook,ebookResp);
//            // 对象复制
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(ebookResp);
//        }

        // 列表复制
        List<EbookQueryResp> list = CopyUtil.copyList(ebookList, EbookQueryResp.class);

        PageResp<EbookQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(EbookSaveReq req){
        Ebook ebook = CopyUtil.copy(req,Ebook.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            ebook.setId(snowFlake.nextId());

            EbookMapper.insert(ebook);
        }else {
            // 更新
            EbookMapper.updateByPrimaryKey(ebook);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        EbookMapper.deleteByPrimaryKey(id);
    }
}
