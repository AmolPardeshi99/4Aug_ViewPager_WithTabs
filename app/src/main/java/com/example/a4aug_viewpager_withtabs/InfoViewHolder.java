package com.example.a4aug_viewpager_withtabs;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class InfoViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvInfo;
    public InfoViewHolder(@NonNull View itemView) {
        super(itemView);
        mTvInfo = itemView.findViewById(R.id.tvInformation);
    }

    void setData(String info){
        mTvInfo.setText(info);
    }
}
