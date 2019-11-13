package com.example.nisha.blooddonation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FinalBloodDonation extends AppCompatActivity {
    Button button99;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_blood_donation);
        this.button99 = (Button) findViewById(R.id.buttonbacktohome);
        this.button99.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                FinalBloodDonation.this.startActivity(new Intent(FinalBloodDonation.this, Home.class));
            }
        });
    }
}
