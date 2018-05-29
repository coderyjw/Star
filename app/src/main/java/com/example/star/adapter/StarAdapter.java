package com.example.star.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.star.R;
import com.example.star.bean.StarInfo;

import java.util.List;

public class StarAdapter extends RecyclerView.Adapter<StarAdapter.MyViewHolder> {
    private List<StarInfo> mStarList;
    private Context mContext;

    public StarAdapter(List<StarInfo> mStarList,Context context) {
        this.mStarList = mStarList;
        this.mContext=context;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_dialog_item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        StarInfo starInfo = mStarList.get(position);
        holder.recyle_star_txt.setText(starInfo.getName());
        Glide.with(mContext).load(starInfo.getImageId()).into(holder.recyle_star_image);
        holder.recyle_date_txt.setText(starInfo.getDate());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onShareClickListener!=null){
                    onShareClickListener.onClick(position);
                }
            }
        });
    }

    public void setOnShareClickListener(OnShareClickListener onShareClickListener) {
        this.onShareClickListener = onShareClickListener;
    }

    @Override
    public int getItemCount() {
        return mStarList.size();
    }

    private OnShareClickListener onShareClickListener;

    public interface OnShareClickListener {
        void onClick(int position);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView recyle_star_image;
        private TextView recyle_star_txt;
        private TextView recyle_date_txt;

        public MyViewHolder(View itemView) {
            super(itemView);
            recyle_star_image = itemView.findViewById(R.id.recyle_star_image);
            recyle_star_txt =  itemView.findViewById(R.id.recyle_star_txt);
            recyle_date_txt =itemView.findViewById(R.id.recyle_date_txt);
        }
    }
}
