package com.example.star.bean.gson;

import org.litepal.crud.DataSupport;

public class Month  extends DataSupport {
    /**
     * love_txt : 单身者：月初桃花朵朵开，单身者能够在朋友的介绍下认识到不错的对象，各方面综合起来还算门当户对，只是耐心有限，容易因为第一眼的不喜欢而主动放弃了解的机会。下半月不妨把注意力放在工作上，积极的态度会提升你的魅力，吸引到异性的关注哦！
     有伴侣：有伴侣者情绪波动频繁，月中受到工作的影响，容易像个复读机一样不停的向对方倾诉，恋爱的天空因此变得沉闷，毫无绚丽的色彩。月初和月底情人间能够相互包容，感情因为体谅而变得越加甜蜜。
     * work_txt : 【解压方式】玩水果棋
     职业人士：上班族工作情绪低落，总有一些莫名的烦躁感，与同事沟通工作事宜极不耐烦，很容易造成人际关系危机的产生。与上司产生口角争执的几率较高，就算意见不同，心平气和更能显示出自己的大度。
     在校学生：学习热情不高，有“三天天打鱼，两天晒网”之嫌。上课人在心不在的情况居多，总是需要老师三番两次的提醒才能集中注意力。下半月小心复习力度太弱而考砸，考试准备工作需要多一点耐心与用心。
     * work_star : 2
     * money_star : 2
     * yfxz : 水瓶座
     * month_advantage : 桃花运较旺，可得贵人牵线搭桥。
     * lucky_direction : 西北方
     * love_star : 3
     * month_weakness : 工作遭遇低气压，烦闷感急速增加。
     * summary_star : 2
     * time : 201805
     * money_txt : 正财收入有所下滑，不仅薪酬有变相降低的可能，老板说好的奖金还会因为公司业绩不佳而减少，甚至取消。下半月不适合拓展生意，维持现有的产品销路较好，不确定因素太多，冲动扩展会带来风险。
     * general_txt : 情绪自控力不佳的一个月。感情发展不太顺心，不过只要愿意做出让步就能恢复如常；工作学习耐心不够，容易半途而废；财运低迷，少购物，多学习金融知识。
     * grxz : 射手座
     * xrxz : 金牛座
     */

    private String love_txt;
    private String work_txt;
    private int work_star;
    private int money_star;
    private String yfxz;
    private String month_advantage;
    private String lucky_direction;
    private int love_star;
    private String month_weakness;
    private int summary_star;
    private String time;
    private String money_txt;
    private String general_txt;
    private String grxz;
    private String xrxz;

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

    public String getYfxz() {
        return yfxz;
    }

    public void setYfxz(String yfxz) {
        this.yfxz = yfxz;
    }

    public String getMonth_advantage() {
        return month_advantage;
    }

    public void setMonth_advantage(String month_advantage) {
        this.month_advantage = month_advantage;
    }

    public String getLucky_direction() {
        return lucky_direction;
    }

    public void setLucky_direction(String lucky_direction) {
        this.lucky_direction = lucky_direction;
    }

    public int getLove_star() {
        return love_star;
    }

    public void setLove_star(int love_star) {
        this.love_star = love_star;
    }

    public String getMonth_weakness() {
        return month_weakness;
    }

    public void setMonth_weakness(String month_weakness) {
        this.month_weakness = month_weakness;
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

    public String getXrxz() {
        return xrxz;
    }

    public void setXrxz(String xrxz) {
        this.xrxz = xrxz;
    }
}
