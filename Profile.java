package com.example.nisha.blooddonation;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends Fragment {
    int REQUEST_CODE = 1;
    int btntype = 0;
    Button buttoneditpic;
    EditText editText;
    EditText editText222;
    Button editprofile;
    ImageView imageView;
    TextView textView;
    TextView textView222;

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.profile, container, false);
        this.editText222 = (EditText) v.findViewById(R.id.editTextBloodgroupsave);
        this.textView222 = (TextView) v.findViewById(R.id.textViewbloodgroup);
        this.editText = (EditText) v.findViewById(R.id.editTextnamee);
        this.textView = (TextView) v.findViewById(R.id.textViewnameee);
        this.editprofile = (Button) v.findViewById(R.id.buttoneditprofile);
        this.editprofile.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (Profile.this.btntype == 0) {
                    Profile.this.textView.setVisibility(4);
                    Profile.this.textView222.setVisibility(4);
                    Profile.this.editText.setVisibility(0);
                    Profile.this.editText222.setVisibility(0);
                    Profile.this.btntype = 1;
                    Profile.this.editprofile.setText("Save");
                    return;
                }
                String ss = Profile.this.editText.getText().toString().trim();
                String sss1 = Profile.this.editText222.getText().toString().trim();
                Profile.this.textView.setVisibility(0);
                Profile.this.textView222.setVisibility(0);
                Profile.this.editText.setVisibility(4);
                Profile.this.editText222.setVisibility(4);
                Profile.this.btntype = 0;
                TextView textView = Profile.this.textView;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Name :");
                stringBuilder.append(ss);
                textView.setText(stringBuilder.toString());
                textView = Profile.this.textView222;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Blood group : ");
                stringBuilder.append(sss1);
                textView.setText(stringBuilder.toString());
                Profile.this.editprofile.setText("Edit");
            }
        });
        this.imageView = (ImageView) v.findViewById(R.id.profileimageview);
        this.buttoneditpic = (Button) v.findViewById(R.id.editprofilepicture);
        this.buttoneditpic.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                Profile.this.startActivityForResult(Intent.createChooser(intent, "Select Picture"), Profile.this.REQUEST_CODE);
            }
        });
        return v;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == this.REQUEST_CODE && resultCode == -1 && data != null && data.getData() != null) {
            try {
                this.imageView.setImageBitmap(Media.getBitmap(getContext().getContentResolver(), data.getData()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
