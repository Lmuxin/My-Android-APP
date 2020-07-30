package com.example.muzi.myactivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
Button button3=(Button)findViewById(R.id.button_3);
button3.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View v){
        ActivityCollector.finishAll();//点击按钮 调用类ActivityCollector里的finishAll()方法杀死所以的活动
    }
});

            }
        }

