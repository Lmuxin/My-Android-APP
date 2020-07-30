package com.example.muzi.myui1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import static android.widget.Toast.*;
/***
 匿名内部类注册监听器
/*
 *//*

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题栏  这句是个bug吗  加上这句话在模拟器里就打不开app
        Button button1=(Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {//匿名内部类注册监听器
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"you click me ",Toast.LENGTH_SHORT).show();
              //  Toast.makeText(MainActivity.this, "你干嘛点我啊", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
*/



/***
 * 不是匿名类注册监听器
*/
public class MainActivity extends Activity implements View.OnClickListener {
private  Button button1;
private EditText editText;
private ImageView imageView;
private ProgressBar progressBar;//圆形的
    private ProgressBar progressBar2;//水平的进度条

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button_1);
        editText=(EditText)findViewById(R.id.edit_1) ;
        imageView=(ImageView)findViewById(R.id.closeye) ;
        progressBar=(ProgressBar)findViewById(R.id.progress_bar) ;
        progressBar2=(ProgressBar)findViewById(R.id.progress_bar2) ;

        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button_1:
                /****功能11111111111
               //点击按钮取得editText里面的内容显示到Toast里
               String inputText=editText.getText().toString();
                Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();
               */
             /** 功能2222222
              * imageView.setImageResource(R.drawable.closeeye);//点击按钮原来睁开眼睛的图片变成闭着眼的*/


           /** 功能3333333333333//点击按钮圆形进度条消失 隐藏啦,再点击又出来了
                if(progressBar.getVisibility()==View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                }
                else {
                    progressBar.setVisibility(View.GONE);

                }*/
          /***功能4444444444444444点击按钮水平进度条增加
                int progress=progressBar2.getProgress();
                progress=progress+10;
                progressBar2.setProgress(progress);*/


          /***功能5555555555//点击按钮弹出对话框
                AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is a warning dialog");
                dialog.setMessage("Something wrong with you computer");
                dialog.setCancelable(false);//点击back键不不不可以返回
                //设置确定按钮点击事件
                dialog.setPositiveButton("OK",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog,int which){

                    }
                });
                //设置取消按钮点击事件
                dialog.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();*/


          ///功能66666666666666带有进度条的对话框，一般表示当前操作比较耗时，请用户那耐心等待
                ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is a ProgressDialog");
                progressDialog.setMessage("Loding........");
                progressDialog.setCancelable(true);//点击back键可以返回
                progressDialog.show();

                break;
            default:
                break;
        }
    }
}
