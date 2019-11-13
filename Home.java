package com.example.nisha.blooddonation;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class Home extends AppCompatActivity {
    ActionBarDrawerToggle actionBarDrawerToggle;
    BottomNavigationView bottomNavigationView;
    DrawerLayout drawerLayout;
    HomeFragment homeFragment = new HomeFragment();
    NavigationView navigationView;
    NotificationFragment notificationFragment = new NotificationFragment();
    Profile profileq = new Profile();

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        this.navigationView = (NavigationView) findViewById(R.id.navigationview);
        this.drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        this.actionBarDrawerToggle = new ActionBarDrawerToggle(this, this.drawerLayout, R.string.open, R.string.close);
        this.drawerLayout.addDrawerListener(this.actionBarDrawerToggle);
        this.actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.navigationView.setNavigationItemSelectedListener(new OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@android.support.annotation.NonNull android.view.MenuItem r7) {
                /*
                r6 = this;
                r0 = r7.getTitle();
                r0 = r0.toString();
                r1 = r0.hashCode();
                r2 = 1;
                r3 = 0;
                switch(r1) {
                    case -2013462102: goto L_0x004e;
                    case -1486031536: goto L_0x0044;
                    case -1020274158: goto L_0x003a;
                    case -845806096: goto L_0x0030;
                    case 420345376: goto L_0x0026;
                    case 1923287358: goto L_0x001c;
                    case 2052667023: goto L_0x0012;
                    default: goto L_0x0011;
                };
            L_0x0011:
                goto L_0x0058;
            L_0x0012:
                r1 = "Donate";
                r0 = r0.equals(r1);
                if (r0 == 0) goto L_0x0058;
            L_0x001a:
                r0 = 3;
                goto L_0x0059;
            L_0x001c:
                r1 = "Developrs";
                r0 = r0.equals(r1);
                if (r0 == 0) goto L_0x0058;
            L_0x0024:
                r0 = 4;
                goto L_0x0059;
            L_0x0026:
                r1 = "Share App";
                r0 = r0.equals(r1);
                if (r0 == 0) goto L_0x0058;
            L_0x002e:
                r0 = 2;
                goto L_0x0059;
            L_0x0030:
                r1 = "Need Blood";
                r0 = r0.equals(r1);
                if (r0 == 0) goto L_0x0058;
            L_0x0038:
                r0 = r3;
                goto L_0x0059;
            L_0x003a:
                r1 = "Cyber Project";
                r0 = r0.equals(r1);
                if (r0 == 0) goto L_0x0058;
            L_0x0042:
                r0 = 5;
                goto L_0x0059;
            L_0x0044:
                r1 = "Compatibility";
                r0 = r0.equals(r1);
                if (r0 == 0) goto L_0x0058;
            L_0x004c:
                r0 = r2;
                goto L_0x0059;
            L_0x004e:
                r1 = "Logout";
                r0 = r0.equals(r1);
                if (r0 == 0) goto L_0x0058;
            L_0x0056:
                r0 = 6;
                goto L_0x0059;
            L_0x0058:
                r0 = -1;
            L_0x0059:
                switch(r0) {
                    case 0: goto L_0x013b;
                    case 1: goto L_0x011c;
                    case 2: goto L_0x00de;
                    case 3: goto L_0x00be;
                    case 4: goto L_0x009e;
                    case 5: goto L_0x007e;
                    case 6: goto L_0x005e;
                    default: goto L_0x005c;
                };
            L_0x005c:
                goto L_0x015f;
            L_0x005e:
                r0 = com.example.nisha.blooddonation.Home.this;
                r1 = "5 is clicked";
                r0 = android.widget.Toast.makeText(r0, r1, r3);
                r0.show();
                r0 = new android.content.Intent;
                r1 = com.example.nisha.blooddonation.Home.this;
                r3 = com.example.nisha.blooddonation.CyberProject.class;
                r0.<init>(r1, r3);
                r1 = com.example.nisha.blooddonation.Home.this;
                r1.startActivity(r0);
                r1 = com.example.nisha.blooddonation.Home.this;
                r1.onBackPressed();
                goto L_0x015f;
            L_0x007e:
                r0 = com.example.nisha.blooddonation.Home.this;
                r1 = "5 is clicked";
                r0 = android.widget.Toast.makeText(r0, r1, r3);
                r0.show();
                r0 = new android.content.Intent;
                r1 = com.example.nisha.blooddonation.Home.this;
                r3 = com.example.nisha.blooddonation.CyberProject.class;
                r0.<init>(r1, r3);
                r1 = com.example.nisha.blooddonation.Home.this;
                r1.startActivity(r0);
                r1 = com.example.nisha.blooddonation.Home.this;
                r1.onBackPressed();
                goto L_0x015f;
            L_0x009e:
                r0 = com.example.nisha.blooddonation.Home.this;
                r1 = "5 is clicked";
                r0 = android.widget.Toast.makeText(r0, r1, r3);
                r0.show();
                r0 = new android.content.Intent;
                r1 = com.example.nisha.blooddonation.Home.this;
                r3 = com.example.nisha.blooddonation.HelpAndDonateActivity.class;
                r0.<init>(r1, r3);
                r1 = com.example.nisha.blooddonation.Home.this;
                r1.startActivity(r0);
                r1 = com.example.nisha.blooddonation.Home.this;
                r1.onBackPressed();
                goto L_0x015f;
            L_0x00be:
                r0 = com.example.nisha.blooddonation.Home.this;
                r1 = "4 is clicked";
                r0 = android.widget.Toast.makeText(r0, r1, r3);
                r0.show();
                r0 = new android.content.Intent;
                r1 = com.example.nisha.blooddonation.Home.this;
                r3 = com.example.nisha.blooddonation.HelpAndDonateActivity.class;
                r0.<init>(r1, r3);
                r1 = com.example.nisha.blooddonation.Home.this;
                r1.startActivity(r0);
                r1 = com.example.nisha.blooddonation.Home.this;
                r1.onBackPressed();
                goto L_0x015f;
            L_0x00de:
                r0 = com.example.nisha.blooddonation.Home.this;
                r1 = "3 is clicked";
                r0 = android.widget.Toast.makeText(r0, r1, r3);
                r0.show();
                r0 = com.example.nisha.blooddonation.Home.this;
                r0 = r0.getApplicationInfo();
                r1 = r0.sourceDir;
                r3 = new android.content.Intent;
                r4 = "android.intent.action.SEND";
                r3.<init>(r4);
                r4 = "application/vnd.android.package-archive";
                r3.setType(r4);
                r4 = "android.intent.extra.STREAM";
                r5 = new java.io.File;
                r5.<init>(r1);
                r5 = android.net.Uri.fromFile(r5);
                r3.putExtra(r4, r5);
                r4 = com.example.nisha.blooddonation.Home.this;
                r5 = "Share app now";
                r5 = android.content.Intent.createChooser(r3, r5);
                r4.startActivity(r5);
                r4 = com.example.nisha.blooddonation.Home.this;
                r4.onBackPressed();
                goto L_0x015f;
            L_0x011c:
                r0 = com.example.nisha.blooddonation.Home.this;
                r1 = "2 is clicked";
                r0 = android.widget.Toast.makeText(r0, r1, r3);
                r0.show();
                r0 = new android.content.Intent;
                r1 = com.example.nisha.blooddonation.Home.this;
                r3 = com.example.nisha.blooddonation.Compatibilty.class;
                r0.<init>(r1, r3);
                r1 = com.example.nisha.blooddonation.Home.this;
                r1.startActivity(r0);
                r1 = com.example.nisha.blooddonation.Home.this;
                r1.onBackPressed();
                goto L_0x015f;
            L_0x013b:
                r0 = com.example.nisha.blooddonation.Home.this;
                r1 = "Loaded";
                r0 = android.widget.Toast.makeText(r0, r1, r3);
                r0.show();
                r0 = new android.content.Intent;
                r1 = com.example.nisha.blooddonation.Home.this;
                r3 = com.example.nisha.blooddonation.NeedBlood.class;
                r0.<init>(r1, r3);
                r1 = com.example.nisha.blooddonation.Home.this;
                r1.startActivity(r0);
                r1 = com.example.nisha.blooddonation.Home.this;
                r1 = r1.drawerLayout;
                r3 = 8388611; // 0x800003 float:1.1754948E-38 double:4.1445245E-317;
                r1.closeDrawer(r3);
            L_0x015f:
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.example.nisha.blooddonation.Home$AnonymousClass1.onNavigationItemSelected(android.view.MenuItem):boolean");
            }
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.framecontainer, new HomeFragment()).commit();
        this.bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottombardown);
        this.bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
            public boolean onNavigationItemSelected(@android.support.annotation.NonNull android.view.MenuItem r6) {
                /*
                r5 = this;
                r0 = 0;
                r1 = r6.getTitle();
                r1 = r1.toString();
                r2 = r1.hashCode();
                r3 = -1382453013; // 0xffffffffad9970eb float:-1.7444232E-11 double:NaN;
                r4 = 1;
                if (r2 == r3) goto L_0x0032;
            L_0x0013:
                r3 = 2223327; // 0x21ecdf float:3.115545E-39 double:1.0984695E-317;
                if (r2 == r3) goto L_0x0028;
            L_0x0018:
                r3 = 408556937; // 0x185a1589 float:2.8186712E-24 double:2.01853947E-315;
                if (r2 == r3) goto L_0x001e;
            L_0x001d:
                goto L_0x003c;
            L_0x001e:
                r2 = "PROFILE";
                r1 = r1.equals(r2);
                if (r1 == 0) goto L_0x003c;
            L_0x0026:
                r1 = 2;
                goto L_0x003d;
            L_0x0028:
                r2 = "HOME";
                r1 = r1.equals(r2);
                if (r1 == 0) goto L_0x003c;
            L_0x0030:
                r1 = 0;
                goto L_0x003d;
            L_0x0032:
                r2 = "NOTIFICATION";
                r1 = r1.equals(r2);
                if (r1 == 0) goto L_0x003c;
            L_0x003a:
                r1 = r4;
                goto L_0x003d;
            L_0x003c:
                r1 = -1;
            L_0x003d:
                switch(r1) {
                    case 0: goto L_0x004f;
                    case 1: goto L_0x0048;
                    case 2: goto L_0x0041;
                    default: goto L_0x0040;
                };
            L_0x0040:
                goto L_0x0056;
            L_0x0041:
                r1 = new com.example.nisha.blooddonation.Profile;
                r1.<init>();
                r0 = r1;
                goto L_0x0056;
            L_0x0048:
                r1 = new com.example.nisha.blooddonation.NotificationFragment;
                r1.<init>();
                r0 = r1;
                goto L_0x0056;
            L_0x004f:
                r1 = new com.example.nisha.blooddonation.HomeFragment;
                r1.<init>();
                r0 = r1;
            L_0x0056:
                r1 = com.example.nisha.blooddonation.Home.this;
                r1 = r1.getSupportFragmentManager();
                r1 = r1.beginTransaction();
                r2 = 2131296420; // 0x7f0900a4 float:1.8210756E38 double:1.053000342E-314;
                r1 = r1.replace(r2, r0);
                r1.commit();
                return r4;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.example.nisha.blooddonation.Home$AnonymousClass2.onNavigationItemSelected(android.view.MenuItem):boolean");
            }
        });
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fm = getSupportFragmentManager().beginTransaction();
        fm.replace(R.id.framecontainer, fragment);
        fm.commit();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (this.actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        if (this.drawerLayout.isDrawerOpen(8388611)) {
            this.drawerLayout.closeDrawer(8388611);
        } else {
            super.onBackPressed();
        }
    }
}
