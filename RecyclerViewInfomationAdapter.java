package com.example.nisha.blooddonation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import java.io.File;

public class RecyclerViewInfomationAdapter extends Adapter<HorizontalViewHolderInfo> {
    Context context;
    int[] imagesinfomation;

    public class HorizontalViewHolderInfo extends ViewHolder {
        ImageView imageViewinfomation;
        RelativeLayout relativeLayout;

        public HorizontalViewHolderInfo(@NonNull View itemView) {
            super(itemView);
            this.imageViewinfomation = (ImageView) itemView.findViewById(R.id.imageviewinfomation);
            this.relativeLayout = (RelativeLayout) itemView.findViewById(R.id.yesyesyes);
        }
    }

    @NonNull
    public HorizontalViewHolderInfo onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new HorizontalViewHolderInfo(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_info, viewGroup, false));
    }

    public RecyclerViewInfomationAdapter(int[] imagesinfomation, Context context) {
        this.imagesinfomation = imagesinfomation;
        this.context = context;
    }

    public void onBindViewHolder(@NonNull HorizontalViewHolderInfo horizontalViewHolderInfo, final int i) {
        horizontalViewHolderInfo.imageViewinfomation.setImageResource(this.imagesinfomation[i]);
        horizontalViewHolderInfo.relativeLayout.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                int value = i;
                if (value == 0) {
                    Toast.makeText(RecyclerViewInfomationAdapter.this.context, "Loading", 0).show();
                    RecyclerViewInfomationAdapter.this.context.startActivity(new Intent(RecyclerViewInfomationAdapter.this.context.getApplicationContext(), InformationBloodgrouptesting.class));
                }
                if (value == 1) {
                    Toast.makeText(RecyclerViewInfomationAdapter.this.context, "Loading", 0).show();
                    RecyclerViewInfomationAdapter.this.context.startActivity(new Intent(RecyclerViewInfomationAdapter.this.context.getApplicationContext(), Compatibilty.class));
                }
                if (value == 2) {
                    Toast.makeText(RecyclerViewInfomationAdapter.this.context, "3rd", 0).show();
                    RecyclerViewInfomationAdapter.this.context.startActivity(new Intent(RecyclerViewInfomationAdapter.this.context.getApplicationContext(), India.class));
                }
                if (value == 3) {
                    Toast.makeText(RecyclerViewInfomationAdapter.this.context, "4th", 0).show();
                    String apipath = RecyclerViewInfomationAdapter.this.context.getApplicationContext().getApplicationInfo().sourceDir;
                    Intent i = new Intent("android.intent.action.SEND");
                    i.setType("application/vnd.android.package-archive");
                    i.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(apipath)));
                    RecyclerViewInfomationAdapter.this.context.startActivity(Intent.createChooser(i, "Share app now"));
                }
            }
        });
    }

    public int getItemCount() {
        return this.imagesinfomation.length;
    }
}
