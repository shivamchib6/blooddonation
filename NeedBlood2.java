package com.example.nisha.blooddonation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class NeedBlood2 extends AppCompatActivity {
    Button button1;
    String city;
    String reasonforblood;
    Spinner spinner1;
    Spinner spinnercity2;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_need_blood2);
        final String usergroup = getIntent().getExtras().getString("text1");
        final String username = getIntent().getExtras().getString("text2");
        this.button1 = (Button) findViewById(R.id.nextpagebutton);
        this.spinnercity2 = (Spinner) findViewById(R.id.spinnercity);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.city, 17367048);
        adapter1.setDropDownViewResource(17367049);
        this.spinnercity2.setAdapter(adapter1);
        this.spinnercity2.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                NeedBlood2.this.city = (String) adapterView.getItemAtPosition(i);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(NeedBlood2.this, "Select something", 0).show();
            }
        });
        this.spinner1 = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.reasonforblood, 17367048);
        adapter.setDropDownViewResource(17367049);
        this.spinner1.setAdapter(adapter);
        this.spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                NeedBlood2.this.reasonforblood = (String) adapterView.getItemAtPosition(i);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(NeedBlood2.this, "Select something", 0).show();
            }
        });
        this.button1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(NeedBlood2.this, ListViewPerson.class);
                i.putExtra("text1", usergroup);
                i.putExtra("text2", username);
                i.putExtra("text3", NeedBlood2.this.reasonforblood);
                i.putExtra("text4", NeedBlood2.this.city);
                NeedBlood2.this.startActivity(i);
            }
        });
    }
}
