package com.example.lessonfour_one;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
    }

    void initViews(){
        TextView textView=findViewById(R.id.text_view_two);
        String name=getIntent().getStringExtra("name");
        textView.setText(name);
    }
}