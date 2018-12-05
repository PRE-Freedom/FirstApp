package com.example.gbzhu.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mBtnTextView = findViewById(R.id.btn_textview);
        Button mBtnLogon = findViewById(R.id.btn_logon);


        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转到textview的演示界面
                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnLogon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // jump to logon page
                Intent intent = new Intent(MainActivity.this, LogonActivity.class);
                startActivity(intent);
            }
        });
    }
}
