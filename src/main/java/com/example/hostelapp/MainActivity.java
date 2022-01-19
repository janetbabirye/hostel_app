package com.example.hostelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.admin);
        btn2 = (Button) findViewById(R.id.student);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { loadFragment(new admin()); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { loadFragment(new student()); }
        });
    }

    private void loadFragment(Fragment fragment){
        // create a FragmentManager to interact with all fragments
        FragmentManager fm = getFragmentManager();
        //create FragmentTransaction to begin the transaction
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
}}
