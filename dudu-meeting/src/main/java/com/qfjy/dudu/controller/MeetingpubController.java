package com.qfjy.dudu.controller;



import com.qfjy.dudu.common.core.ResultJson;
import com.qfjy.dudu.pojo.Meetingpub;
import com.qfjy.dudu.pojo.User;
import com.qfjy.dudu.service.MeetingpubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MeetingpubController {


    @Autowired
    MeetingpubService meetingpubService;

    @Autowired
    private RestTemplate restTemplate;



    @RequestMapping("getMeetingpub")
    @ResponseBody
    public Meetingpub getMeetingpub(@RequestParam("id") String id){

        Meetingpub meetingpub = meetingpubService.selectBypcode(id);
     /*   if (meetingpub==null){
            return ResultJson.failed("id fail");
        }else{
            return  ResultJson.ok(meetingpub,"success");
        }*/

        //调用 用户微服务--》通过RestTemplate模版实现  得到用户信息
        /**
         * param1 url 请求的URL地址
         * param2 responseType 希望返回的类型.class
         * param3 占位符 最后一个参数是map,map的key为前面的占位符。map value为参数值
         * 可变长度的参数，一一来替换前面的占位符 name={name}形式，
         */
     /*   String url="http://localhost:8080/getuser?id={id}";

        ResponseEntity<User> responseEntity = restTemplate.getForEntity(url, User.class, meetingpub.getUid());

        User user = responseEntity.getBody();
        meetingpub.setUser(user);*/

        String url="http://DUDU-USER/getuser?id={id}";
        ResponseEntity<User> responseEntity=restTemplate.getForEntity(url, User.class,meetingpub.getUid());
        User user=responseEntity.getBody();

        meetingpub.setUser(user);

        return meetingpub;
    }
}
