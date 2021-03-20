package com.qkm.wiki.service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.mysql.cj.util.StringUtils;
import com.qkm.wiki.domain.Ebook;
import com.qkm.wiki.domain.EbookExample;
import com.qkm.wiki.mapper.EbookMapper;
import com.qkm.wiki.req.EbookReq;
import com.qkm.wiki.resp.EbookResp;
import com.qkm.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Masir Description:
 * IO:
 */
@Service
public class EbookService {

    @Resource
    private EbookMapper EbookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if(!ObjectUtils.isEmpty( req.getName())){
            criteria.andNameLike("%" + req.getName() + "%");
        }

        List<Ebook> ebookList = EbookMapper.selectByExample(ebookExample);

//        List<EbookResp> respList = new ArrayList<>();
//        for(Ebook ebook : ebookList){
////            EbookResp ebookResp = new EbookResp();
////            BeanUtils.copyProperties(ebook,ebookResp);
//            // 对象复制
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(ebookResp);
//        }

        // 列表复制
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);
        return list;

    }
}
