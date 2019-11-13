package com.example.nisha.blooddonation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment {
    String[] abc = new String[]{"DONATE BLOOD HERE", "CONTACT FOR BLOOD", "SHARE IT WITH FRIENDS"};
    int[] bloodbankimages = new int[]{R.drawable.bloodbank1, R.drawable.rotarybloodbank, R.drawable.youngbloood, R.drawable.kdhospital, R.drawable.adlakha, R.drawable.beamsblood};
    RecyclerView bloodrecyclerview;
    int[] def = new int[]{R.drawable.bll, R.drawable.bll2, R.drawable.bll3};
    ImageView imageView1;
    int[] images = new int[]{R.drawable.myblood, R.drawable.myblood2, R.drawable.myblood3};
    int[] imagesinfo = new int[]{R.drawable.group8, R.drawable.group2, R.drawable.group3, R.drawable.group4};
    int[] imageslistview = new int[]{R.drawable.ic_action_person1, R.drawable.ic_action_money};
    RecyclerView inforecyclerview;
    ListView listView;
    String[] nameofbloodbank = new String[]{"GreenAvenue Bloodbank", "Rotary blood bank", "Young blood association", "KD hospital and blood bank", "Adlakha blood bank", "Beams blood bank"};
    String[] phonenumber = new String[]{"01832563103", "01832570401", "09872179799", "09876696677", "01832225354", "Not Available yet"};
    RecyclerView recyclerView;
    String[] textlistview = new String[]{"Reach to Developers to help ", "Donate now to help others and share it"};
    ViewPager viewFlipper;

    class CustomAdapter extends BaseAdapter {
        CustomAdapter() {
        }

        public int getCount() {
            return HomeFragment.this.imageslistview.length;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            view = HomeFragment.this.getLayoutInflater().inflate(R.layout.items_list_view, null);
            TextView textView = (TextView) view.findViewById(R.id.textViewlistview);
            ((ImageView) view.findViewById(R.id.imageviewlistview)).setImageResource(HomeFragment.this.imageslistview[i]);
            textView.setText(HomeFragment.this.textlistview[i]);
            return view;
        }
    }

    public class MyTimer extends TimerTask {
        public void run() {
            if (HomeFragment.this.getActivity() != null) {
                HomeFragment.this.getActivity().runOnUiThread(new Runnable() {
                    public void run() {
                        if (HomeFragment.this.viewFlipper.getCurrentItem() == 0) {
                            HomeFragment.this.viewFlipper.setCurrentItem(1);
                        } else if (HomeFragment.this.viewFlipper.getCurrentItem() == 1) {
                            HomeFragment.this.viewFlipper.setCurrentItem(2);
                        } else if (HomeFragment.this.viewFlipper.getCurrentItem() == 2) {
                            HomeFragment.this.viewFlipper.setCurrentItem(0);
                        }
                    }
                });
            }
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.homefragment, container, false);
        this.viewFlipper = (ViewPager) v.findViewById(R.id.viewflipper);
        this.viewFlipper.setAdapter(new ViewPagerAdapter(getContext()));
        this.recyclerView = (RecyclerView) v.findViewById(R.id.recyclerviewq);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.recyclerView.setAdapter(new RecyclerViewHorizontalAdapter(this.abc, this.def, getContext()));
        this.bloodrecyclerview = (RecyclerView) v.findViewById(R.id.recyclerviewq2);
        this.bloodrecyclerview.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.bloodrecyclerview.setAdapter(new RecyclerViewBloodBankAdapter(this.bloodbankimages, this.nameofbloodbank, this.phonenumber, getContext()));
        this.inforecyclerview = (RecyclerView) v.findViewById(R.id.recyclerviewq3);
        this.inforecyclerview.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.inforecyclerview.setAdapter(new RecyclerViewInfomationAdapter(this.imagesinfo, getContext()));
        this.listView = (ListView) v.findViewById(R.id.listviewhelp);
        this.listView.setAdapter(new CustomAdapter());
        this.listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Toast.makeText(HomeFragment.this.getContext(), "First is clicked", 0).show();
                    HomeFragment.this.startActivity(new Intent(HomeFragment.this.getContext(), HelpAndDonateActivity.class));
                }
                if (i == 1) {
                    Toast.makeText(HomeFragment.this.getContext(), "First is clicked", 0).show();
                    HomeFragment.this.startActivity(new Intent(HomeFragment.this.getContext(), HelpAndDonateActivity.class));
                }
            }
        });
        new Timer().scheduleAtFixedRate(new MyTimer(), 3000, 4000);
        return v;
    }
}
