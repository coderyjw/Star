package com.example.star.bean.gson;

import org.litepal.crud.DataSupport;

public class Tomorrow  extends DataSupport {
    /**
     * love_txt : 感情上有一团乱的情形，不是互相吃醋就是互相争个你死我活，别斗气，气坏了就不好了！
     * work_txt : 心情在一点点变得浮躁，时时提醒自己要冷静才好，情绪化只会是你生活工作的绊脚石。
     * work_star : 2
     * money_star : 3
     * lucky_color : 牡蛎白
     * lucky_time : 上午9:00--11:00
     * love_star : 1
     * lucky_direction : 正南方
     * summary_star : 2
     * time : 20180510
     * money_txt : 胆大心细，投资注意看好大方向！
     * general_txt : 今天烂桃花开，单身者参加PARTY时，对于接近自己的异性要多留个心眼，谨防桃色陷阱。财运方面应留意一些中小型投资，能有不错发现。工作上别太急躁，会因一些不该有的失误而受到老板的责备。
     * grxz : 摩羯座
     * lucky_num : 4
     * day_notice : 忌冲动，留意人情往来。
     */

    private String love_txt;
    private String work_txt;
    private int work_star;
    private int money_star;
    private String lucky_color;
    private String lucky_time;
    private int love_star;
    private String lucky_direction;
    private int summary_star;
    private String time;
    private String money_txt;
    private String general_txt;
    private String grxz;
    private String lucky_num;
    private String day_notice;

    public String getLove_txt() {
        return love_txt;
    }

    public void setLove_txt(String love_txt) {
        this.love_txt = love_txt;
    }

    public String getWork_txt() {
        return work_txt;
    }

    public void setWork_txt(String work_txt) {
        this.work_txt = work_txt;
    }

    public int getWork_star() {
        return work_star;
    }

    public void setWork_star(int work_star) {
        this.work_star = work_star;
    }

    public int getMoney_star() {
        return money_star;
    }

    public void setMoney_star(int money_star) {
        this.money_star = money_star;
    }

    public String getLucky_color() {
        return lucky_color;
    }

    public void setLucky_color(String lucky_color) {
        this.lucky_color = lucky_color;
    }

    public String getLucky_time() {
        return lucky_time;
    }

    public void setLucky_time(String lucky_time) {
        this.lucky_time = lucky_time;
    }

    public int getLove_star() {
        return love_star;
    }

    public void setLove_star(int love_star) {
        this.love_star = love_star;
    }

    public String getLucky_direction() {
        return lucky_direction;
    }

    public void setLucky_direction(String lucky_direction) {
        this.lucky_direction = lucky_direction;
    }

    public int getSummary_star() {
        return summary_star;
    }

    public void setSummary_star(int summary_star) {
        this.summary_star = summary_star;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMoney_txt() {
        return money_txt;
    }

    public void setMoney_txt(String money_txt) {
        this.money_txt = money_txt;
    }

    public String getGeneral_txt() {
        return general_txt;
    }

    public void setGeneral_txt(String general_txt) {
        this.general_txt = general_txt;
    }

    public String getGrxz() {
        return grxz;
    }

    public void setGrxz(String grxz) {
        this.grxz = grxz;
    }

    public String getLucky_num() {
        return lucky_num;
    }

    public void setLucky_num(String lucky_num) {
        this.lucky_num = lucky_num;
    }

    public String getDay_notice() {
        return day_notice;
    }

    public void setDay_notice(String day_notice) {
        this.day_notice = day_notice;
    }
}
