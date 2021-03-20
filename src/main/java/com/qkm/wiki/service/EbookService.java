package com.qkm.wiki.service;

import com.qkm.wiki.domain.Ebook;
import com.qkm.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

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

    public List<Ebook> list(){
        return EbookMapper.selectByExample(null);
    }
}
