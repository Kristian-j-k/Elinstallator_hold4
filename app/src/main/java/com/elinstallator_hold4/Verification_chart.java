package com.elinstallator_hold4;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Verification_chart extends AppCompatActivity {

    private int radio =-1;
    String tekst = "Er beskyttelsesmetode korrekt valgt i forhold til installationstype og systemjordning?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification_chart);

    }

    public void save(View v) {
        //boolean check = ((RadioButton) v).isChecked();

      //  System.out.println(((RadioButton) v).getText());


        System.out.println("tjek");
        //System.out.println(radioGroup1.g);

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