package com.jk.controller;

import com.jk.entity.Word;
import com.jk.service.WordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2017/5/27.
 */
@Controller
@RequestMapping("/word")
public class WordController {

    @Resource
    private WordService wordService;

    @RequestMapping("/spell_check")
    @ResponseBody
    public Map<String,Object> spell_check(String keyWord){
        System.out.println(keyWord);
        System.out.println("--------------------------------------------------------------------------");
        List<Word> data = wordService.selectWordList(keyWord);
        Integer code = 200;
        String msg = "成功";
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("code",code);
        map.put("msg",msg);
        map.put("data",data);
        System.out.println(data);
        return map;
    }
}
