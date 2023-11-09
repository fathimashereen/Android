package com.example.activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate called");
    }
    @Override
    protected void onStart(){
        super.onStart();
        showToast("onStart called");
    }

    @Override
    protected void onPause(){
        super.onPause();
        showToast("onPause called");
    }
    @Override
    protected void onResume(){
        super.onResume();
        showToast("onResume called");
    }

    @Override
    protected void onStop(){
        super.onStop();
        showToast("onStop called");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        showToast("onDestroy called");
    }


    private void showToast (String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }
}
