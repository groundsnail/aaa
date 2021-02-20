package com.example.anja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;



public class MainActivity extends AppCompatActivity {
private static final String DEBUG_TAG="tag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text_view);
        BreadFactory breadFactory = new BreadFactory();
        Bread bread= breadFactory.getBread("BAG");
        Log.d(DEBUG_TAG,bread.name());
     //   textView.setText(new StringBuilder().append(bread.name().toString()));
    }
}