package com.example.nisha.blooddonation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import de.hdodenhof.circleimageview.CircleImageView;

public class HelpAndDonateActivity extends AppCompatActivity {
    CircleImageView circleImageView;
    CircleImageView circleImageView1;
    CircleImageView circleImageView2;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_and_donate);
        this.circleImageView = (CircleImageView) findViewById(R.id.imageviewshivam);
        this.circleImageView1 = (CircleImageView) findViewById(R.id.imageviewshatrudhan);
        this.circleImageView2 = (CircleImageView) findViewById(R.id.imageviewrobin);
        this.circleImageView.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                HelpAndDonateActivity.this.startActivity(HelpAndDonateActivity.this.oprnfacebook(HelpAndDonateActivity.this, "https://www.facebook.com/shivam.thakur.50702"));
            }
        });
        this.circleImageView1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                HelpAndDonateActivity.this.startActivity(HelpAndDonateActivity.this.oprnfacebook(HelpAndDonateActivity.this, "https://www.facebook.com/robinjassi.gill143"));
            }
        });
        this.circleImageView2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                HelpAndDonateActivity.this.startActivity(HelpAndDonateActivity.this.oprnfacebook(HelpAndDonateActivity.this, "https://www.facebook.com/profile.php?id=100005080246569"));
            }
        });
    }

    public Intent oprnfacebook(Context context, String name) {
        try {
            context.getPackageManager().getPackageInfo(BuildConfig.APPLICATION_ID, 0);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(name);
            stringBuilder.append("");
            return new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/shivam.thakur.50702"));
        }
    }
}
