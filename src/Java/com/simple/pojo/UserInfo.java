package com.simple.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserInfo {
    /**
     * id
     */
    private String id;

    /**
     * name
     */
    private String name;

    /**
     * 密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Date addTime;
    /**
     * 创建时间str
     */
    private String addTimeStr;

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        this.addTimeStr = format.format(addTime);
    }

    public String getAddTimeStr() {
        return addTimeStr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
