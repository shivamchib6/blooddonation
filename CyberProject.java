package com.example.nisha.blooddonation;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;

public class CyberProject extends AppCompatActivity {
    static final int PERMISSION_READ_STATE = 123;
    String Location1;
    FusedLocationProviderClient client;
    String info1;
    String info2;
    Double latitude;
    Double longitudde;
    String phonetypetype = "";
    String resultCity;
    String resultCountry;
    TextView textViewcyber;
    TextView textViewcyber2;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cyber_project);
        this.textViewcyber = (TextView) findViewById(R.id.cybertextview);
        this.textViewcyber2 = (TextView) findViewById(R.id.cybertextview2);
        startthis();
        this.client = LocationServices.getFusedLocationProviderClient(this);
        if ((ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) && ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            this.client.getLastLocation().addOnSuccessListener(this, new OnSuccessListener<Location>() {
                public void onSuccess(Location location) {
                    CyberProject.this.latitude = Double.valueOf(location.getLatitude());
                    CyberProject.this.longitudde = Double.valueOf(location.getLongitude());
                    CyberProject.this.geoLocation(location);
                }
            });
        }
    }

    public void geoLocation(Location location) {
        List<Address> adddress = null;
        try {
            adddress = new Geocoder(this).getFromLocation(this.latitude.doubleValue(), this.longitudde.doubleValue(), 1);
            this.resultCountry = ((Address) adddress.get(0)).getCountryName();
            this.resultCity = ((Address) adddress.get(0)).getLocality();
            double resultlatitude = ((Address) adddress.get(0)).getLatitude();
            double resultlongitude = ((Address) adddress.get(0)).getLongitude();
            TextView textView = this.textViewcyber2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Country :---- ");
            stringBuilder.append(this.resultCountry);
            stringBuilder.append(" , City :---- ");
            stringBuilder.append(this.resultCity);
            stringBuilder.append("\nLatitude :----");
            stringBuilder.append(resultlatitude);
            stringBuilder.append("Longitude :----");
            stringBuilder.append(resultlongitude);
            textView.setText(stringBuilder.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void startthis() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") == 0) {
            MytelephonyManager();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_PHONE_STATE"}, PERMISSION_READ_STATE);
        }
    }

    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_READ_STATE) {
            if (grantResults.length < 0 || grantResults[0] != 0) {
                Toast.makeText(this, "Give permission from settings now", 0).show();
            } else {
                MytelephonyManager();
            }
        }
    }

    private void MytelephonyManager() {
        TelephonyManager manager = (TelephonyManager) getSystemService("phone");
        switch (manager.getPhoneType()) {
            case 0:
                this.phonetypetype = "NONE";
                break;
            case 1:
                this.phonetypetype = "GSM";
                break;
            case 2:
                this.phonetypetype = "CDMA";
                break;
        }
        boolean isroaming = manager.isNetworkRoaming();
        String phonetype1 = this.phonetypetype;
        if (ActivityCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") == 0) {
            String IMEnumber = manager.getDeviceId();
            String SubscriberId = manager.getDeviceId();
            String SIMSerialNumber = manager.getSimSerialNumber();
            String Networkcountry = manager.getNetworkCountryIso();
            String SimCountryiso = manager.getSimCountryIso();
            String Voicemailnumber = manager.getVoiceMailNumber();
            String softwareversion = manager.getDeviceSoftwareVersion();
            this.info1 = "Phone details : \n";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.info1);
            stringBuilder.append("\n Phone network type : ");
            stringBuilder.append(phonetype1);
            this.info1 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.info1);
            stringBuilder.append("\n IME Number : ");
            stringBuilder.append(IMEnumber);
            this.info1 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.info1);
            stringBuilder.append("\n SubscriberId : ");
            stringBuilder.append(SubscriberId);
            this.info1 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.info1);
            stringBuilder.append("\n SIMSerialNumber :");
            stringBuilder.append(SIMSerialNumber);
            this.info1 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.info1);
            stringBuilder.append("\n Network Country : ");
            stringBuilder.append(Networkcountry);
            this.info1 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.info1);
            stringBuilder.append("\n SimCountryIso : ");
            stringBuilder.append(SimCountryiso);
            this.info1 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.info1);
            stringBuilder.append("\n Voicemail number : ");
            stringBuilder.append(Voicemailnumber);
            this.info1 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.info1);
            stringBuilder.append("\n Software version : ");
            stringBuilder.append(softwareversion);
            this.info1 = stringBuilder.toString();
            Log.i("CYBER", this.info1);
            this.textViewcyber.setText(this.info1);
        }
    }
}
