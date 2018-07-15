package com.dream.duck.anewtry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("activity_main","onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("activity_main","onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("activity_main","onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("activity_main","onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("activity_main","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("activity_main","onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("activity_main","onDestroy()");
    }
}
