package com.example.samplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import  android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     EditText et1,et2;
     Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       et1=findViewById(R.id.et1);
       et2=findViewById(R.id.et2);
       b=findViewById(R.id.bt);
    }

    public void reg(View view) {
        Intent i = new Intent(this,Main2Activity.class);
        String n=et2.getText().toString();
        i.putExtra("k",n);
        startActivity(i);

    }
}
