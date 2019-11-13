package com.example.nisha.blooddonation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Editing extends AppCompatActivity {
    int REQ_CODE = 2;
    Button buttonsave;
    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editing);
        this.ed1 = (EditText) findViewById(R.id.editTextname);
        this.ed2 = (EditText) findViewById(R.id.editTextage);
        this.ed3 = (EditText) findViewById(R.id.editTextdescription);
        this.ed4 = (EditText) findViewById(R.id.editTextbloodgroup);
        this.buttonsave = (Button) findViewById(R.id.buttonsavechanges);
        this.buttonsave.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                String name = Editing.this.ed1.getText().toString().trim();
                String age = Editing.this.ed2.getText().toString().trim();
                String description = Editing.this.ed3.getText().toString().trim();
                String bloodgroup = Editing.this.ed4.getText().toString().trim();
                Bundle bundle = new Bundle();
                bundle.putString("params", "My String data");
                new Profile().setArguments(bundle);
            }
        });
    }
}
