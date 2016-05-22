package com.example.ham.myapplication;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    Button newGame;
    Button exit;
    Button top ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        newGame = (Button) findViewById(R.id.newGame);
        newGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startss = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(startss);
            }
        });
        exit = (Button) findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                android.os.Process.killProcess(android.os.Process.myPid());


            }
        });
        top=(Button) findViewById(R.id.top);
        top.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {//action listener to number one button
                Intent startss = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(startss);
            }
        });
    }
    public void readFile() {
        File Root = Environment.getExternalStorageDirectory();
        File Dir = new File(Root.getAbsolutePath() + "/MyAppFile");
        File file = new File(Dir, "MyMessage.txt");
        String Message;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuffer stringBuffer = new StringBuffer();
            while ((Message = bufferedReader.readLine()) != null) {

                stringBuffer.append(Message + "\n");
            }
            System.out.print(stringBuffer.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
