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

public class NeedBlood extends AppCompatActivity {
    String bloodgroup1 = "";
    String bloodtype = "";
    Button button1;
    Button button2;
    Spinner spinner1;
    Spinner spinner2;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_need_blood);
        this.button2 = (Button) findViewById(R.id.nextpagebutton);
        this.spinner2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.Bloodgroup, 17367048);
        adapter1.setDropDownViewResource(17367049);
        this.spinner2.setAdapter(adapter1);
        this.spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                NeedBlood.this.bloodtype = (String) adapterView.getItemAtPosition(i);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(NeedBlood.this, "Select some option", 0).show();
            }
        });
        this.spinner1 = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Blood, 17367048);
        adapter.setDropDownViewResource(17367049);
        this.spinner1.setAdapter(adapter);
        this.spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                NeedBlood.this.bloodgroup1 = (String) adapterView.getItemAtPosition(i);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(NeedBlood.this, "Select something", 0).show();
            }
        });
        this.button1 = (Button) findViewById(R.id.backbutton);
        this.button1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                NeedBlood.this.startActivity(new Intent(NeedBlood.this, Home.class));
            }
        });
        this.button2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(NeedBlood.this, NeedBlood2.class);
                i.putExtra("text1", NeedBlood.this.bloodtype.toString());
                i.putExtra("text2", NeedBlood.this.bloodgroup1.toString());
                NeedBlood.this.startActivity(i);
            }
        });
    }
}
