package com.example.module4intentex1java;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    void initView() {
        TextView tv_second = (TextView) findViewById(R.id.tv_second);
        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        tv_second.setText(name + " " +  surname);
    }
}
