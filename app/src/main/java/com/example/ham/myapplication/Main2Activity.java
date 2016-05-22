package com.example.ham.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Environment;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import android.os.Handler;

public class Main2Activity extends AppCompatActivity {
    EditText text00;
    EditText text01;
    EditText text02;
    EditText text10;
    EditText text11;
    EditText text12;
    EditText text20;
    EditText text21;
    EditText text22;
    EditText text03;
    EditText text04;
    EditText text05;
    EditText text13;
    EditText text14;
    EditText text15;
    EditText text23;
    EditText text24;
    EditText text25;
    EditText text06;
    EditText text07;
    EditText text08;
    EditText text16;
    EditText text17;
    EditText text18;
    EditText text26;
    EditText text27;
    EditText text28;
    EditText text30;
    EditText text31;
    EditText text32;
    EditText text40;
    EditText text41;
    EditText text42;
    EditText text50;
    EditText text51;
    EditText text52;
    EditText text33;
    EditText text34;
    EditText text35;
    EditText text43;
    EditText text44;
    EditText text45;
    EditText text53;
    EditText text54;
    EditText text55;
    EditText text36;
    EditText text37;
    EditText text38;
    EditText text46;
    EditText text47;
    EditText text48;
    EditText text56;
    EditText text57;
    EditText text58;
    EditText text60;
    EditText text61;
    EditText text62;
    EditText text70;
    EditText text71;
    EditText text72;
    EditText text80;
    EditText text81;
    EditText text82;
    EditText text63;
    EditText text64;
    EditText text65;
    EditText text73;
    EditText text74;
    EditText text75;
    EditText text83;
    EditText text84;
    EditText text85;
    EditText text66;
    EditText text67;
    EditText text68;
    EditText text76;
    EditText text77;
    EditText text78;
    EditText text86;
    EditText text87;
    EditText text88;


    Button check;
    Button viewRes;
    int[][] output = new int[9][9];
    int j = 0;
    int i = 0;
    TextView textTimer;
    long startTime = 0L;
    Handler myHandler = new Handler();
    long timeInMillies = 0L;
    long timeSwap = 0L;
    long finalTime = 0L;


    int[][] data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textTimer = (TextView) findViewById(R.id.textTimer);

        startTime = SystemClock.uptimeMillis();
        myHandler.postDelayed(updateTimerMethod, 0);
        text00 = (EditText) findViewById(R.id.button);
        text01 = (EditText) findViewById(R.id.button2);
        text02 = (EditText) findViewById(R.id.button3);
        text03 = (EditText) findViewById(R.id.button4);
        text04 = (EditText) findViewById(R.id.button5);
        text05 = (EditText) findViewById(R.id.button6);
        text06 = (EditText) findViewById(R.id.button7);
        text07 = (EditText) findViewById(R.id.button8);
        text08 = (EditText) findViewById(R.id.button9);
        text10 = (EditText) findViewById(R.id.button10);
        text11 = (EditText) findViewById(R.id.button11);
        text12 = (EditText) findViewById(R.id.button12);
        text13 = (EditText) findViewById(R.id.button13);
        text14 = (EditText) findViewById(R.id.button14);
        text15 = (EditText) findViewById(R.id.button15);
        text16 = (EditText) findViewById(R.id.button16);
        text17 = (EditText) findViewById(R.id.button17);
        text18 = (EditText) findViewById(R.id.button18);
        text20 = (EditText) findViewById(R.id.button19);
        text21 = (EditText) findViewById(R.id.button20);
        text22 = (EditText) findViewById(R.id.button21);
        text23 = (EditText) findViewById(R.id.button22);
        text24 = (EditText) findViewById(R.id.button23);
        text25 = (EditText) findViewById(R.id.button24);
        text26 = (EditText) findViewById(R.id.button25);
        text27 = (EditText) findViewById(R.id.button26);
        text28 = (EditText) findViewById(R.id.button27);
        text30 = (EditText) findViewById(R.id.button28);
        text31 = (EditText) findViewById(R.id.button29);
        text32 = (EditText) findViewById(R.id.button30);
        text33 = (EditText) findViewById(R.id.button31);
        text34 = (EditText) findViewById(R.id.button32);
        text35 = (EditText) findViewById(R.id.button33);
        text36 = (EditText) findViewById(R.id.button34);
        text37 = (EditText) findViewById(R.id.button35);
        text38 = (EditText) findViewById(R.id.button36);
        text40 = (EditText) findViewById(R.id.button37);
        text41 = (EditText) findViewById(R.id.button38);
        text42 = (EditText) findViewById(R.id.button39);
        text43 = (EditText) findViewById(R.id.button40);
        text44 = (EditText) findViewById(R.id.button41);
        text45 = (EditText) findViewById(R.id.button42);
        text46 = (EditText) findViewById(R.id.button43);
        text47 = (EditText) findViewById(R.id.button44);
        text48 = (EditText) findViewById(R.id.button45);
        text50 = (EditText) findViewById(R.id.button46);
        text51 = (EditText) findViewById(R.id.button47);
        text52 = (EditText) findViewById(R.id.button48);
        text53 = (EditText) findViewById(R.id.button49);
        text54 = (EditText) findViewById(R.id.button50);
        text55 = (EditText) findViewById(R.id.button51);
        text56 = (EditText) findViewById(R.id.button52);
        text57 = (EditText) findViewById(R.id.button53);
        text58 = (EditText) findViewById(R.id.button54);
        text60 = (EditText) findViewById(R.id.button55);
        text61 = (EditText) findViewById(R.id.button56);
        text62 = (EditText) findViewById(R.id.button57);
        text63 = (EditText) findViewById(R.id.button58);
        text64 = (EditText) findViewById(R.id.button59);
        text65 = (EditText) findViewById(R.id.button60);
        text66 = (EditText) findViewById(R.id.button61);
        text67 = (EditText) findViewById(R.id.button62);
        text68 = (EditText) findViewById(R.id.button63);
        text70 = (EditText) findViewById(R.id.button64);
        text71 = (EditText) findViewById(R.id.button65);
        text72 = (EditText) findViewById(R.id.button66);
        text73 = (EditText) findViewById(R.id.button67);
        text74 = (EditText) findViewById(R.id.button68);
        text75 = (EditText) findViewById(R.id.button69);
        text76 = (EditText) findViewById(R.id.button70);
        text77 = (EditText) findViewById(R.id.button71);
        text78 = (EditText) findViewById(R.id.button72);
        text80 = (EditText) findViewById(R.id.button73);
        text81 = (EditText) findViewById(R.id.button74);
        text82 = (EditText) findViewById(R.id.button75);
        text83 = (EditText) findViewById(R.id.button76);
        text84 = (EditText) findViewById(R.id.button77);
        text85 = (EditText) findViewById(R.id.button78);
        text86 = (EditText) findViewById(R.id.button79);
        text87 = (EditText) findViewById(R.id.button80);
        text88 = (EditText) findViewById(R.id.button81);
        // int[][] data=new int[9][9];
        data = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}};
        data = setRandom(data);
        check = (Button) findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {//action listener to number one button

                if (isfill() == true) {
                    Checker o = new Checker(output);

                    if (o.check() == 0) {
                        String finalTime = textTimer.getText().toString();
                        Context context = getApplicationContext();
                        CharSequence text = "YOU WIN ,, \n Your scoure =" + finalTime;
                        int duration = Toast.LENGTH_LONG;
                        Toast toast = Toast.makeText(context, text, duration);
                        LinearLayout toastLayout = (LinearLayout) toast.getView();
                        TextView toastTV = (TextView) toastLayout.getChildAt(0);
                        toastTV.setTextSize(25);
                        toast.show();
                        timeSwap += timeInMillies;
                        myHandler.removeCallbacks(updateTimerMethod);

                        v.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                finish();
                            }
                        }, 5000);
                        //String m=readFromFile();
                        //m=m+""+finalTime;
                        //writeFile(m);

                    } else {
                        Context context = getApplicationContext();
                        CharSequence text = "Srrrrrrry";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                    }
                }
            }
        });

        viewRes = (Button) findViewById(R.id.viewRes);
        viewRes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {//action listener to number one button


                SudokuSolver l = new SudokuSolver(data);
                data = l.getSolve();
                setDataa(data);
            }
        });

    }
    private void setDataa(int[][] data) {
        settdata(data[0][0], text00);
        settdata(data[0][1], text01);
        settdata(data[0][2], text02);
        settdata(data[0][3], text10);
        settdata(data[0][4], text11);
        settdata(data[0][5], text12);
        settdata(data[0][6], text20);
        settdata(data[0][7], text21);
        settdata(data[0][8], text22);
        settdata(data[1][0], text03);
        settdata(data[1][1], text04);
        settdata(data[1][2], text05);
        settdata(data[1][3], text13);
        settdata(data[1][4], text14);
        settdata(data[1][5], text15);
        settdata(data[1][6], text23);
        settdata(data[1][7], text24);
        settdata(data[1][8], text25);
        settdata(data[2][0], text06);
        settdata(data[2][1], text07);
        settdata(data[2][2], text08);
        settdata(data[2][3], text16);
        settdata(data[2][4], text17);
        settdata(data[2][5], text18);
        settdata(data[2][6], text26);
        settdata(data[2][7], text27);
        settdata(data[2][8], text28);
        settdata(data[3][0], text30);
        settdata(data[3][1], text31);
        settdata(data[3][2], text32);
        settdata(data[3][3], text40);
        settdata(data[3][4], text41);
        settdata(data[3][5], text42);
        settdata(data[3][6], text50);
        settdata(data[3][7], text51);
        settdata(data[3][8], text52);
        settdata(data[4][0], text33);
        settdata(data[4][1], text34);
        settdata(data[4][2], text35);
        settdata(data[4][3], text43);
        settdata(data[4][4], text44);
        settdata(data[4][5], text45);
        settdata(data[4][6], text53);
        settdata(data[4][7], text54);
        settdata(data[4][8], text55);
        settdata(data[5][0], text36);
        settdata(data[5][1], text37);
        settdata(data[5][2], text38);
        settdata(data[5][3], text46);
        settdata(data[5][4], text47);
        settdata(data[5][5], text48);
        settdata(data[5][6], text56);
        settdata(data[5][7], text57);
        settdata(data[5][8], text58);
        settdata(data[6][0], text60);
        settdata(data[6][1], text61);
        settdata(data[6][2], text62);
        settdata(data[6][3], text70);
        settdata(data[6][4], text71);
        settdata(data[6][5], text72);
        settdata(data[6][6], text80);
        settdata(data[6][7], text81);
        settdata(data[6][8], text82);
        settdata(data[7][0], text63);
        settdata(data[7][1], text64);
        settdata(data[7][2], text65);
        settdata(data[7][3], text73);
        settdata(data[7][4], text74);
        settdata(data[7][5], text75);
        settdata(data[7][6], text83);
        settdata(data[7][7], text84);
        settdata(data[7][8], text85);
        settdata(data[8][0], text66);
        settdata(data[8][1], text67);
        settdata(data[8][2], text68);
        settdata(data[8][3], text76);
        settdata(data[8][4], text77);
        settdata(data[8][5], text78);
        settdata(data[8][6], text86);
        settdata(data[8][7], text87);
        settdata(data[8][8], text88);


    }

    private void settdata(int i, EditText text1) {
        if (i == 0) {
            text1.setText("");
        } else {
            text1.setText(i + "");
            text1.setEnabled(false);
        }
    }

    private boolean isfill() {
        int count = 0;
        count = isfull(text00) +
                isfull(text01) +
                isfull(text02) +
                isfull(text10) +
                isfull(text11) +
                isfull(text12) +
                isfull(text20) +
                isfull(text21) +
                isfull(text22) +
                isfull(text03) +
                isfull(text04) +
                isfull(text05) +
                isfull(text13) +
                isfull(text14) +
                isfull(text15) +
                isfull(text23) +
                isfull(text24) +
                isfull(text25) +
                isfull(text06) +
                isfull(text07) +
                isfull(text08) +
                isfull(text16) +
                isfull(text17) +
                isfull(text18) +
                isfull(text26) +
                isfull(text27) +
                isfull(text28) +
                isfull(text30) +
                isfull(text31) +
                isfull(text32) +
                isfull(text40) +
                isfull(text41) +
                isfull(text42) +
                isfull(text50) +
                isfull(text51) +
                isfull(text52) +
                isfull(text33) +
                isfull(text34) +
                isfull(text35) +
                isfull(text43) +
                isfull(text44) +
                isfull(text45) +
                isfull(text53) +
                isfull(text54) +
                isfull(text55) +
                isfull(text60) +
                isfull(text61) +
                isfull(text62) +
                isfull(text70) +
                isfull(text71) +
                isfull(text72) +
                isfull(text80) +
                isfull(text81) +
                isfull(text82) +
                isfull(text63) +
                isfull(text64) +
                isfull(text65) +
                isfull(text73) +
                isfull(text74) +
                isfull(text75) +
                isfull(text83) +
                isfull(text84) +
                isfull(text85) +
                isfull(text66) +
                isfull(text67) +
                isfull(text68) +
                isfull(text76) +
                isfull(text77) +
                isfull(text78) +
                isfull(text86) +
                isfull(text87) +

                isfull(text88);
        if (count == 0) {
            return true;
        } else {
            Context context = getApplicationContext();
            CharSequence text = "Have A Some Empty Spaces, Fill It Please ^_^";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return false;
        }
    }

    private int isfull(EditText text0) {
        if (text0.getText().toString().equals("")) {
            text0.setBackgroundColor(Color.YELLOW);
            return 1;
        } else {
            output[i][j] = Integer.parseInt(text0.getText().toString());

            if (j == 8) {
                j = 0;
                i++;
            } else {
                j++;
            }
            text0.setBackgroundColor(Color.GRAY);
            return 0;
        }
    }

    private int[][] setRandom(int data[][]) {
        Random rn = new Random();
        int dataR[][] = new int[9][9];
        int x = (int) rn.nextInt((8 - 0) + 1) + 0;
        int y = (int) rn.nextInt((8 - 0) + 1) + 0;
        int d = (int) rn.nextInt(9 - 1 + 1) + 1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                dataR[i][j] = 0;
            }
        }
        dataR[x][y] = d;
        SudokuSolver l = new SudokuSolver(dataR);
        data = l.getSolve();
        for (int i = 0; i < 65; i++) {
            int m = (int) rn.nextInt((8 - 0) + 1) + 0;
            int n = (int) rn.nextInt((8 - 0) + 1) + 0;
            data[m][n] = 0;
        }
        setDataa(data);
        return data;
    }

    private Runnable updateTimerMethod = new Runnable() {

        public void run() {
            timeInMillies = SystemClock.uptimeMillis() - startTime;
            finalTime = timeSwap + timeInMillies;

            int seconds = (int) (finalTime / 1000);
            int minutes = seconds / 60;
            seconds = seconds % 60;
            int hour = minutes / 60;
            minutes = minutes % 60;
            textTimer.setText(hour + ":" + minutes + ":"
                    + String.format("%02d", seconds)
            );
            myHandler.postDelayed(this, 0);
        }

    };


    private String readFromFile() {
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
    }

    public void writeFile(String s) {
       String Message =s;
        String file_name="hi_file";
        try {
            FileOutputStream fileOutputStream=openFileOutput(file_name,MODE_PRIVATE);
            try {
                fileOutputStream.write(Message.getBytes());
                fileOutputStream.close();
                Toast.makeText(getApplicationContext(),"Message Save",Toast.LENGTH_LONG).show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



}
