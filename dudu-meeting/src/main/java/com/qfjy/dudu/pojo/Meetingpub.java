package com.qfjy.dudu.pojo;

import com.qfjy.dudu.common.core.ResultJson;
import lombok.Data;


import java.io.Serializable;
import java.util.Date;


@Data
public class Meetingpub implements Serializable {
    private String id;

    private String pcode;

    private String ptime;

    private String tname;

    private String ptitle;

    private String zone;

    private String remark;

    private Date createdate;

    private Short status;

    private Integer uid;

    private User user;

    private ResultJson resultJson;

}