package com.example.star.fragment;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.star.CustomDialog;
import com.example.star.HttpUtil;
import com.example.star.R;
import com.example.star.Utility;
import com.example.star.bean.gson.Res_Body;
import com.example.star.bean.gson.Res_Info;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class WeekFragment extends Fragment {


    @BindView(R.id.image_star)
    ImageView imageStar;
    @BindView(R.id.text_star)
    TextView textStar;
    @BindView(R.id.title_date_text)
    TextView titleDateText;
    @BindView(R.id.summary_star)
    RatingBar summaryStar;
    @BindView(R.id.love_star)
    RatingBar loveStar;
    @BindView(R.id.date_text)
    TextView dateText;
    @BindView(R.id.work_star)
    RatingBar workStar;
    @BindView(R.id.money_star)
    RatingBar moneyStar;
    @BindView(R.id.lucky_day)
    TextView luckyDay;
    @BindView(R.id.lucky_direction)
    TextView luckyDirection;
    @BindView(R.id.lucky_color)
    TextView luckyColor;
    @BindView(R.id.grxz)
    TextView grxz;
    @BindView(R.id.lucky_num)
    TextView luckyNum;
    @BindView(R.id.xrxz)
    TextView xrxz;
    @BindView(R.id.general_txt)
    TextView generalTxt;
    @BindView(R.id.love_txt)
    TextView loveTxt;
    @BindView(R.id.work_txt)
    TextView workTxt;
    @BindView(R.id.money_txt)
    TextView moneyTxt;
    @BindView(R.id.week_notice)
    TextView weekNotice;
    @BindView(R.id.health_txt)
    TextView healthTxt;
    Unbinder unbinder;
    private Handler handler = null;
    private Res_Body res_body;

    public WeekFragment() {
        // Required empty public constructor
    }
    /**
     * 视图是否已经初初始化
     */
    protected boolean isInit = false;
    protected boolean isLoad = false;

    /**
     * 视图是否已经对用户可见，系统的方法
     */
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        isCanLoadData();
    }

    /**
     * 是否可以加载数据
     * 可以加载数据的条件：
     * 1.视图已经初始化
     * 2.视图对用户可见
     */
    private void isCanLoadData() {
        if (!isInit) {
            return;
        }

        if (getUserVisibleHint()) {
            initData(Utility.star);
            isLoad = true;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_week, container, false);
        //创建属于主线程的handler
        handler = new Handler();
        isInit = true;
        /**初始化的时候去加载数据**/
        isCanLoadData();
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    private void requestData(String star) {
        HttpUtil.sendOkHttpRequest(HttpUtil.BASE_URL + star, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                new Thread() {
                    @Override
                    public void run() {
                        Toast.makeText(getContext(), "获取星座信息失败", Toast.LENGTH_SHORT).show();
                        super.run();
                    }
                }.start();
            }
            @Override
            public void onResponse(Call call, final Response response) throws IOException {

                try {
                    Gson gson = new Gson();
                    final String jsonData = response.body().string();
                    res_body = gson.fromJson(jsonData, Res_Info.class).body;
                    SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(getContext()).edit();
                    editor.putString("res_body_today", jsonData);
                    editor.apply();
                    showStarInfo(res_body);

                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                }
            }
        });

    }
    public void initData(String star) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getContext());
        String starString = prefs.getString("res_body_today"+star, null);
        if (starString != null) {
            // 有缓存时
            Gson gson = new Gson();
            res_body = gson.fromJson(starString, Res_Info.class).body;
            if (res_body.getDay().getTime().equals(Utility.getNowDate())) {
                //  1.是今日的数据,直接解析数据
                showStarInfo(res_body);
            } else {
                //  2.不是今日的数据，去服务器查询
                requestData(star);
            }

        } else {
            //无缓存是去服务器查询数据
            requestData(star);
        }
    }
    private void showStarInfo(final Res_Body res_body) {
        new Thread() {
            @Override
            public void run() {

                Runnable runnableUi = new Runnable() {
                    @Override
                    public void run() {
                        titleDateText.setText(Utility.ConvertToData(res_body.week.getTime()));
                        textStar.setText(Utility.ConvertToStar(res_body.getStar()));
                        summaryStar.setRating(res_body.week.getSummary_star());
                        loveStar.setRating(res_body.week.getLove_star());
                        workStar.setRating(res_body.week.getWork_star());
                        moneyStar.setRating(res_body.week.getMoney_star());
                        luckyDay.setText(res_body.week.getLucky_day());
                        luckyDirection.setText(res_body.week.getLucky_direction());
                        luckyColor.setText(res_body.week.getLucky_color());
                        grxz.setText(res_body.week.getGrxz());
                        xrxz.setText(res_body.week.getXrxz());
                        luckyNum.setText(res_body.week.getLucky_num());
                        generalTxt.setText(res_body.week.getGeneral_txt());
                        loveTxt.setText(res_body.week.getLove_txt());
                        workTxt.setText(res_body.week.getWork_txt());
                        moneyTxt.setText(res_body.week.getMoney_txt());
                        weekNotice.setText(res_body.week.getWeek_notice());
                        healthTxt.setText(res_body.week.getHealth_txt());
                        Glide.with(getContext()).load(Utility.ConvertToStar2(res_body.getStar())).into(imageStar);

                    }
                };
                handler.post(runnableUi);
            }
        }.start();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
        isInit = false;
        isLoad = false;
    }
    @OnClick(R.id.image_star)
    public void onViewClicked() {
        CustomDialog customDialog = new CustomDialog(getActivity()) {
            @Override
            protected void onShareItemClick(int position) {
                Utility.setStar(Utility.ConvertToStar1(Utility.getStarInfoList().get(position).getName())); ;
                initData(Utility.star);
            }
        };
        customDialog.showDialog();


    }
}
