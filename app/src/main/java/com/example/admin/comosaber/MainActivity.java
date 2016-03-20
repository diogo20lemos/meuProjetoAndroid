package com.example.admin.comosaber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quantity = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startSecondActivity(View view) {

        EditText nameuserEditText = (EditText) findViewById(R.id.name_user);
        String  nameuser = nameuserEditText.getText().toString();

        EditText nameAgeEditText = (EditText) findViewById(R.id.age_view);
        int  ageuser = Integer.parseInt(nameAgeEditText.getText().toString());

        String message = createSumary (nameuser, ageuser);

        Intent secondActivity = new Intent(this, SecondActivity.class );
        secondActivity.putExtra("message", message);
        startActivity(secondActivity);
    }

    public String createSumary(String name, int age){

        String message = name + ", you have " + age +" old";

        if (age <= 1 ){
            message += "\n You should sleep 12 - 17 hours a day" ;
        }else if (age <6 ){
            message += "\n You should sleep 10 - 14 hours a day" ;
        }else if (age < 14){
            message += "\n You should sleep 9 - 11 hours a day" ;
        }else if (age < 18){
            message += "\n You should sleep 8 - 9 hours a day" ;
        }else if (age < 64){
            message += "\n You should sleep 7 - 9 hours a day" ;
        }else {
            message += "\n You should sleep 7 - 8 hours a day" ;
        }

        return message;
    }

}
