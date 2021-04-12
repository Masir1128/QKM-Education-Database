package com.qkm.wiki.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Score;
import com.qkm.wiki.domain.ScoreExample;
import com.qkm.wiki.domain.Test;
import com.qkm.wiki.mapper.ScoreMapper;
import com.qkm.wiki.req.ScoreQueryReq;
import com.qkm.wiki.req.ScoreSaveReq;
import com.qkm.wiki.resp.PageResp;
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
public class ScoreService {

    @Resource
    private ScoreMapper ScoreMapper;

    @Resource
    private SnowFlake snowFlake ;


    public List<ScoreQueryResp> all(){
        ScoreExample scoreExample = new ScoreExample();
        scoreExample.setOrderByClause("tasksort asc");
        List<Score> categoryList = ScoreMapper.selectByExample(scoreExample);

        // 列表复制
        List<ScoreQueryResp> list = CopyUtil.copyList(categoryList, ScoreQueryResp.class);

        return list;

    }

    public PageResp<ScoreQueryResp> list(ScoreQueryReq req){

        ScoreExample scoreExample = new ScoreExample();
        ScoreExample.Criteria criteria = scoreExample.createCriteria();

        PageHelper.startPage(req.getPage(),req.getSize());
        List<Score> scoreList = ScoreMapper.selectByExample(scoreExample);
        PageInfo<Score> pageInfo = new PageInfo<>(scoreList);
        pageInfo.getTotal();
        pageInfo.getPages();
        System.out.println(pageInfo.getTotal());
//        List<ScoreResp> respList = new ArrayList<>();
//        for(Score score : scoreList){
////            ScoreResp scoreResp = new ScoreResp();
////            BeanUtils.copyProperties(score,scoreResp);
//            // 对象复制
//            ScoreResp scoreResp = CopyUtil.copy(score, ScoreResp.class);
//            respList.add(scoreResp);
//        }

        // 列表复制
        List<ScoreQueryResp> list = CopyUtil.copyList(scoreList, ScoreQueryResp.class);

        PageResp<ScoreQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(ScoreSaveReq req){
        Score score = CopyUtil.copy(req,Score.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            score.setId(snowFlake.nextId());

            ScoreMapper.insert(score);
        }else {
            // 更新
            ScoreMapper.updateByPrimaryKey(score);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        System.out.println("-------------");
        System.out.println(id);
        ScoreMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询
     */
    public List<ScoreQueryResp> find(String name ,String parents){
        return ScoreMapper.selectScoreByCondition(name,parents);
    }


}
