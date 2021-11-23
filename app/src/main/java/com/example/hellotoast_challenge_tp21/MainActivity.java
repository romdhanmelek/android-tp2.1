package com.example.hellotoast_challenge_tp21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int mCount = 0;
    private TextView mShowCount;
    private TextView textView ;


    private static final String TAG=MainActivity.class.getSimpleName();
    public static final String EXTRA_Message = "com.example.android.tp2.extra.message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.Show_Count);
        textView = findViewById(R.id.text2) ;
    }

    public void Lanchsecondactivity(View view){

        Intent intent =new Intent(this, SecondActivity.class);
        String message =mShowCount.getText().toString();
        intent.putExtra(EXTRA_Message, message);
        startActivity(intent);
    }


    public void CountUp(View view) {

        mCount++;

        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}