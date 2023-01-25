package com.lutful.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edName, edEmail, edVoter,edPassport,edStudent;
    Button buttonSave, bNext;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edName = findViewById(R.id.edName);
        edEmail = findViewById(R.id.edEmail);
        edVoter = findViewById(R.id.edVoter);
        edPassport = findViewById(R.id.edPassport);
        edStudent = findViewById(R.id.edStudent);
        buttonSave = findViewById(R.id.buttonSave);
        bNext = findViewById(R.id.bNext);


        sharedPreferences = getSharedPreferences(""+getString(R.string.app_name), MODE_PRIVATE);
        editor = sharedPreferences.edit();


        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name = edName.getText().toString();
                String edEmail = edEmail.getText().toString();
                String edVoter = edVoter.getText().toString();
                String edPassport = edPassport.getText().toString();
                String edStudent = edStudent.getText().toString();
                String edVoter = edVoter.getText().toString();

                editor.putString("name",""+name);
                editor.putInt("age", 26);
                editor.apply();


            }
        });

        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  String name = sharedPreferences.getString("name", "Default Value");
               //

                    startActivity(new Intent(MainActivity.this, MainActivity2.class));



            }
        });


        private void validateinfo, (String name, String email, String password,String number){

        }

    }
}