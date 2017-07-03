package com.atvfool.axisandallies;


import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {


    // Controls
    private Button m_btn1914;

    private AdView m_ad;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_btn1914 = (Button) findViewById(R.id.btn1914);
        m_ad = (AdView) findViewById(R.id.adView);

        m_btn1914.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ana1914.class);

                startActivity(intent);
            }
        });

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-3940256099942544~3347511713");
        m_ad.setAdSize(AdSize.BANNER);
        m_ad.setAdUnitId("ca-app-pub-3940256099942544~3347511713");

        AdRequest adRequestBuilder = new AdRequest.Builder().build();

        m_ad.loadAd(adRequestBuilder);

    }



}
