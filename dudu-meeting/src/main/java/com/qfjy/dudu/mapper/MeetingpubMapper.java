package com.qfjy.dudu.mapper;


import com.qfjy.dudu.pojo.Meetingpub;
import org.apache.ibatis.annotations.Select;

public interface MeetingpubMapper {
    int deleteByPrimaryKey(String id);

    int insert(Meetingpub record);

    int insertSelective(Meetingpub record);

    Meetingpub selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Meetingpub record);

    int updateByPrimaryKey(Meetingpub record);


    @Select("select * from meetingpub where pcode=#{pcode}")
    Meetingpub selectBypcode(String pcode);
}