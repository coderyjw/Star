package com.example.star.bean.gson;

import org.litepal.crud.DataSupport;

public class Week  extends DataSupport {
    /**
     * health_txt : 本周你有着良好的健康状况，抵抗能力也显得特别强，每天吃得好睡得香。
     * love_txt : 爱情秘笈：表现出自然之美，会令对方心动。
     * work_txt : 想要偷懒？恐怕本周你是没有这个机会了。事情接二连三，让你忙里难偷闲。对你而言都不是什么难事，只要用心做就能够做好，做到零失误还能免去加班的危险。
     * lucky_day : 星期二
     * work_star : 4
     * week_notice : 趁热打铁，扭转局势。
     * money_star : 3
     * lucky_color : 珊瑚橙
     * lucky_direction : 正北方
     * love_star : 4
     * summary_star : 4
     * time : 20180507-20180513
     * money_txt : 内心蠢蠢欲动，对钱财的渴望暴露无遗。这种饥饿的心态让你在赚钱上非常有手段，但需要注意的是，行事不可太过高调，否则易招小人拦路，尤其计划不可外泄。
     * general_txt : 从琐事中能找到自己的新价值。工作任务有点多，但没有完成不了的活，只要你认真去做就能漂亮交差。投资不要盲目跟风，理财才是本周的重点。
     * grxz : 摩羯座
     * xrxz : 天蝎座
     * lucky_num : 3
     */

    private String health_txt;
    private String love_txt;
    private String work_txt;
    private String lucky_day;
    private int work_star;
    private String week_notice;
    private int money_star;
    private String lucky_color;
    private String lucky_direction;
    private int love_star;
    private int summary_star;
    private String time;
    private String money_txt;
    private String general_txt;
    private String grxz;
    private String xrxz;
    private String lucky_num;

    public String getHealth_txt() {
        return health_txt;
    }

    public void setHealth_txt(String health_txt) {
        this.health_txt = health_txt;
    }

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

    public String getLucky_day() {
        return lucky_day;
    }

    public void setLucky_day(String lucky_day) {
        this.lucky_day = lucky_day;
    }

    public int getWork_star() {
        return work_star;
    }

    public void setWork_star(int work_star) {
        this.work_star = work_star;
    }

    public String getWeek_notice() {
        return week_notice;
    }

    public void setWeek_notice(String week_notice) {
        this.week_notice = week_notice;
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

    public String getLucky_num() {
        return lucky_num;
    }

    public void setLucky_num(String lucky_num) {
        this.lucky_num = lucky_num;
    }
}
