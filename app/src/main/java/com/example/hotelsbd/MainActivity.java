package com.example.hotelsbd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_main);
    }


    public void dhaka(View view) {
        dhaka dh=new dhaka();
        FragmentManager frg= getSupportFragmentManager();
        FragmentTransaction ft=frg.beginTransaction();
        ft.replace(R.id.frlay,dh);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void Barishal(View view) {
        barishal br=new barishal();
        FragmentManager frg= getSupportFragmentManager();
        FragmentTransaction ft=frg.beginTransaction();
        ft.replace(R.id.frlay,br);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void khulna(View view) {
        khulna khu=new khulna();
        FragmentManager frg= getSupportFragmentManager();
        FragmentTransaction ft=frg.beginTransaction();
        ft.replace(R.id.frlay,khu);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void chittagonh(View view) {
        chittagong ch=new chittagong();
        FragmentManager frg= getSupportFragmentManager();
        FragmentTransaction ft=frg.beginTransaction();
        ft.replace(R.id.frlay,ch);
        ft.addToBackStack(null);
        ft.commit();
    }



    public void slyhet(View view) {
        slyhet sy=new slyhet();
        FragmentManager frg= getSupportFragmentManager();
        FragmentTransaction ft=frg.beginTransaction();
        ft.replace(R.id.frlay,sy);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void about(View view) {
        Intent about=new Intent(MainActivity.this, about.class);
        startActivity(about);
    }
}