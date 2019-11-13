package com.example.nisha.blooddonation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterUser extends AppCompatActivity {
    Button button1;
    EditText confirmpassword;
    String confirmpassword1;
    EditText email;
    String email1;
    private FirebaseAuth mAuth;
    EditText password;
    String password1;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        this.mAuth = FirebaseAuth.getInstance();
        this.email = (EditText) findViewById(R.id.emaileditText);
        this.password = (EditText) findViewById(R.id.passwordeditText2);
        this.confirmpassword = (EditText) findViewById(R.id.confirmpasswordeditText3);
        this.button1 = (Button) findViewById(R.id.buttonsubmit);
        this.button1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                RegisterUser.this.email1 = RegisterUser.this.email.getText().toString();
                RegisterUser.this.password1 = RegisterUser.this.password.getText().toString();
                RegisterUser.this.confirmpassword1 = RegisterUser.this.confirmpassword.getText().toString();
                if (RegisterUser.this.password1.equals(RegisterUser.this.confirmpassword1)) {
                    RegisterUser.this.newUsers();
                } else {
                    Toast.makeText(RegisterUser.this, "Both passswords dont match", 0).show();
                }
            }
        });
    }

    private void newUsers() {
        this.mAuth.createUserWithEmailAndPassword(this.email1, this.password1).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    FirebaseUser user = RegisterUser.this.mAuth.getCurrentUser();
                    Toast.makeText(RegisterUser.this, "Authentication Completed.", 0).show();
                    Intent i = new Intent(RegisterUser.this, HomeActivity.class);
                    i.putExtra("email", RegisterUser.this.email1);
                    i.putExtra("password", RegisterUser.this.password1);
                    RegisterUser.this.setResult(-1, i);
                    RegisterUser.this.finish();
                    return;
                }
                Toast.makeText(RegisterUser.this, "Authentication failed.", 0).show();
            }
        });
    }
}
