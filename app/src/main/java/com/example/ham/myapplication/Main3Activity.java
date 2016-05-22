package com.example.ham.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3Activity extends AppCompatActivity {
Button back;
    TextView data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        back=(Button) findViewById(R.id.back);
       // data=(TextView)findViewById(R.id.data);
        ///data.setText(readFromFile());
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {//action listener to number one button
                android.os.Process.killProcess(android.os.Process.myPid());

            }
        });
    }
    /*private String readFromFile() {
        StringBuffer stringBuffer = null;
        try {
            String Message;
            FileInputStream fileInputStream= openFileInput("hi_file");
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            stringBuffer=new StringBuffer();
            while((Message=bufferedReader.readLine())!=null){
                stringBuffer.append(Message+"\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s=stringBuffer.toString();
        return s;
    }*/

}
