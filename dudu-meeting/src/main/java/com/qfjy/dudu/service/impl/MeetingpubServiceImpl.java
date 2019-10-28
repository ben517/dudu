package com.qfjy.dudu.service.impl;


import com.qfjy.dudu.mapper.MeetingpubMapper;
import com.qfjy.dudu.pojo.Meetingpub;
import com.qfjy.dudu.service.MeetingpubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingpubServiceImpl implements MeetingpubService {


    @Autowired
    MeetingpubMapper meetingpubMapper;

    @Override
    public Meetingpub selectBypcode(String pcode) {
        return meetingpubMapper.selectBypcode(pcode);
    }
}
