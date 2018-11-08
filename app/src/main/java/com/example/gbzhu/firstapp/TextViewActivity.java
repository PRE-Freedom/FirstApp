package com.example.gbzhu.firstapp;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mTv3;
    private Drawable drawable;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        drawable = getDrawable(R.drawable.icons8_checked_checkbox);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());

        mTv3 = findViewById(R.id.tv_3);
        mTv3.setCompoundDrawables(drawable, null, null, null);
    }
}
