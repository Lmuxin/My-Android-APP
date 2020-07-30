package com.example.muzi.myactivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends BaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Button button2=(Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data_return", "hello firstactivity");
                setResult(RESULT_OK, intent);//专门向上一个活动返回数据
                finish();
            }
            });

//
//        Intent intent=getIntent();
//        String data=intent.getStringExtra("extra_data");
//        Log.d("SecondActivity",data);


    }
}
