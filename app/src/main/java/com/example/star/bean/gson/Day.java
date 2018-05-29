package com.example.star.bean.gson;


import org.litepal.crud.DataSupport;

public class Day extends DataSupport {

    /**
     * love_txt : 单身者想恋爱要做好心理准备，情路较为坎坷。喜欢的难追到，不喜欢的难拒绝。
     * work_txt : 今天你只要按照自己的心意做事就好，强迫自己去帮助他人，反倒容易被误会。
     * work_star : 2
     * money_star : 3
     * lucky_color : 马鞍棕
     * lucky_time : 下午10:00--12:00
     * love_star : 3
     * lucky_direction : 正西方
     * summary_star : 2
     * time : 20180509
     * money_txt : 欠缺开源的企图心，恐怕看得到金子却拿不到金子。
     * general_txt : 今天你很想表现自己的爱心，能善待身边的每一个人，对伴侣也会表现出超乎寻常的关心。理财方面今天会受到小人的觊觎，但你稳重的表现让对方产生一种睿智与豁达的感觉，似乎无从下手。
     * grxz : 摩羯座
     * lucky_num : 6
     * day_notice : 心神安静，不被外物所打扰。
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
