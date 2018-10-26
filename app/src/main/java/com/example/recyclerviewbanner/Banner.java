package com.example.recyclerviewbanner;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bannerlibrary.DefineBaseIndicatorBanner;


/**
 * Name: d2c
 * Anthor: hrb
 * Date: 2017/7/27 16:38
 * Copyright (c) 2016 d2cmall. All rights reserved.
 */
public class Banner extends DefineBaseIndicatorBanner<String,Banner.ViewHolder, Banner> {

    public Banner(Context context) {
        this(context, null);
    }

    public Banner(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Banner(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public Banner.ViewHolder onCreateItemViewHolder(ViewGroup parent) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.layout_banner_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindItemView(Banner.ViewHolder holder, int position) {
        holder.text.setBackgroundColor(position%2==0? Color.parseColor("#ff0000"):Color.parseColor("#0000ff"));
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView text;

        public ViewHolder(View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.text);
        }
    }
}
