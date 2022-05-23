package com.Elinstallator_hold4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    VerificationChart vc = new VerificationChart();
    ArrayList<TextView> textFields = new ArrayList<TextView>(); //Text for each line in verification chart


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification_chart3);

        setText();

    }


    //generate all text in verification_chart3.xml
    public  void setText(){


        // makes Arraylist with the id from xml
        textFields.add(0,(TextView)findViewById(R.id.text1));
        textFields.add(1,(TextView)findViewById(R.id.text2));
        textFields.add(2,(TextView)findViewById(R.id.text3));
        textFields.add(3,(TextView)findViewById(R.id.text4));
        textFields.add(4,(TextView)findViewById(R.id.text5));
        textFields.add(5,(TextView)findViewById(R.id.text6));
        textFields.add(6,(TextView)findViewById(R.id.text7));
        textFields.add(7,(TextView)findViewById(R.id.text8));
        textFields.add(8,(TextView)findViewById(R.id.text9));
        textFields.add(9,(TextView)findViewById(R.id.text10));
        textFields.add(10,(TextView)findViewById(R.id.text11));
        textFields.add(11,(TextView)findViewById(R.id.text12));
        textFields.add(12,(TextView)findViewById(R.id.text13));

        // using the xml id, here the text from the class VerificationChart is set

        for (int i = 0; i < textFields.size(); i++) {
            textFields.get(i).setText(vc.questions.get(i));
        }



    }
    //save all choices in verification_chart3.xml
    public void save(View v) {

        CheckBox[][] chek = new CheckBox[20][3];

        chek[0][0] = (CheckBox) findViewById(R.id.checkBox1_yes);
        chek[0][1] = (CheckBox) findViewById(R.id.checkBox1_no);
        chek[0][2] = (CheckBox) findViewById(R.id.checkBox1_NA);
        chek[1][0] = (CheckBox) findViewById(R.id.checkBox2_yes);
        chek[1][1] = (CheckBox) findViewById(R.id.checkBox2_no);
        chek[1][2] = (CheckBox) findViewById(R.id.checkBox2_NA);
        chek[2][0] = (CheckBox) findViewById(R.id.checkBox3_yes);
        chek[2][1] = (CheckBox) findViewById(R.id.checkBox3_no);
        chek[2][2] = (CheckBox) findViewById(R.id.checkBox3_NA);
        chek[3][0] = (CheckBox) findViewById(R.id.checkBox4_yes);
        chek[3][1] = (CheckBox) findViewById(R.id.checkBox4_no);
        chek[3][2] = (CheckBox) findViewById(R.id.checkBox4_NA);
        chek[4][0] = (CheckBox) findViewById(R.id.checkBox5_yes);
        chek[4][1] = (CheckBox) findViewById(R.id.checkBox5_no);
        chek[4][2] = (CheckBox) findViewById(R.id.checkBox5_NA);
        chek[5][0] = (CheckBox) findViewById(R.id.checkBox6_yes);
        chek[5][1] = (CheckBox) findViewById(R.id.checkBox6_no);
        chek[5][2] = (CheckBox) findViewById(R.id.checkBox6_NA);
        chek[6][0] = (CheckBox) findViewById(R.id.checkBox7_yes);
        chek[6][1] = (CheckBox) findViewById(R.id.checkBox7_no);
        chek[6][2] = (CheckBox) findViewById(R.id.checkBox7_NA);
        chek[7][0] = (CheckBox) findViewById(R.id.checkBox8_yes);
        chek[7][1] = (CheckBox) findViewById(R.id.checkBox8_no);
        chek[7][2] = (CheckBox) findViewById(R.id.checkBox8_NA);
        chek[8][0] = (CheckBox) findViewById(R.id.checkBox9_yes);
        chek[8][1] = (CheckBox) findViewById(R.id.checkBox9_no);
        chek[8][2] = (CheckBox) findViewById(R.id.checkBox9_NA);
        chek[9][0] = (CheckBox) findViewById(R.id.checkBox10_yes);
        chek[9][1] = (CheckBox) findViewById(R.id.checkBox10_no);
        chek[9][2] = (CheckBox) findViewById(R.id.checkBox10_NA);
        chek[10][0] = (CheckBox) findViewById(R.id.checkBox11_yes);
        chek[10][1] = (CheckBox) findViewById(R.id.checkBox11_no);
        chek[10][2] = (CheckBox) findViewById(R.id.checkBox11_NA);
        chek[11][0] = (CheckBox) findViewById(R.id.checkBox12_yes);
        chek[11][1] = (CheckBox) findViewById(R.id.checkBox12_no);
        chek[11][2] = (CheckBox) findViewById(R.id.checkBox12_NA);
        chek[12][0] = (CheckBox) findViewById(R.id.checkBox13_yes);
        chek[12][1] = (CheckBox) findViewById(R.id.checkBox13_no);
        chek[12][2] = (CheckBox) findViewById(R.id.checkBox13_NA);

        // vc.answer[0][0]= chek[0][0].isChecked();
      /*  checkBox.get(1).add( 0, (CheckBox) findViewById(R.id.checkBox2_yes));
        checkBox.get(1).add( 1, (CheckBox) findViewById(R.id.checkBox2_no));
        checkBox.get(1).add( 2, (CheckBox) findViewById(R.id.checkBox2_NA));
       */


// checkboxes answers being saved in array from class VerificationChart
        int i = 0;
        while (chek[i][0] != null) {
            for (int j = 0; j <= 2; j++) {
                vc.answer[i][j] = chek[i][j].isChecked();
                //           System.out.println(vc.answer[i][j]);      Test
                //           System.out.println("i er "+i+" j er "+j);     Test
            }
            i++;
        }

    }




    //Methods for each checkbox----------------------------------------
/*
    public void checkIt(View v) {

        CheckBox a110 = (CheckBox) findViewById(R.id.checkBox1_1_yes);
        vc.answer[1][1][0]= a110.isChecked();

        CheckBox a111 = (CheckBox) findViewById(R.id.checkBox1_1_no);
        vc.answer[1][1][1]= a111.isChecked();

        CheckBox a112 = (CheckBox) findViewById(R.id.checkBox1_1_NA);
        vc.answer[1][1][2]= a112.isChecked();

        System.out.println(vc.answer[1][1][0]);
        System.out.println(vc.answer[1][1][1]);
        System.out.println(vc.answer[1][1][2]);

    }



    //
    public void answerYes(View v, int group, int question){
        if (vc.answersGQA[group][question][0] != 0) {
            View v1 = findViewById(R.id.checkBox1_1_no);
            View v2 = findViewById(R.id.checkBox1_1_NA);
            v1.setEnabled(false);
            v2.setEnabled(false);
            vc.setAnswer1_1(0);
        } else if (vc.answersGQA[group][question][0] == 0) {
            vc.answersGQA[group][question][0] = -1;
            System.out.println(v.getId());
            System.out.println(v.toString());
        }
    }
    public void answer1_1_yes(View v){
        if (vc.answer != 0) {
            View v1 = findViewById(R.id.checkBox1_1_no);
            View v2 = findViewById(R.id.checkBox1_1_NA);
            v1.setEnabled(false);
            v2.setEnabled(false);
            vc.setAnswer1_1(0);
        } else if (vc.answer1_1 == 0) {
            vc.setAnswer1_1(-1);
        }
    }
    public void answer1_1_no(View v){
        if (vc.answer1_1 != 1) {
            View v1 = findViewById(R.id.checkBox1_1_yes);
            View v2 = findViewById(R.id.checkBox1_1_NA);
            v1.setEnabled(false);
            v2.setEnabled(false);
            vc.setAnswer1_1(1);
        } else if (vc.answer1_1 == 1) {
            vc.setAnswer1_1(-1);
        }
    }
    public void answer1_1_na(View v){
        if (vc.answer1_1 != 2) {
            View v1 = findViewById(R.id.checkBox1_1_yes);
            View v2 = findViewById(R.id.checkBox1_1_no);
            v1.setEnabled(false);
            v2.setEnabled(false);
            vc.setAnswer1_1(2);
        } else if (vc.answer1_1 == 2) {
            vc.setAnswer1_1(-1);
        }
    }

    public void answer1_2_yes(View v){
        if (vc.answer1_2 != 0) {
            View v1 = findViewById(R.id.checkBox1_2_no);
            View v2 = findViewById(R.id.checkBox1_2_NA);
            v1.setEnabled(false);
            v2.setEnabled(false);
            vc.setAnswer1_2(0);
        } else if (vc.answer1_2 == 0) {
            vc.setAnswer1_2(-1);
        }
    }
    public void answer1_2_no(View v){
        if (vc.answer1_2 != 1) {
            View v1 = findViewById(R.id.checkBox1_2_yes);
            View v2 = findViewById(R.id.checkBox1_2_NA);
            v1.setEnabled(false);
            v2.setEnabled(false);
            vc.setAnswer1_2(1);
        } else if (vc.answer1_2 == 1) {
            vc.setAnswer1_2(-1);
        }
    }
    public void answer1_2_na(View v){
        if (vc.answer1_2 != 2) {
            View v1 = findViewById(R.id.checkBox1_2_yes);
            View v2 = findViewById(R.id.checkBox1_2_no);
            v1.setEnabled(false);
            v2.setEnabled(false);
            vc.setAnswer1_2(2);
        } else if (vc.answer1_2 == 2) {
            vc.setAnswer1_2(-1);
        }
    }

*/
}