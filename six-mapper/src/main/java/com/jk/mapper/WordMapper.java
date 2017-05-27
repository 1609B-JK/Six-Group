package com.jk.mapper;

import com.jk.entity.Word;

import java.util.List;

/**
 * Created by dell on 2017/5/27.
 */
public interface WordMapper {
    List<Word> selectWordList(String keyWord);
}
