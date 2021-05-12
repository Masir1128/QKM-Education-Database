package com.qkm.wiki.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qkm.wiki.domain.Training;
import com.qkm.wiki.domain.TrainingExample;
import com.qkm.wiki.mapper.TrainingMapper;
import com.qkm.wiki.req.TrainingQueryReq;
import com.qkm.wiki.req.TrainingSaveReq;
import com.qkm.wiki.resp.TrainingQueryResp;
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
public class TrainingService {

    @Resource
    private TrainingMapper TrainingMapper;

    @Resource
    private SnowFlake snowFlake ;

    public List<TrainingQueryResp> all(Long id){
        TrainingExample trainingExample = new TrainingExample();
        trainingExample.createCriteria().andEbookIdEqualTo(id);
        List<Training> trainingList = TrainingMapper.selectByExample(trainingExample);

        // 列表复制
        List<TrainingQueryResp> list = CopyUtil.copyList(trainingList, TrainingQueryResp.class);

        return list;

    }


    public PageResp<TrainingQueryResp> list(TrainingQueryReq req){

        TrainingExample trainingExample = new TrainingExample();
        //trainingExample.setOrderByClause("sort asc");
        TrainingExample.Criteria criteria = trainingExample.createCriteria();

        PageHelper.startPage(req.getPage(),req.getSize());
        List<Training> trainingList = TrainingMapper.selectByExample(trainingExample);
        PageInfo<Training> pageInfo = new PageInfo<>(trainingList);
        pageInfo.getTotal();
        pageInfo.getPages();

        System.out.println(pageInfo.getTotal());
//        List<TrainingResp> respList = new ArrayList<>();
//        for(Training training : trainingList){
////            TrainingResp trainingResp = new TrainingResp();
////            BeanUtils.copyProperties(training,trainingResp);
//            // 对象复制
//            TrainingResp trainingResp = CopyUtil.copy(training, TrainingResp.class);
//            respList.add(trainingResp);
//        }

        // 列表复制
        List<TrainingQueryResp> list = CopyUtil.copyList(trainingList, TrainingQueryResp.class);

        PageResp<TrainingQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);

        return pageResp;

    }

    /**
     * 保存
     * @param req
     */
    public void save(TrainingSaveReq req){
        Training training = CopyUtil.copy(req,Training.class);
        if(ObjectUtils.isEmpty(req.getId())){
            // 新增
            training.setId(snowFlake.nextId());

            TrainingMapper.insert(training);
        }else {
            // 更新
            TrainingMapper.updateByPrimaryKey(training);
        }


    }

    /**
     * 删除
     */
    public void delete(Long id){
        TrainingMapper.deleteByPrimaryKey(id);
    }

    public List<TrainingQueryResp> findlevel(String level){
        return TrainingMapper.findlevel(level);
    }

    public List<TrainingQueryResp> findCapLevel(String level ,String name){
        return TrainingMapper.findCapLevel(level,name);
    }
}
