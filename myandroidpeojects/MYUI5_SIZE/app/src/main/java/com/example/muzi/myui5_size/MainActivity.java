package com.example.muzi.myui5_size;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.background);
        float xdpi=getResources().getDisplayMetrics().xdpi;
        float ydpi=getResources().getDisplayMetrics().ydpi;
        Log.d("MainActivity","xdpi is "+xdpi);
        Log.d("MainActivity","ydpi is "+ydpi);
    }
}
