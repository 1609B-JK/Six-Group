package com.jk.service;

import com.jk.entity.Word;

import java.util.List;

/**
 * Created by dell on 2017/5/27.
 */
public interface WordService {
    List<Word> selectWordList(String keyWord);
}
