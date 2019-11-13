package com.example.nisha.blooddonation;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    Integer[] img = new Integer[]{Integer.valueOf(R.drawable.myblood), Integer.valueOf(R.drawable.myblood2), Integer.valueOf(R.drawable.myblood3)};
    LayoutInflater layoutInflater;

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    public int getCount() {
        return this.img.length;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        this.layoutInflater = (LayoutInflater) this.context.getSystemService("layout_inflater");
        View view = this.layoutInflater.inflate(R.layout.custom_layout, null);
        ((ImageView) view.findViewById(R.id.againimageview)).setImageResource(this.img[position].intValue());
        view.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (position == 0) {
                    Toast.makeText(ViewPagerAdapter.this.context, "1st", 0).show();
                    ViewPagerAdapter.this.context.startActivity(new Intent(ViewPagerAdapter.this.context, DonateBlood.class));
                } else if (position == 1) {
                    Toast.makeText(ViewPagerAdapter.this.context, "2st", 0).show();
                    ViewPagerAdapter.this.context.startActivity(new Intent(ViewPagerAdapter.this.context, DonateBlood.class));
                } else if (position == 2) {
                    Toast.makeText(ViewPagerAdapter.this.context, "3st", 0).show();
                    ViewPagerAdapter.this.context.startActivity(new Intent(ViewPagerAdapter.this.context, DonateBlood.class));
                }
            }
        });
        ((ViewPager) container).addView(view, 0);
        return view;
    }

    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager) container).removeView((View) object);
    }
}
