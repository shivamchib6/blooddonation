package com.example.nisha.blooddonation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class BloodDonationForm extends AppCompatActivity {
    Spinner bloodgroupspinner;
    Spinner cityspinner;
    EditText gmailaccount;
    String message = " Thank you for sending the request message. Your Appointment has been confirmed.Visit city blood bank for more details. ";
    EditText mobilenumber;
    EditText nameofdonor;
    String phonenumber1;
    String ss;
    Button submitbuttonappiontment;
    EditText yearorbirth;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_donation_form);
        this.nameofdonor = (EditText) findViewById(R.id.nameedittext);
        this.mobilenumber = (EditText) findViewById(R.id.mobileedittext1);
        this.yearorbirth = (EditText) findViewById(R.id.yearedittext);
        this.gmailaccount = (EditText) findViewById(R.id.emailedittextemail);
        this.submitbuttonappiontment = (Button) findViewById(R.id.submitbutton);
        this.submitbuttonappiontment.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                String name = BloodDonationForm.this.nameofdonor.getText().toString();
                String yearofbirth11 = BloodDonationForm.this.yearorbirth.getText().toString();
                String gmailaccount1 = BloodDonationForm.this.gmailaccount.getText().toString();
                BloodDonationForm.this.ss = BloodDonationForm.this.mobilenumber.getText().toString();
                if (name == "" || yearofbirth11 == "" || gmailaccount1 == "" || BloodDonationForm.this.ss == "") {
                    Toast.makeText(BloodDonationForm.this, "Fill form properly", 0).show();
                    return;
                }
                SmsManager.getDefault().sendTextMessage(BloodDonationForm.this.ss, null, BloodDonationForm.this.message, null, null);
                BloodDonationForm.this.startActivity(new Intent(BloodDonationForm.this, FinalBloodDonation.class));
            }
        });
        this.bloodgroupspinner = (Spinner) findViewById(R.id.Bloodgroupspinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.Bloodgroup, 17367048);
        adapter1.setDropDownViewResource(17367049);
        this.bloodgroupspinner.setAdapter(adapter1);
        this.bloodgroupspinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String bloodtype = (String) adapterView.getItemAtPosition(i);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(BloodDonationForm.this, "Select some option", 0).show();
            }
        });
        this.cityspinner = (Spinner) findViewById(R.id.cityspinner);
        ArrayAdapter<CharSequence> adapter11 = ArrayAdapter.createFromResource(this, R.array.city, 17367048);
        adapter11.setDropDownViewResource(17367049);
        this.cityspinner.setAdapter(adapter11);
        this.cityspinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String bloodtype = (String) adapterView.getItemAtPosition(i);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(BloodDonationForm.this, "Select some option", 0).show();
            }
        });
    }
}
