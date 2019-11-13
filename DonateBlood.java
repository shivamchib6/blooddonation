package com.example.nisha.blooddonation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DonateBlood extends AppCompatActivity {
    Button mybutton;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_blood);
        this.mybutton = (Button) findViewById(R.id.youshouldnevergiveup);
        this.mybutton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                DonateBlood.this.startActivity(new Intent(DonateBlood.this, BloodDonationForm.class));
            }
        });
    }
}
