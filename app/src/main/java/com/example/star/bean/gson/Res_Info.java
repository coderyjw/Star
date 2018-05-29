package com.example.star.bean.gson;

import com.google.gson.annotations.SerializedName;

import org.litepal.crud.DataSupport;

public class Res_Info  extends DataSupport {

    @SerializedName("showapi_res_error")
    public String res_error;
    @SerializedName("showapi_res_code")
    public String res_code;
    @SerializedName("showapi_res_body")
    public Res_Body body;


    public String getRes_error() {
        return res_error;
    }

    public void setRes_error(String res_error) {
        this.res_error = res_error;
    }

    public String getRes_code() {
        return res_code;
    }

    public void setRes_code(String res_code) {
        this.res_code = res_code;
    }

    public Res_Body getBody() {
        return body;
    }

    public void setBody(Res_Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Res_Info{" +
                "res_error='" + res_error + '\'' +
                ", res_code='" + res_code + '\'' +
                ", body=" + body +
                '}';
    }
}
