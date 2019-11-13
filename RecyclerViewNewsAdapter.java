package com.example.nisha.blooddonation;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class RecyclerViewNewsAdapter extends Adapter<ViewHolderNews> {
    private ArrayList<NewsItems> mNewsItems;

    class ViewHolderNews extends ViewHolder {
        ImageView imageViewnews;
        TextView textView1;
        TextView textview22;

        public ViewHolderNews(@NonNull View itemView) {
            super(itemView);
            this.imageViewnews = (ImageView) itemView.findViewById(R.id.imageviewnews);
            this.textView1 = (TextView) itemView.findViewById(R.id.textviewnews1);
            this.textview22 = (TextView) itemView.findViewById(R.id.textviewnews2);
        }
    }

    @NonNull
    public ViewHolderNews onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolderNews(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_news, viewGroup, false));
    }

    public void onBindViewHolder(@NonNull ViewHolderNews viewHolderNews, int i) {
        NewsItems newsItems = (NewsItems) this.mNewsItems.get(i);
        viewHolderNews.imageViewnews.setImageResource(newsItems.getMresource());
        viewHolderNews.textView1.setText(newsItems.getText1());
        viewHolderNews.textview22.setText(newsItems.getText2());
    }

    public int getItemCount() {
        return this.mNewsItems.size();
    }

    public RecyclerViewNewsAdapter(ArrayList<NewsItems> exampleList) {
        this.mNewsItems = exampleList;
    }
}
