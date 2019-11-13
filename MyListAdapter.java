package com.example.nisha.blooddonation;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final Integer[] imgid;
    private final String[] maintitle;
    private final String[] subtitle;

    public MyListAdapter(Activity context, String[] maintitle, String[] subtitle, Integer[] imgid) {
        super(context, R.layout.mylist, maintitle);
        this.context = context;
        this.maintitle = maintitle;
        this.subtitle = subtitle;
        this.imgid = imgid;
    }

    public View getView(int position, View view, ViewGroup parent) {
        View rowView = this.context.getLayoutInflater().inflate(R.layout.mylist, null, true);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);
        ((TextView) rowView.findViewById(R.id.title)).setText(this.maintitle[position]);
        imageView.setImageResource(this.imgid[position].intValue());
        subtitleText.setText(this.subtitle[position]);
        return rowView;
    }
}
