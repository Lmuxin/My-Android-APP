package com.example.muzi.myactivitylifecycletest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.example.muzi.myactivitylifecycletest.R;


    public class DialogActivity  extends Activity {
        @Override
        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.dialog_layout);

        }
}
