package com.example.muzi.myactivity;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
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

public class FirstActivity extends BaseActivity {
    @Override
    protected  void onCreate(Bundle savadInstanceState)//创建活动必须要执行的函数
    {
        super.onCreate(savadInstanceState);
        //getWindow().requestWindowFeature(Window.FEATURE_N0_TITLE);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);//隐藏标题栏
        setContentView(R.layout.firstlayout);//给当前活动加载一个布局=

        //使用Toast 显示提醒信息  点击按钮 给出提示消息 过一会消失
        Button b=(Button) findViewById(R.id.button_1);//找到布局文件里的按钮
        b.setOnClickListener(new View.OnClickListener(){//为按钮注册监听器，点击按钮会执行监听器里面的onclick方法
            @Override  //这个O要大写
            public void onClick(View v) {
              /***********显式使用intent
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);//打开两个活动  在FirstActivity基础上打开SecondActivity
                startActivity(intent);//通过这个方法执行Intentintent
                */
              /*****************隐式使用intent
                Intent intent =new Intent("com.example.muzi.myactivity.ACTION_START");
                startActivity(intent);//通过这个方法执行Intentintent
              */
                /****更多intent

                   Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));//点击按钮跳转到百度
                startActivity(intent);
                 */

//向第二个活动传递数据
//                String data="hello nice to meet you ";
//                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
//                startActivityForResult(intent,1);
////                intent.putExtra("extra_data",data);
////                startActivity(intent);


             //第二个活动向第一个活动返回数据
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);
                //Toast.makeText(FirstActivity.this, "你干嘛点我啊", Toast.LENGTH_SHORT).show();
               // finish();//销毁活动  程序直接退出了 和按下back键一样
            }

        });

    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        switch(requestCode){
            case 1:
                    if (resultCode==RESULT_OK){
                String returnedData=data.getStringExtra("data_return");
                Log.d("FirstActivity",returnedData);

                    }
                    break;
            default:

        }


    }


//创建菜单
    public boolean onCreateOptionMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main,menu);//给活动创建菜单 并添加菜单项
        return true;

    }
    //让菜单响应
    public boolean onOptionItemSelected(MenuItem item){
        switch(item.getItemId()) {//判断点击的是那个菜单项目
            case R.id.add_item:
                Toast.makeText(this,"你点击了add",Toast.LENGTH_SHORT).show();
            break;
            case R.id.remove_item:
                Toast.makeText(this,"你点击了Remove",Toast.LENGTH_LONG).show();
                break;
            default:

        }
        return true;
    }


}
