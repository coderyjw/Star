package com.example.star;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.star.adapter.StarAdapter;
import com.example.star.bean.StarInfo;
import com.example.star.fragment.TodayFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public abstract class CustomDialog {

    private Context mContext;
    public CustomDialog(Context mContext) {
        this.mContext = mContext;

    }
    private RecyclerView recyclerView;
    //private  List<StarInfo> mStarInfoList =new ArrayList<StarInfo>();
    private View dialogView;
    AlertDialog.Builder builder;
    AlertDialog dialog;

    @SuppressLint("ResourceAsColor")
    public void showDialog() {
        if (dialogView == null) {
            //只初始化一次
            dialogView = LayoutInflater.from(mContext).inflate(R.layout.custom_dialog, null, false);
            recyclerView = dialogView.findViewById(R.id.recycler_view);
            StarAdapter starAdapter = new StarAdapter(Utility.getStarInfoList(),mContext);
            starAdapter.setOnShareClickListener(new StarAdapter.OnShareClickListener() {
                @Override
                public void onClick(int position) {
                    onShareItemClick(position);
                    dialog.hide();
                }
            } );
            recyclerView.setLayoutManager(new GridLayoutManager(mContext, 3));
            recyclerView.setAdapter(starAdapter);
            builder = new AlertDialog.Builder(mContext);
            TextView title = new TextView(mContext);
            title.setText("选择你的星座（公历/阳历）");
            title.setPadding(10, 16, 10, 16);//设置title的边距 left top ,right,bottom
            title.setGravity(Gravity.CENTER);//标题居中
            title.setTextSize(16);
           title.setTextColor(Color.parseColor("#FF4081"));
            builder.setCustomTitle(title);
            builder.setView(dialogView);
            dialog = builder.setCancelable(true).create();
            dialog.show();
        } else {
            dialog.show();
        }

    }
    protected abstract void onShareItemClick(int position);

}
