package com.example.samtrent.shardpref;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {


    final String MY_UNIQUE_PREF_FILE = "myFile";

    SharedPreferences MyPref;

    SharedPreferences.Editor editor;

    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        SharedPreferences MyPref = getSharedPreferences(MY_UNIQUE_PREF_FILE, Context.MODE_PRIVATE);
        editor = MyPref.edit();
        TextView num = (TextView) findViewById(R.id.textView);

        count = MyPref.getInt("count", 0);
        num.setText(Integer.toString(count));
    }


    public void advanceNum(View view)
    {
        TextView num = (TextView) findViewById(R.id.textView);
        count++;
        num.setText(Integer.toString(count));
    }



    public void saveNum(View view)
    {


        editor.putInt("count", count);
        editor.apply();

    }




//    advance.setOnClickListener((v) -> {
//
//        count;
//
//
//    });
//
//
//    save.setOnClickListener((v) -> {
//
//
//
//
//
//    });


}
