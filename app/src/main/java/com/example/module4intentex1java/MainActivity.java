package com.example.module4intentex1java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    void initView() {
        Button b_open_second = (Button) findViewById(R.id.b_open_second);
        b_open_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });
    }

    void openSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", "JAKHONGIR");
        intent.putExtra("surname", "GAFFAROV");
        startActivity(intent);
    }
}