package com.qkm.wiki.service;

import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Ability;
import com.qkm.wiki.domain.AbilityExample;
import com.qkm.wiki.mapper.AbilityMapper;
import com.qkm.wiki.req.AbilityQueryReq;
import com.qkm.wiki.req.AbilitySaveReq;
import com.qkm.wiki.resp.PageResp;
import com.qkm.wiki.resp.AbilityQueryResp;
import com.qkm.wiki.resp.ScoreQueryResp;
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
public class AbilityService {

    @Resource
    private AbilityMapper AbilityMapper;

    @Resource
    private SnowFlake snowFlake ;

    public List<AbilityQueryResp> all(){
        AbilityExample abilityExample = new AbilityExample();
        //abilityExample.setOrderByClause("sort asc");
        List<Ability> abilityList = AbilityMapper.selectByExample(abilityExample);

        // 列表复制
        List<AbilityQueryResp> list = CopyUtil.copyList(abilityList, AbilityQueryResp.class);

        return list;

    }


    public PageResp<AbilityQueryResp> list(AbilityQueryReq req){

        AbilityExample abilityExample = new AbilityExample();
        //abilityExample.setOrderByClause("sort asc");
        AbilityExample.Criteria criteria = abilityExample.createCriteria();

        //PageHelper.startPage(req.getPage(),req.getSize());
        List<Ability> abilityList = AbilityMapper.selectByExample(abilityExample);
        PageInfo<Ability> pageInfo = new PageInfo<>(abilityList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<AbilityResp> respList = new ArrayList<>();
//        for(Ability ability : abilityList){
////            AbilityResp abilityResp = new AbilityResp();
////            BeanUtils.copyProperties(ability,abilityResp);
//            // 对象复制
//            AbilityResp abilityResp = CopyUtil.copy(ability, AbilityResp.class);
//            respList.add(abilityResp);
//        }

        // 列表复制
        List<AbilityQueryResp> list = CopyUtil.copyList(abilityList, AbilityQueryResp.class);

        PageResp<AbilityQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(AbilitySaveReq req){
        Ability ability = CopyUtil.copy(req,Ability.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            ability.setId(snowFlake.nextId());

            AbilityMapper.insert(ability);
        }else {
            // 更新
            AbilityMapper.updateByPrimaryKey(ability);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        AbilityMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询
     */
    public List<AbilityQueryResp> find(String name , String qishu , String num){
        return AbilityMapper.selectScoreByCondition(name,qishu,num);
    }

    public List<AbilityQueryResp> findname(String name){
        return AbilityMapper.findname(name);
    }

    public List<AbilityQueryResp> findsort(String num){
        return AbilityMapper.findsort(num);
    }

    public List<AbilityQueryResp> findaverage(String average){
        return AbilityMapper.findaverage(average);
    }
}
