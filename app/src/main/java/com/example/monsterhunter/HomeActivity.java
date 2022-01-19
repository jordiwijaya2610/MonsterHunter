package com.example.monsterhunter;

import androidx.appcompat.app.AppCompatActivity;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.HwAds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.huawei.hms.ads.banner.BannerView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);





        mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = mAuth.getCurrentUser();
        String email = user.getEmail();
        TextView homeText = findViewById(R.id.hometext);
        homeText.setText("Welcome, "+email);
        Button exploreButton = findViewById(R.id.exploreButton);
        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, MonsterHunter.class));
                finish();
            }
        });
        Button adsbutton = findViewById(R.id.adsButton);
        adsbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.adsButton:
                Intent ads = new Intent(this, BannerActivity.class);
                startActivity(ads);
                break;
            default:
                break;
        }

    }
}