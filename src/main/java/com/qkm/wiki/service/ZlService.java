package com.qkm.wiki.service;

import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Content;
import com.qkm.wiki.domain.Zl;
import com.qkm.wiki.domain.ZlExample;
import com.qkm.wiki.domain.Zldoc;
import com.qkm.wiki.mapper.ZlMapper;
import com.qkm.wiki.mapper.ZldocMapper;
import com.qkm.wiki.req.ZlQueryReq;
import com.qkm.wiki.req.ZlSaveReq;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.ZlQueryResp;
import com.qkm.wiki.resp.Zlcat3QueryResp;
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
public class ZlService {

    @Resource
    private ZlMapper ZlMapper;

    @Resource
    private ZldocMapper zldocMapper;

    @Resource
    private SnowFlake snowFlake ;

    public List<ZlQueryResp> all(){
        ZlExample zlExample = new ZlExample();
        //zlExample.setOrderByClause("sort asc");
        List<Zl> zlList = ZlMapper.selectByExample(zlExample);

        // 列表复制
        List<ZlQueryResp> list = CopyUtil.copyList(zlList, ZlQueryResp.class);

        return list;

    }


    public PageResp<ZlQueryResp> list(ZlQueryReq req){

        ZlExample zlExample = new ZlExample();
        //zlExample.setOrderByClause("sort asc");
        ZlExample.Criteria criteria = zlExample.createCriteria();

        //PageHelper.startPage(req.getPage(),req.getSize());
        List<Zl> zlList = ZlMapper.selectByExample(zlExample);
        PageInfo<Zl> pageInfo = new PageInfo<>(zlList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<ZlResp> respList = new ArrayList<>();
//        for(Zl zl : zlList){
////            ZlResp zlResp = new ZlResp();
////            BeanUtils.copyProperties(zl,zlResp);
//            // 对象复制
//            ZlResp zlResp = CopyUtil.copy(zl, ZlResp.class);
//            respList.add(zlResp);
//        }

        // 列表复制
        List<ZlQueryResp> list = CopyUtil.copyList(zlList, ZlQueryResp.class);

        PageResp<ZlQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(ZlSaveReq req){
        Zl zl = CopyUtil.copy(req,Zl.class);
        Zldoc zldoc = CopyUtil.copy(req,Zldoc.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            zl.setId(snowFlake.nextId());

            ZlMapper.insert(zl);

            zldoc.setId(zl.getId());
            zldocMapper.insert(zldoc);


        }else {
            // 更新
            ZlMapper.updateByPrimaryKey(zl);
            int count = zldocMapper.updateByPrimaryKeyWithBLOBs(zldoc);
            if(count == 0){
                zldocMapper.insert(zldoc);
            }
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        ZlMapper.deleteByPrimaryKey(id);
    }

    public List<ZlQueryResp> findcat(String cat){
        return ZlMapper.findcat(cat);
    }

    public List<ZlQueryResp> findid(Long id){
        return ZlMapper.findid(id);
    }

    public String findContent(Long id){
        Zldoc zldoc = zldocMapper.selectByPrimaryKey(id);

        if (ObjectUtils.isEmpty(zldoc)) {
            return "";
        } else {
            return zldoc.getContent();
        }
    }

    public List<ZlQueryResp> findpersonal(String cat){
        return ZlMapper.findpersonal(cat);
    }


}
