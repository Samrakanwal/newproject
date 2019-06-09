package com.example.sheroz.mydemocalci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
String result=null ;
        Bundle extras = getIntent().getExtras();
        if(extras != null){

             result = extras.getString("RESULT");

        }
    TextView tvresult= (TextView) findViewById(R.id.tvResult);
    tvresult.setText(result);
    }
}
