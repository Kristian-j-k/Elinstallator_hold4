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

        //Title is added to the xml
        ((TextView) findViewById(R.id.tittel1)).setText(vc.text1);
        ((TextView) findViewById(R.id.tittel2)).setText(vc.text2);
        ((TextView) findViewById(R.id.tittel3)).setText(vc.text3);
        ((TextView) findViewById(R.id.tittel4)).setText(vc.text4);
        ((TextView) findViewById(R.id.tittel5)).setText(vc.text5);
        ((TextView) findViewById(R.id.tittel6)).setText(vc.text6);

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
        textFields.add(13,(TextView)findViewById(R.id.text14));
        textFields.add(14,(TextView)findViewById(R.id.text15));
        textFields.add(15,(TextView)findViewById(R.id.text16));
        textFields.add(16,(TextView)findViewById(R.id.text17));
        textFields.add(17,(TextView)findViewById(R.id.text18));
        textFields.add(18,(TextView)findViewById(R.id.text19));
        textFields.add(19,(TextView)findViewById(R.id.text20));
        textFields.add(20,(TextView)findViewById(R.id.text21));
        textFields.add(21,(TextView)findViewById(R.id.text22));
        textFields.add(22,(TextView)findViewById(R.id.text23));
        textFields.add(23,(TextView)findViewById(R.id.text24));
        textFields.add(24,(TextView)findViewById(R.id.text25));
        textFields.add(25,(TextView)findViewById(R.id.text26));
        textFields.add(26,(TextView)findViewById(R.id.text27));
        textFields.add(27,(TextView)findViewById(R.id.text28));
        textFields.add(28,(TextView)findViewById(R.id.text29));
        textFields.add(29,(TextView)findViewById(R.id.text30));
        textFields.add(30,(TextView)findViewById(R.id.text31));
        textFields.add(31,(TextView)findViewById(R.id.text32));
        textFields.add(32,(TextView)findViewById(R.id.text33));
        textFields.add(33,(TextView)findViewById(R.id.text34));
        textFields.add(34,(TextView)findViewById(R.id.text35));
        textFields.add(35,(TextView)findViewById(R.id.text36));
        textFields.add(36,(TextView)findViewById(R.id.text37));
        textFields.add(37,(TextView)findViewById(R.id.text38));
        textFields.add(38,(TextView)findViewById(R.id.text39));



        // using the xml id, here the text from the class VerificationChart is set

        for (int i = 0; i < textFields.size(); i++) {
            textFields.get(i).setText(vc.questions.get(i));
        }



    }



//save all choices in verification_chart3.xml
    public void save(View v) {

        CheckBox[][] chek = new CheckBox[40][3];

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
        chek[13][0] = (CheckBox) findViewById(R.id.checkBox14_yes);
        chek[13][1] = (CheckBox) findViewById(R.id.checkBox14_no);
        chek[13][2] = (CheckBox) findViewById(R.id.checkBox14_NA);
        chek[14][0] = (CheckBox) findViewById(R.id.checkBox15_yes);
        chek[14][1] = (CheckBox) findViewById(R.id.checkBox15_no);
        chek[14][2] = (CheckBox) findViewById(R.id.checkBox15_NA);
        chek[15][0] = (CheckBox) findViewById(R.id.checkBox16_yes);
        chek[15][1] = (CheckBox) findViewById(R.id.checkBox16_no);
        chek[15][2] = (CheckBox) findViewById(R.id.checkBox16_NA);
        chek[16][0] = (CheckBox) findViewById(R.id.checkBox17_yes);
        chek[16][1] = (CheckBox) findViewById(R.id.checkBox17_no);
        chek[16][2] = (CheckBox) findViewById(R.id.checkBox17_NA);
        chek[17][0] = (CheckBox) findViewById(R.id.checkBox18_yes);
        chek[17][1] = (CheckBox) findViewById(R.id.checkBox18_no);
        chek[17][2] = (CheckBox) findViewById(R.id.checkBox18_NA);
        chek[18][0] = (CheckBox) findViewById(R.id.checkBox19_yes);
        chek[18][1] = (CheckBox) findViewById(R.id.checkBox19_no);
        chek[18][2] = (CheckBox) findViewById(R.id.checkBox19_NA);
        chek[19][0] = (CheckBox) findViewById(R.id.checkBox20_yes);
        chek[19][1] = (CheckBox) findViewById(R.id.checkBox20_no);
        chek[19][2] = (CheckBox) findViewById(R.id.checkBox20_NA);
        chek[20][0] = (CheckBox) findViewById(R.id.checkBox21_yes);
        chek[20][1] = (CheckBox) findViewById(R.id.checkBox21_no);
        chek[20][2] = (CheckBox) findViewById(R.id.checkBox21_NA);
        chek[21][0] = (CheckBox) findViewById(R.id.checkBox22_yes);
        chek[21][1] = (CheckBox) findViewById(R.id.checkBox22_no);
        chek[21][2] = (CheckBox) findViewById(R.id.checkBox22_NA);
        chek[22][0] = (CheckBox) findViewById(R.id.checkBox23_yes);
        chek[22][1] = (CheckBox) findViewById(R.id.checkBox23_no);
        chek[22][2] = (CheckBox) findViewById(R.id.checkBox23_NA);
        chek[23][0] = (CheckBox) findViewById(R.id.checkBox24_yes);
        chek[23][1] = (CheckBox) findViewById(R.id.checkBox24_no);
        chek[23][2] = (CheckBox) findViewById(R.id.checkBox24_NA);
        chek[24][0] = (CheckBox) findViewById(R.id.checkBox25_yes);
        chek[24][1] = (CheckBox) findViewById(R.id.checkBox25_no);
        chek[24][2] = (CheckBox) findViewById(R.id.checkBox25_NA);
        chek[25][0] = (CheckBox) findViewById(R.id.checkBox26_yes);
        chek[25][1] = (CheckBox) findViewById(R.id.checkBox26_no);
        chek[25][2] = (CheckBox) findViewById(R.id.checkBox26_NA);
        chek[26][0] = (CheckBox) findViewById(R.id.checkBox27_yes);
        chek[26][1] = (CheckBox) findViewById(R.id.checkBox27_no);
        chek[26][2] = (CheckBox) findViewById(R.id.checkBox27_NA);
        chek[27][0] = (CheckBox) findViewById(R.id.checkBox28_yes);
        chek[27][1] = (CheckBox) findViewById(R.id.checkBox28_no);
        chek[27][2] = (CheckBox) findViewById(R.id.checkBox28_NA);
        chek[28][0] = (CheckBox) findViewById(R.id.checkBox29_yes);
        chek[28][1] = (CheckBox) findViewById(R.id.checkBox29_no);
        chek[28][2] = (CheckBox) findViewById(R.id.checkBox29_NA);
        chek[29][0] = (CheckBox) findViewById(R.id.checkBox30_yes);
        chek[29][1] = (CheckBox) findViewById(R.id.checkBox30_no);
        chek[29][2] = (CheckBox) findViewById(R.id.checkBox30_NA);
        chek[30][0] = (CheckBox) findViewById(R.id.checkBox31_yes);
        chek[30][1] = (CheckBox) findViewById(R.id.checkBox31_no);
        chek[30][2] = (CheckBox) findViewById(R.id.checkBox31_NA);
        chek[31][0] = (CheckBox) findViewById(R.id.checkBox32_yes);
        chek[31][1] = (CheckBox) findViewById(R.id.checkBox32_no);
        chek[31][2] = (CheckBox) findViewById(R.id.checkBox32_NA);
        chek[32][0] = (CheckBox) findViewById(R.id.checkBox33_yes);
        chek[32][1] = (CheckBox) findViewById(R.id.checkBox33_no);
        chek[32][2] = (CheckBox) findViewById(R.id.checkBox33_NA);
        chek[33][0] = (CheckBox) findViewById(R.id.checkBox34_yes);
        chek[33][1] = (CheckBox) findViewById(R.id.checkBox34_no);
        chek[33][2] = (CheckBox) findViewById(R.id.checkBox34_NA);
        chek[34][0] = (CheckBox) findViewById(R.id.checkBox35_yes);
        chek[34][1] = (CheckBox) findViewById(R.id.checkBox35_no);
        chek[34][2] = (CheckBox) findViewById(R.id.checkBox35_NA);
        chek[35][0] = (CheckBox) findViewById(R.id.checkBox36_yes);
        chek[35][1] = (CheckBox) findViewById(R.id.checkBox36_no);
        chek[35][2] = (CheckBox) findViewById(R.id.checkBox36_NA);
        chek[36][0] = (CheckBox) findViewById(R.id.checkBox37_yes);
        chek[36][1] = (CheckBox) findViewById(R.id.checkBox37_no);
        chek[36][2] = (CheckBox) findViewById(R.id.checkBox37_NA);
        chek[37][0] = (CheckBox) findViewById(R.id.checkBox38_yes);
        chek[37][1] = (CheckBox) findViewById(R.id.checkBox38_no);
        chek[37][2] = (CheckBox) findViewById(R.id.checkBox38_NA);
        chek[38][0] = (CheckBox) findViewById(R.id.checkBox39_yes);
        chek[38][1] = (CheckBox) findViewById(R.id.checkBox39_no);
        chek[38][2] = (CheckBox) findViewById(R.id.checkBox39_NA);


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