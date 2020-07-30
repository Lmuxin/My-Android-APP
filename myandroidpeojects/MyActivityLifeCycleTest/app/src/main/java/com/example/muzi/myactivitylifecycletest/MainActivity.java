package com.example.muzi.myactivitylifecycletest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends Activity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreat");
        setContentView(R.layout.activity_main);
        if (savedInstanceState!=null){
            String tempData=savedInstanceState.getString("data_key");
            Log.d(TAG,tempData);
        }
        Button startNormalActivity = (Button) findViewById(R.id.start_normal_activity);
        Button startDialogtActivity = (Button) findViewById(R.id.start_dialog_activity);
        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });

        startDialogtActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });

    }
    //这个方法是活动被回收之前先把活动的数据保存下来，以便活再次恢复时把之前的内容显示出来
@Override
protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        String tempData="Someting yuu just input";
        outState.putString("data_key",tempData);

}
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");

    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"onStop");

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy");

    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"onRestart");

    }

}

