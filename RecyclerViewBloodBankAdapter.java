package com.example.nisha.blooddonation;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclerViewBloodBankAdapter extends Adapter<HorizontalViewHolderblood> {
    int[] bloodbankkimages;
    String[] bloodbankname;
    String[] bloodbankphonenumber;
    Context context;

    public class HorizontalViewHolderblood extends ViewHolder {
        ImageView imageViewbloodbank;
        RelativeLayout relativeLayout222;
        TextView textViewaddress;
        TextView textViewphonenumber;

        public HorizontalViewHolderblood(@NonNull View itemView) {
            super(itemView);
            this.imageViewbloodbank = (ImageView) itemView.findViewById(R.id.imageviewbloodbank);
            this.textViewaddress = (TextView) itemView.findViewById(R.id.textViewbloodbank);
            this.textViewphonenumber = (TextView) itemView.findViewById(R.id.textViewphonenumber);
            this.relativeLayout222 = (RelativeLayout) itemView.findViewById(R.id.nevergiveup);
        }
    }

    public RecyclerViewBloodBankAdapter(int[] bloodbankkimages, String[] bloodbankname, String[] bloodbankphonenumber, Context context) {
        this.bloodbankkimages = bloodbankkimages;
        this.bloodbankname = bloodbankname;
        this.bloodbankphonenumber = bloodbankphonenumber;
        this.context = context;
    }

    @NonNull
    public HorizontalViewHolderblood onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new HorizontalViewHolderblood(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_bloodbank, viewGroup, false));
    }

    public void onBindViewHolder(@NonNull HorizontalViewHolderblood horizontalViewHolderblood, int i) {
        final int value = i;
        horizontalViewHolderblood.imageViewbloodbank.setImageResource(this.bloodbankkimages[i]);
        horizontalViewHolderblood.textViewaddress.setText(this.bloodbankname[i]);
        horizontalViewHolderblood.textViewphonenumber.setText(this.bloodbankphonenumber[i]);
        int[] bloodbankimages = new int[]{R.drawable.bloodbank1, R.drawable.rotarybloodbank, R.drawable.youngbloood, R.drawable.kdhospital, R.drawable.adlakha, R.drawable.beamsblood};
        horizontalViewHolderblood.relativeLayout222.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent i;
                if (value == 0) {
                    Toast.makeText(RecyclerViewBloodBankAdapter.this.context.getApplicationContext(), "One", 0).show();
                    i = new Intent(RecyclerViewBloodBankAdapter.this.context.getApplicationContext(), InternalBloodBankActivity.class);
                    i.putExtra("profile", R.drawable.bloodbank1);
                    i.putExtra("name", "Green Avenue BloodBank");
                    i.putExtra("Phonenumber", "01832563103");
                    i.putExtra("active", "9am to 8pm");
                    i.putExtra("Ratings", "4.4 star");
                    i.putExtra("address", " Mcleod Road, Rani Ka Bagh, Amritsar Cantonment, Amritsar, Punjab 143001");
                    RecyclerViewBloodBankAdapter.this.context.startActivity(i);
                }
                if (value == 1) {
                    Toast.makeText(RecyclerViewBloodBankAdapter.this.context.getApplicationContext(), "two", 0).show();
                    i = new Intent(RecyclerViewBloodBankAdapter.this.context.getApplicationContext(), InternalBloodBankActivity.class);
                    i.putExtra("profile", R.drawable.rotarybloodbank);
                    i.putExtra("name", "Rotary Blood Bank");
                    i.putExtra("Phonenumber", "01832570401");
                    i.putExtra("active", "24 hours");
                    i.putExtra("Ratings", "4 star");
                    i.putExtra("address", "Radha Swami Road, Amritsar, Punjab 143001");
                    RecyclerViewBloodBankAdapter.this.context.startActivity(i);
                }
                if (value == 2) {
                    Toast.makeText(RecyclerViewBloodBankAdapter.this.context.getApplicationContext(), "three", 0).show();
                    i = new Intent(RecyclerViewBloodBankAdapter.this.context.getApplicationContext(), InternalBloodBankActivity.class);
                    i.putExtra("profile", R.drawable.youngbloood);
                    i.putExtra("name", "Young Blood Association");
                    i.putExtra("Phonenumber", "09872179799");
                    i.putExtra("active", "24 hours");
                    i.putExtra("Ratings", "4.6 star");
                    i.putExtra("address", " F 11/510 Paris Town Street No 3 Batala Road, Amritsar, Punjab 143001");
                    RecyclerViewBloodBankAdapter.this.context.startActivity(i);
                }
                if (value == 3) {
                    Toast.makeText(RecyclerViewBloodBankAdapter.this.context.getApplicationContext(), "four", 0).show();
                    i = new Intent(RecyclerViewBloodBankAdapter.this.context.getApplicationContext(), InternalBloodBankActivity.class);
                    i.putExtra("profile", R.drawable.kdhospital);
                    i.putExtra("name", "KD Hospital & Blood Bank");
                    i.putExtra("Phonenumber", "098766 96677");
                    i.putExtra("active", "24 hours open");
                    i.putExtra("Ratings", "4 star");
                    i.putExtra("address", "  7 Circular Road, Near Govt. medical college, Amritsar, Punjab 143001");
                    RecyclerViewBloodBankAdapter.this.context.startActivity(i);
                }
                if (value == 4) {
                    Toast.makeText(RecyclerViewBloodBankAdapter.this.context.getApplicationContext(), "five", 0).show();
                    i = new Intent(RecyclerViewBloodBankAdapter.this.context.getApplicationContext(), InternalBloodBankActivity.class);
                    i.putExtra("profile", R.drawable.adlakha);
                    i.putExtra("name", "Adlakha Blood bank");
                    i.putExtra("Phonenumber", "01832225354");
                    i.putExtra("active", "24 hours");
                    i.putExtra("Ratings", "4.6 star");
                    i.putExtra("address", "Race Course Road, Basant Avenue, Amritsar, Punjab 143001");
                    RecyclerViewBloodBankAdapter.this.context.startActivity(i);
                }
                if (value == 5) {
                    Toast.makeText(RecyclerViewBloodBankAdapter.this.context.getApplicationContext(), "six", 0).show();
                    i = new Intent(RecyclerViewBloodBankAdapter.this.context.getApplicationContext(), InternalBloodBankActivity.class);
                    i.putExtra("profile", R.drawable.beamsblood);
                    i.putExtra("name", "Beams Blood bank");
                    i.putExtra("Phonenumber", "Not available");
                    i.putExtra("active", "24 hours");
                    i.putExtra("Ratings", "4 star");
                    i.putExtra("address", " 19/1, Race Course Rd, Basant Avenue, White Avenue, Amritsar, Punjab 143001");
                    RecyclerViewBloodBankAdapter.this.context.startActivity(i);
                }
            }
        });
    }

    public int getItemCount() {
        return this.bloodbankkimages.length;
    }
}
