package com.example.nisha.blooddonation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int Splashtimeout = 4000;
    ImageButton clickme;
    ProgressBar progressBar;
    TextView textView;
    TextView textView1;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.clickme = (ImageButton) findViewById(R.id.imageblood);
        this.textView = (TextView) findViewById(R.id.clicktextview);
        this.textView1 = (TextView) findViewById(R.id.hiddentextview);
        this.progressBar = (ProgressBar) findViewById(R.id.progressbar);
        this.progressBar.setVisibility(4);
        this.clickme.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        MainActivity.this.startActivity(new Intent(MainActivity.this, HomeActivity.class));
                        MainActivity.this.finish();
                    }
                }, (long) MainActivity.Splashtimeout);
                MainActivity.this.animation();
            }
        });
    }

    private void animation() {
        this.textView.setVisibility(4);
        this.progressBar.setVisibility(0);
        this.textView1.animate().translationYBy(-350.0f).setDuration(3000);
    }
}
