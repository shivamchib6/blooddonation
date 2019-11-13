package com.example.nisha.blooddonation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;

public class RecyclerViewHorizontalAdapter extends Adapter<HorizontalViewHolder> {
    Context context;
    private int[] img1;
    private String[] text1;

    public class HorizontalViewHolder extends ViewHolder {
        ImageView imageView;
        RelativeLayout relativeLayout;
        TextView textView;

        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageviewrecycler);
            this.textView = (TextView) itemView.findViewById(R.id.textViewrecycler);
            this.relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativenowtrue);
        }
    }

    public RecyclerViewHorizontalAdapter(String[] text1, int[] img1, Context context) {
        this.text1 = text1;
        this.img1 = img1;
        this.context = context;
    }

    @NonNull
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new HorizontalViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_items, viewGroup, false));
    }

    public void onBindViewHolder(@NonNull HorizontalViewHolder horizontalViewHolder, int i) {
        final int value = i;
        horizontalViewHolder.textView.setText(this.text1[i]);
        horizontalViewHolder.imageView.setImageResource(this.img1[i]);
        horizontalViewHolder.relativeLayout.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (value == 0) {
                    Log.i("Shivam", "YESSSSSSSSSSS");
                    Toast.makeText(RecyclerViewHorizontalAdapter.this.context.getApplicationContext(), "YESSSSSS", 0).show();
                    RecyclerViewHorizontalAdapter.this.context.startActivity(new Intent(RecyclerViewHorizontalAdapter.this.context.getApplicationContext(), DonateBlood.class));
                }
                if (value == 1) {
                    Log.i("Shivam", "YESSSSSSSSSSS");
                    Toast.makeText(RecyclerViewHorizontalAdapter.this.context.getApplicationContext(), "111111", 0).show();
                    RecyclerViewHorizontalAdapter.this.context.startActivity(new Intent(RecyclerViewHorizontalAdapter.this.context.getApplicationContext(), NeedBlood.class));
                }
                if (value == 2) {
                    Log.i("Shivam", "Share app with your friends");
                    Toast.makeText(RecyclerViewHorizontalAdapter.this.context.getApplicationContext(), "222222", 0).show();
                    String apipath = RecyclerViewHorizontalAdapter.this.context.getApplicationContext().getApplicationInfo().sourceDir;
                    Intent i = new Intent("android.intent.action.SEND");
                    i.setType("application/vnd.android.package-archive");
                    i.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(apipath)));
                    RecyclerViewHorizontalAdapter.this.context.startActivity(Intent.createChooser(i, "Share app now"));
                }
            }
        });
    }

    public int getItemCount() {
        return this.text1.length;
    }
}
