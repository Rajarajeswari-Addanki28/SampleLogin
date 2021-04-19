package com.example.samplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
   TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String s=getIntent().getStringExtra("k");
        tv=findViewById(R.id.tv1);
        tv.setText(s+"   welcome");
    }
}
