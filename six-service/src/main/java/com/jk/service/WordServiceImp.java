package com.jk.service;

import com.jk.entity.Word;
import com.jk.mapper.WordMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dell on 2017/5/27.
 */
@Service
public class WordServiceImp implements WordService {

    @Resource
    private WordMapper wordMapper;

    @Override
    public List<Word> selectWordList(String keyWord) {
        return wordMapper.selectWordList(keyWord);
    }
}
