package com.example.xulysukien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    Button bt_mauDo, bt_mauCam, bt_mauVang, bt_mauXanhlacay, bt_mauXanhnuocbien, bt_mauTim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.imgHinh);
        bt_mauCam = findViewById(R.id.buttonMauCam);
        bt_mauCam.setOnClickListener(listener);
        bt_mauVang = findViewById(R.id.buttonMauVang);
        bt_mauVang.setOnClickListener(this);
        bt_mauXanhlacay = findViewById(R.id.buttonMauXanhLaCay);
        bt_mauXanhlacay.setOnClickListener((v) ->  {
            img.setBackgroundColor(getResources().getColor(R.color.mauxanhlacay));
        });
        bt_mauXanhnuocbien = findViewById(R.id.buttonMauXanhNuocBien);
        bt_mauXanhnuocbien.setOnClickListener(this);
        bt_mauTim = findViewById(R.id.buttonMauTim);
        bt_mauTim.setOnClickListener(new chonMauTim());
    }
    public void click_chonMauDo(View view){
        img.setBackgroundColor(getResources().getColor(R.color.maudo));
    }
    public void onClick(View view){
        if(view == bt_mauVang){
            img.setBackgroundColor(getResources().getColor(R.color.mauvang));
        }
        if(view == bt_mauXanhnuocbien){
            img.setBackgroundColor(getResources().getColor(R.color.mauxanhnuocbien));
        }
    }
    View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(v==bt_mauCam){
                img.setBackgroundColor(getResources().getColor(R.color.maucam));
            }
        }
    };
    class chonMauTim implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            img.setBackgroundColor(getResources().getColor(R.color.mautim));
        }
    }
}