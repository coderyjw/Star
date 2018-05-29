package com.example.star.bean.gson;


import com.google.gson.annotations.SerializedName;

import org.litepal.crud.DataSupport;

public class Res_Body  extends DataSupport {
    @SerializedName("day")
    public Day day;
    @SerializedName("week")
    public Week week;
    @SerializedName("month")
    public  Month month;
    @SerializedName("tomorrow")
    public Tomorrow tomorrow;
    @SerializedName("year")
    public   Year year;
    @SerializedName("star")
    public  String star;

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public  int ret_code;

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Tomorrow getTomorrow() {
        return tomorrow;
    }

    public void setTomorrow(Tomorrow tomorrow) {
        this.tomorrow = tomorrow;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }


    public int getRet_code() {
        return ret_code;
    }

    public void setRet_code(int ret_code) {
        this.ret_code = ret_code;
    }
}
