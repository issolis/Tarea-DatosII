package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView message;
    EditText text_1;
    EditText text_2;
    public void buttonPress(View view){

        message= findViewById(R.id.message);
        message.setText("Result: "+text_1.getText()+" "+text_2.getText());

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_2=findViewById(R.id.text_2);
        text_1=findViewById(R.id.text_1);

    }
}