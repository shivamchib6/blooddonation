package com.example.nisha.blooddonation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class InternalBloodBankActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextView textView1;
    TextView textView29;
    TextView textView39;
    TextView textView4;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_blood_bank);
        this.textView = (TextView) findViewById(R.id.bloodbankbankinternaltextview);
        this.textView1 = (TextView) findViewById(R.id.phonenumber);
        this.textView29 = (TextView) findViewById(R.id.activehours);
        this.textView39 = (TextView) findViewById(R.id.Ratings);
        this.textView4 = (TextView) findViewById(R.id.addressofhostpital);
        this.imageView = (ImageView) findViewById(R.id.bloodimageviewqqq);
        setdata(getIntent().getExtras().getString("name"), getIntent().getExtras().getString("Phonenumber"), getIntent().getExtras().getString("active"), getIntent().getExtras().getString("Ratings"), getIntent().getExtras().getString("address"), getIntent().getExtras().getInt("profile"));
    }

    public void setdata(String s1, String s2, String s3, String s4, String s5, int id) {
        TextView textView = this.textView;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name : ");
        stringBuilder.append(s1);
        textView.setText(stringBuilder.toString());
        textView = this.textView1;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Phone number : ");
        stringBuilder.append(s2);
        textView.setText(stringBuilder.toString());
        textView = this.textView29;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Active hours : ");
        stringBuilder.append(s3);
        textView.setText(stringBuilder.toString());
        textView = this.textView39;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Ratings :");
        stringBuilder.append(s4);
        textView.setText(stringBuilder.toString());
        textView = this.textView4;
        stringBuilder = new StringBuilder();
        stringBuilder.append("Address : ");
        stringBuilder.append(s5);
        textView.setText(stringBuilder.toString());
        this.imageView.setImageResource(id);
    }
}
