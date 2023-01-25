package com.lutful.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);

        SharedPreferences SharedPreferences = getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE);

        String myString = sharedPreferences.getString("name", "");
        int myAge = sharedPreferences.getInt("age", 0);
                textView.setText(myString);
        textView.append("\n Your age is "+myAge);
    }
}