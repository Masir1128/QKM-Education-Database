package com.qkm.wiki.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Content;
import com.qkm.wiki.domain.Doc;
import com.qkm.wiki.domain.DocExample;
import com.qkm.wiki.mapper.ContentMapper;
import com.qkm.wiki.mapper.DocMapper;
import com.qkm.wiki.req.DocQueryReq;
import com.qkm.wiki.req.DocSaveReq;
import com.qkm.wiki.resp.DocQueryResp;
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
public class DocService {

    @Resource
    private DocMapper DocMapper;

    @Resource
    private ContentMapper contentMapper;

    @Resource
    private SnowFlake snowFlake ;

    public List<DocQueryResp> all(Long ebookId){
        DocExample docExample = new DocExample();
        docExample.createCriteria().andEbookIdEqualTo(ebookId);
        docExample.setOrderByClause("sort asc");
        List<Doc> docList = DocMapper.selectByExample(docExample);

        // 列表复制
        List<DocQueryResp> list = CopyUtil.copyList(docList, DocQueryResp.class);

        return list;

    }


    public PageResp<DocQueryResp> list(DocQueryReq req){

        DocExample docExample = new DocExample();
        docExample.setOrderByClause("sort asc");
        DocExample.Criteria criteria = docExample.createCriteria();

        PageHelper.startPage(req.getPage(),req.getSize());
        List<Doc> docList = DocMapper.selectByExample(docExample);
        PageInfo<Doc> pageInfo = new PageInfo<>(docList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<DocResp> respList = new ArrayList<>();
//        for(Doc doc : docList){
////            DocResp docResp = new DocResp();
////            BeanUtils.copyProperties(doc,docResp);
//            // 对象复制
//            DocResp docResp = CopyUtil.copy(doc, DocResp.class);
//            respList.add(docResp);
//        }

        // 列表复制
        List<DocQueryResp> list = CopyUtil.copyList(docList, DocQueryResp.class);

        PageResp<DocQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(DocSaveReq req){
        Doc doc = CopyUtil.copy(req,Doc.class);
        Content content = CopyUtil.copy(req,Content.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            doc.setId(snowFlake.nextId());
            DocMapper.insert(doc);

            // 新增内容
            content.setId(doc.getId());
            contentMapper.insert(content);

        }else {
            // 更新
            DocMapper.updateByPrimaryKey(doc);
            int count = contentMapper.updateByPrimaryKeyWithBLOBs(content);
            if(count == 0){
                contentMapper.insert(content);
            }
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        DocMapper.deleteByPrimaryKey(id);
    }

    /**
     * 删除功能，主要为树枝搭建
     * @param ids
     */
    public void delete(List<String> ids) {
        DocExample docExample = new DocExample();
        DocExample.Criteria criteria = docExample.createCriteria();
        criteria.andIdIn(ids);
        DocMapper.deleteByExample(docExample);
    }

    /**
     * 删除
     */
    public String findContent(Long id){
       Content content = contentMapper.selectByPrimaryKey(id);
        if (ObjectUtils.isEmpty(content)) {
            return "";
        } else {
            return content.getContent();
        }
    }
}
