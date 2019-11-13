# blooddonation
Helps in sending and receiving blood
HomeActivity.java
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeActivity extends AppCompatActivity {
    Button enterinside1;
    FirebaseAuth mAuth;
    EditText password1;
    String password2;
    TextView textView;
    TextView textView1;
    EditText user1;
    String usernam;

    
    public void onCreate(Bundle savedInstanceState) {
        notificationcreator();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.mAuth = FirebaseAuth.getInstance();
        this.enterinside1 = (Button) findViewById(R.id.buttonenter);
        this.user1 = (EditText) findViewById(R.id.editTextemail);
        this.password1 = (EditText) findViewById(R.id.editTextpassword);
        this.textView1 = (TextView) findViewById(R.id.textView2);
        String mystring1 = new String("Not a memeber? Join Now");
        SpannableString content = new SpannableString(mystring1);
        content.setSpan(new UnderlineSpan(), 0, mystring1.length(), 0);
        this.textView1.setText(content);
        this.textView1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                HomeActivity.this.startActivityForResult(new Intent(HomeActivity.this, RegisterUser.class), 1);
            }
        });
        this.textView = (TextView) findViewById(R.id.textView3);
        String mystring = new String("Skip");
        SpannableString content1 = new SpannableString(mystring);
        content1.setSpan(new UnderlineSpan(), 0, mystring.length(), 0);
        this.textView.setText(content1);
    }

    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = this.mAuth.getCurrentUser();
        startActivity(new Intent(this, Home.class));
    }

    private void enterInside() {
        this.usernam = this.user1.getText().toString().trim();
        this.password2 = this.password1.getText().toString().trim();
        this.mAuth.signInWithEmailAndPassword(this.usernam, this.password2).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(HomeActivity.this, "Welcome.", 0).show();
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this, Home.class));
                    return;
                }
                Toast.makeText(HomeActivity.this, "Authentication failed.", 0).show();
            }
        });
    }

    public void notificationcreator() {
        ((NotificationManager) getSystemService("notification")).notify(1, new Builder(this).setDefaults(-1).setSmallIcon(R.drawable.ic_action_hospital).setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_action_hospital)).setContentTitle("Notifiction of installation").setContentText("Thanx for installing the app").build());
    }

    
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == -1) {
            CharSequence abc = data.getStringExtra("email");
            String def = data.getStringExtra("password");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(abc);
            stringBuilder.append("");
            stringBuilder.append(def);
            Toast.makeText(this, stringBuilder.toString(), 0).show();
        }
    }

    public void clickmenow(View view) {
        enterInside();
    }
}



