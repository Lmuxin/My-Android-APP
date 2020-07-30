package com.example.muzi.myui_singlechoiceitem;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void Dialog(View v){//对话框
        new AlertDialog.Builder(MainActivity.this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Attrntion对话框")
                .setMessage("确定要退出吗")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        finish();
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {////new DialogInterface().OnClickListener()

                    }
                }).create().show();
    }
    public void Singlechoice(View v) {//单选框
        final String[] items = {"男", "女", "F", "M"};
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("单选框")
                .setIcon(R.drawable.ic_launcher_background)
                .setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, items[which], Toast.LENGTH_SHORT).show();
                        dialog.dismiss();

                    }
                }).create();
        dialog.show();

    }

    }


}
