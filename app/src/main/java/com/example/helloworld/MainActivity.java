package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter=0;  //for counting the number of times the button is pressed
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {   //this function runs at the start of the application
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //this allows the display on android screen by loading an xml document

    }

    public void  onBtnClk (View v){  //this function is triggered every time the button is pressed
        EditText et=findViewById(R.id.uwuname);
        counter+=1;
        TextView txtHello = findViewById(R.id.main);  //txtHello contains the main text view findViewById method is similar to the DOM elements used in js here R represents the resources folder
        txtHello.setText(et.getText().toString()+" Clicked "+counter+" Times");  //the set Text function sets the string on which it is applied to something else
        if(counter==10)
        {
            TextView btnTxt=findViewById(R.id.button);
            btnTxt.setText(et.getText().toString()+" is on fire!");
        }
        if(counter==50){
            TextView btnTxt=findViewById(R.id.button);
            btnTxt.setText("Dude Stop!");
        }
        if(counter==55){
            TextView btnTxt=findViewById(R.id.button);
            btnTxt.setText("Bro!");
        }
        if(counter==60){
            TextView btnTxt=findViewById(R.id.button);
            btnTxt.setText("WTF!");
        }
        if(counter==70){
            if(str.equals(et.getText().toString())==true)
            {
                str=et.getText().toString();
            }
        }
    }
}