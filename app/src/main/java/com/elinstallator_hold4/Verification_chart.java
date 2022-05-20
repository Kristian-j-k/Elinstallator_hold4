package com.elinstallator_hold4;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Verification_chart extends AppCompatActivity {

    VerificationChart vc = new VerificationChart();

    private int radio =-1;
    String tekst = "Er beskyttelsesmetode korrekt valgt i forhold til installationstype og systemjordning?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification_chart3);

        setText();

    }


    //generate all text in verification_chart3.xml
    public  void setText(){

//1. Gennerelt
        TextView question1_1 = (TextView)findViewById(R.id.text1_1);  question1_1.setText(vc.question1_1);
        TextView question1_2 = (TextView)findViewById(R.id.text1_2);  question1_2.setText(vc.question1_2);
        TextView question1_3 = (TextView)findViewById(R.id.text1_3);  question1_3.setText(vc.question1_3);
        TextView question1_4 = (TextView)findViewById(R.id.text1_4);  question1_4.setText(vc.question1_4);
        TextView question1_5 = (TextView)findViewById(R.id.text1_5);  question1_5.setText(vc.question1_5);
        TextView question1_6 = (TextView)findViewById(R.id.text1_6);  question1_6.setText(vc.question1_6);
        TextView question1_7 = (TextView)findViewById(R.id.text1_7);  question1_7.setText(vc.question1_7);
        TextView question1_8 = (TextView)findViewById(R.id.text1_8);  question1_8.setText(vc.question1_8);
        TextView question1_9 = (TextView)findViewById(R.id.text1_9);  question1_9.setText(vc.question1_9);
        TextView question1_10 = (TextView)findViewById(R.id.text1_10);  question1_10.setText(vc.question1_10);
        TextView question1_11 = (TextView)findViewById(R.id.text1_11);  question1_11.setText(vc.question1_11);
        TextView question1_12 = (TextView)findViewById(R.id.text1_12);  question1_12.setText(vc.question1_12);
        TextView question1_13 = (TextView)findViewById(R.id.text1_13);  question1_13.setText(vc.question1_13);

    }
    //save all choices in verification_chart3.xml
    public void save(View v) {
        //1.1
        CheckBox a110 = (CheckBox) findViewById(R.id.checkBox1_1_yes);
        vc.answer[1][1][0]= a110.isChecked();
        CheckBox a111 = (CheckBox) findViewById(R.id.checkBox1_1_no);
        vc.answer[1][1][1]= a111.isChecked();
        CheckBox a112 = (CheckBox) findViewById(R.id.checkBox1_1_NA);
        vc.answer[1][1][2]= a112.isChecked();
        //1.2
        CheckBox a120 = (CheckBox) findViewById(R.id.checkBox1_2_yes);
        vc.answer[1][2][0]= a120.isChecked();
        CheckBox a121 = (CheckBox) findViewById(R.id.checkBox1_2_no);
        vc.answer[1][2][1]= a121.isChecked();
        CheckBox a122 = (CheckBox) findViewById(R.id.checkBox1_2_NA);
        vc.answer[1][2][2]= a122.isChecked();
        //1.3
        CheckBox a130 = (CheckBox) findViewById(R.id.checkBox1_3_yes);
        vc.answer[1][3][0]= a130.isChecked();
        CheckBox a131 = (CheckBox) findViewById(R.id.checkBox1_3_no);
        vc.answer[1][3][1]= a131.isChecked();
        CheckBox a132 = (CheckBox) findViewById(R.id.checkBox1_3_NA);
        vc.answer[1][3][2]= a132.isChecked();
        //1.4
        CheckBox a140 = (CheckBox) findViewById(R.id.checkBox1_4_yes);
        vc.answer[1][4][0]= a140.isChecked();
        CheckBox a141 = (CheckBox) findViewById(R.id.checkBox1_4_no);
        vc.answer[1][4][1]= a141.isChecked();
        CheckBox a142 = (CheckBox) findViewById(R.id.checkBox1_4_NA);
        vc.answer[1][4][2]= a142.isChecked();
        //1.5
        CheckBox a150 = (CheckBox) findViewById(R.id.checkBox1_5_yes);
        vc.answer[1][5][0]= a150.isChecked();
        CheckBox a151 = (CheckBox) findViewById(R.id.checkBox1_5_no);
        vc.answer[1][5][1]= a151.isChecked();
        CheckBox a152 = (CheckBox) findViewById(R.id.checkBox1_5_NA);
        vc.answer[1][5][2]= a152.isChecked();
        //1.6
        CheckBox a160 = (CheckBox) findViewById(R.id.checkBox1_6_yes);
        vc.answer[1][6][0]= a160.isChecked();
        CheckBox a161 = (CheckBox) findViewById(R.id.checkBox1_6_no);
        vc.answer[1][6][1]= a161.isChecked();
        CheckBox a162 = (CheckBox) findViewById(R.id.checkBox1_6_NA);
        vc.answer[1][6][2]= a162.isChecked();
        //1.7
        CheckBox a170 = (CheckBox) findViewById(R.id.checkBox1_7_yes);
        vc.answer[1][7][0]= a170.isChecked();
        CheckBox a171 = (CheckBox) findViewById(R.id.checkBox1_7_no);
        vc.answer[1][7][1]= a171.isChecked();
        CheckBox a172 = (CheckBox) findViewById(R.id.checkBox1_7_NA);
        vc.answer[1][7][2]= a172.isChecked();
        //1.8
        CheckBox a180 = (CheckBox) findViewById(R.id.checkBox1_8_yes);
        vc.answer[1][8][0]= a180.isChecked();
        CheckBox a181 = (CheckBox) findViewById(R.id.checkBox1_8_no);
        vc.answer[1][8][1]= a181.isChecked();
        CheckBox a182 = (CheckBox) findViewById(R.id.checkBox1_8_NA);
        vc.answer[1][8][2]= a182.isChecked();
        //1.9
        CheckBox a190 = (CheckBox) findViewById(R.id.checkBox1_9_yes);
        vc.answer[1][9][0]= a190.isChecked();
        CheckBox a191 = (CheckBox) findViewById(R.id.checkBox1_9_no);
        vc.answer[1][9][1]= a191.isChecked();
        CheckBox a192 = (CheckBox) findViewById(R.id.checkBox1_9_NA);
        vc.answer[1][9][2]= a192.isChecked();
        //1.10
        CheckBox a1100 = (CheckBox) findViewById(R.id.checkBox1_10_yes);
        vc.answer[1][10][0]= a1100.isChecked();
        CheckBox a1101 = (CheckBox) findViewById(R.id.checkBox1_10_no);
        vc.answer[1][10][1]= a1101.isChecked();
        CheckBox a1102 = (CheckBox) findViewById(R.id.checkBox1_10_NA);
        vc.answer[1][10][2]= a1102.isChecked();
        //1.12
        CheckBox a1120 = (CheckBox) findViewById(R.id.checkBox1_12_yes);
        vc.answer[1][12][0]= a1120.isChecked();
        CheckBox a1121 = (CheckBox) findViewById(R.id.checkBox1_12_no);
        vc.answer[1][12][1]= a1121.isChecked();
        CheckBox a1122 = (CheckBox) findViewById(R.id.checkBox1_12_NA);
        vc.answer[1][12][2]= a1122.isChecked();
        //1.13
        CheckBox a1130 = (CheckBox) findViewById(R.id.checkBox1_13_yes);
        vc.answer[1][13][0]= a1130.isChecked();
        CheckBox a1131 = (CheckBox) findViewById(R.id.checkBox1_13_no);
        vc.answer[1][13][1]= a1131.isChecked();
        CheckBox a1132 = (CheckBox) findViewById(R.id.checkBox1_13_NA);
        vc.answer[1][13][2]= a1132.isChecked();

    }

    public void radioSwap(View v){
        View v1 = findViewById(R.id.radio_yes);
        View v2 = findViewById(R.id.radio_no);
        View v3 = findViewById(R.id.radio_NA);
        v1.setEnabled(false);
        v2.setEnabled(false);
        v3.setEnabled(false);
        v.setEnabled(true);
    }



}