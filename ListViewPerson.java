package com.example.nisha.blooddonation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewPerson extends AppCompatActivity {
    Integer[] imgid = new Integer[]{Integer.valueOf(R.drawable.ic_action_person), Integer.valueOf(R.drawable.ic_action_person), Integer.valueOf(R.drawable.ic_action_person), Integer.valueOf(R.drawable.ic_action_person), Integer.valueOf(R.drawable.ic_action_person), Integer.valueOf(R.drawable.ic_action_person), Integer.valueOf(R.drawable.ic_action_person), Integer.valueOf(R.drawable.ic_action_person), Integer.valueOf(R.drawable.ic_action_person), Integer.valueOf(R.drawable.ic_action_person)};
    ListView list;
    String[] maintitle = new String[]{"Deepak sharma", "Navneet Singh", "Sahil sharma", "Daljeet singh", "Reminder Singh", "Satnam Singh", "Suknchain Singh", "Kamal kundra", "prabhjot Singh", "Ashish"};
    String[] subtitle = new String[]{"9888862620", "8968861437", "7508252272", "9501104353", "8968866579", "8427666398", "9814327892", "8591927171", "7986099829", "9356024455"};

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_person);
        MyListAdapter adapter = new MyListAdapter(this, this.maintitle, this.subtitle, this.imgid);
        this.list = (ListView) findViewById(R.id.list);
        this.list.setAdapter(adapter);
        this.list.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(ListViewPerson.this.getApplicationContext(), "Place Your First Option Code", 0).show();
                } else if (position == 1) {
                    Toast.makeText(ListViewPerson.this.getApplicationContext(), "Place Your Second Option Code", 0).show();
                } else if (position == 2) {
                    Toast.makeText(ListViewPerson.this.getApplicationContext(), "Place Your Third Option Code", 0).show();
                } else if (position == 3) {
                    Toast.makeText(ListViewPerson.this.getApplicationContext(), "Place Your Forth Option Code", 0).show();
                } else if (position == 4) {
                    Toast.makeText(ListViewPerson.this.getApplicationContext(), "Place Your Fifth Option Code", 0).show();
                } else if (position == 5) {
                    Toast.makeText(ListViewPerson.this.getApplicationContext(), "Place Your Fifth Option Code", 0).show();
                } else if (position == 6) {
                    Toast.makeText(ListViewPerson.this.getApplicationContext(), "Place Your Fifth Option Code", 0).show();
                } else if (position == 7) {
                    Toast.makeText(ListViewPerson.this.getApplicationContext(), "Place Your Fifth Option Code", 0).show();
                } else if (position == 8) {
                    Toast.makeText(ListViewPerson.this.getApplicationContext(), "Place Your Fifth Option Code", 0).show();
                } else if (position == 9) {
                    Toast.makeText(ListViewPerson.this.getApplicationContext(), "Place Your Fifth Option Code", 0).show();
                }
            }
        });
    }
}
