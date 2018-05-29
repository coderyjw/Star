package com.example.star;


import com.example.star.bean.StarInfo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Utility {
    private     static  final List<StarInfo> mStarInfoList=  new ArrayList<StarInfo>();

    public  static  String star="baiyang";

    public static String ConvertToStar(String star) {
        switch (star) {
            case "baiyang":
                return "白羊座";
            case "jinniu":
                return "金牛座";
            case "shuangzi":
                return "双子座";
            case "juxie":
                return "巨蟹座";
            case "shizi":
                return "狮子座";
            case "chunv":
                return "处女座";
            case "tiancheng":
                return "天秤座";
            case "tianxie":
                return "天蝎座";
            case "sheshou":
                return "射手座";
            case "mojie":
                return "魔蝎座";
            case "shuiping":
                return "水瓶座";
            case "shuangyu":
                return "双鱼座";
        }
        return null;
    }


    public static String ConvertToStar1(String star) {
        switch (star) {
            case "白羊座":
                return "baiyang";
            case "金牛座":
                return "jinniu";
            case "双子座":
                return "shuangzi";
            case "巨蟹座":
                return "juxie";
            case "狮子座":
                return "shizi";
            case "处女座":
                return "chunv";
            case "天秤座":
                return "tiancheng";
            case "天蝎座":
                return "tianxie";
            case "射手座":
                return "sheshou";
            case "魔蝎座":
                return "mojie";
            case "水瓶座":
                return "shuiping";
            case "双鱼座":
                return "shuangyu";
        }
        return null;
    }

    public static Integer ConvertToStar2(String star) {
        switch (star) {
            case "baiyang":
                return R.mipmap.baiyang;
            case "jinniu":
                return R.mipmap.jinniu;
            case "shuangzi":
                return R.mipmap.shuangzi;
            case "juxie":
                return R.mipmap.juxie;
            case "shizi":
                return R.mipmap.shizi;
            case "chunv":
                return R.mipmap.chunv;
            case "tiancheng":
                return R.mipmap.tiancheng;
            case "tianxie":
                return R.mipmap.tianxie;
            case "sheshou":
                return R.mipmap.sheshou;
            case "mojie":
                return R.mipmap.mojie;
            case "shuiping":
                return R.mipmap.shuiping;
            case "shuangyu":
                return R.mipmap.shuangyu;
        }
        return null;
    }

    public static String ConvertToData(String date) {
        if (date.length() == 8) {
            return date.substring(0, 4) + "." + date.substring(4, 6) + "." + date.substring(6, 8);
        } else if (date.length() == 17){
            return date.substring(0, 4) + "." + date.substring(4, 6) + "." + date.substring(6, 8) + "-"
                    + date.substring(13, 15) + "." + date.substring(15, 17);
    }else  if(date.length() == 6){
            return  date.substring(0,4)+"."+date.substring(4,6)+".01-"+date.substring(4,6)+".31";
        }else  if(date.length()==4){
            return  date.substring(0,4)+".01.01-12.31";
        }
    return null;
   }

   public static  String ConvertToTime(String time){
        return time.substring(2,time.length());
   }

    /**
     * 获取现在时间
     *
     * @return返回短时间格式 yyyyMMdd
     */
    public  static  String  getNowDate(){
       Date currentTime=new Date();
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
       String dateString = formatter.format(currentTime);
       return dateString.substring(0,4)+dateString.substring(5,7)+dateString.substring(8,dateString.length());
   }

    public final  static  List<StarInfo> getStarInfoList() {
      if(mStarInfoList.size()==12){
          return mStarInfoList;
      }else {
          StarInfo baiyang = new StarInfo("白羊座", R.mipmap.baiyang, "03.21-04.19");
          mStarInfoList.add(baiyang);
          StarInfo jinniu = new StarInfo("金牛座", R.mipmap.jinniu, "04.20-05.20");
          mStarInfoList.add(jinniu);
          StarInfo shuangzi = new StarInfo("双子座", R.mipmap.shuangzi, "05.21-06.21");
          mStarInfoList.add(shuangzi);
          StarInfo juxie = new StarInfo("巨蟹座", R.mipmap.juxie, "06.22-07.22");
          mStarInfoList.add(juxie);
          StarInfo shizi = new StarInfo("狮子座", R.mipmap.shizi, "07.23-08.22");
          mStarInfoList.add(shizi);
          StarInfo chunv = new StarInfo("处女座", R.mipmap.chunv, "08.23-09.22");
          mStarInfoList.add(chunv);
          StarInfo tiancheng = new StarInfo("天秤座", R.mipmap.tiancheng, "09.23-10.23");
          mStarInfoList.add(tiancheng);
          StarInfo tianxie = new StarInfo("天蝎座", R.mipmap.tianxie, "10.24-11.22");
          mStarInfoList.add(tianxie);
          StarInfo sheshou = new StarInfo("射手座", R.mipmap.sheshou, "11.23-12.21");
          mStarInfoList.add(sheshou);
          StarInfo moxie = new StarInfo("魔蝎座", R.mipmap.mojie, "12.22-01.19");
          mStarInfoList.add(moxie);
          StarInfo shuiping = new StarInfo("水瓶座", R.mipmap.shuiping, "01.20-02.18");
          mStarInfoList.add(shuiping);
          StarInfo shuangyu = new StarInfo("双鱼座", R.mipmap.shuangyu, "02.19-3.20");
          mStarInfoList.add(shuangyu);
          return  mStarInfoList;
      }

    }

    public   static  void setStar(String mstar){
        star=mstar;
    }


}
