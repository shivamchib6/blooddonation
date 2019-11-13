package com.example.nisha.blooddonation;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;
import java.util.ArrayList;

public class NotificationFragment extends Fragment {
    ArrayList<NewsItems> al = new ArrayList();
    private Adapter mAdapter;
    private LayoutManager mLayoutManager;
    private RecyclerView recyclerViewnews;
    VideoView videoView;

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vvv = inflater.inflate(R.layout.notificationfragment, container, false);
        String url = new StringBuilder();
        url.append("android.resource://");
        url.append(getContext().getPackageName());
        url.append("/");
        url.append(R.raw.abc);
        Uri uri = Uri.parse(url.toString());
        this.videoView = (VideoView) vvv.findViewById(R.id.vidoewviewvideo);
        this.videoView.setVideoURI(uri);
        MediaController m = new MediaController(getContext());
        this.videoView.setMediaController(m);
        m.setAnchorView(this.videoView);
        this.al.add(new NewsItems(R.drawable.ic_action_home, "Blood donors needed", "Urgent need of donors inn asr"));
        this.al.add(new NewsItems(R.drawable.ic_action_person, "Blood needed for cancer treatment", "Needed in mumbai."));
        this.al.add(new NewsItems(R.drawable.ic_action_person1, "Easy ways to donate blood ", "Visit gndu blood bank"));
        this.al.add(new NewsItems(R.drawable.ic_action_hospital, "New blood bank opeaned in amritsar", "SIMRAN BLOOD BANK"));
        this.al.add(new NewsItems(R.drawable.ic_action_money, "Blood donor needed for patient", "Place : JALANDHAR Number "));
        this.recyclerViewnews = (RecyclerView) vvv.findViewById(R.id.reccylerviewnews);
        this.recyclerViewnews.setHasFixedSize(true);
        this.mLayoutManager = new LinearLayoutManager(getContext());
        this.mAdapter = new RecyclerViewNewsAdapter(this.al);
        this.recyclerViewnews.setLayoutManager(this.mLayoutManager);
        this.recyclerViewnews.setAdapter(this.mAdapter);
        return vvv;
    }
}
