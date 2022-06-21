package com.elinstallator_hold4;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VcActivity extends AppCompatActivity  {


    ArrayList<VerificationChartModel> verificationChartModels = new ArrayList<>();
    public Button button;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vc);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setVerificationChartModels();

        QARecyclerViewAdapter adapter = new QARecyclerViewAdapter(this, verificationChartModels);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//Database call
        DataBaseHelper db = DataBaseHelper.getInstance(this); // opretter database

        SQLiteDatabase d1 = db.getWritableDatabase();


        //sender spørgsmål til db
        PreDefinedVerificationChart pVC = new PreDefinedVerificationChart();
        for (int i = 0; i < pVC.questions.size(); i++) {
            String TEST_SPØRGSMÅL = pVC.questions.get(i);
            d1.execSQL("INSERT INTO QUESTIONS (QUESTION) VALUES (\"" + TEST_SPØRGSMÅL + "\")");
        }


        //   d1.execSQL(DataBaseHelper.CREATE_ROW_IN_VC_TABLE);
/*

        for (int i = 0; i < pVC.questions.size(); i++) {
        d1.execSQL("INSERT INTO QUESTIONS (QUESTION) VALUES ("+pVC.questions.get(i)+")",null);
            System.out.println("test fra VcActivity "+pVC.questions.get(i));
       }*/

   //     Cursor cursorCourses = d2.rawQuery("SELECT * FROM  VC where installation = 10", null);

  //      System.out.println("test for db "+cursorCourses.getString(1)); //todo ændre til at hente til tjekskemaer


    /*    button = (Button) findViewById(R.id.button_send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VcActivity.this,SendEmail.class);
                startActivity(intent);
            }
        });*/




    }

    //sets all the questions on the verification charts
    private void setVerificationChartModels(){


        //String[] questionsTexts = getResources().getStringArray(R.array.questions_full_txt);
        //String[] aminoacidAbbreviation = getResources().getStringArray(R.array.amino_acids_one_letter_txt);

        DataBaseHelper db = DataBaseHelper.getInstance(this); // opretter database
        SQLiteDatabase d2 = db.getReadableDatabase();
        Cursor c = d2.rawQuery("SELECT * FROM QUESTIONS ", null);
        //   c.moveToFirst();
        if (c.moveToFirst()){
            do {
                // Passing values
                String column1 = c.getString(0);
                String column2 = c.getString(1);
                verificationChartModels.add(new VerificationChartModel(c.getString(1)));

                // Do something Here with values
                System.out.println("test "+column1+" "+column2+" end");
            } while(c.moveToNext());
        }
        c.close();
/*
        for (int i = 0; i < questionsTexts.length; i++) {
            verificationChartModels.add(new VerificationChartModel(questionsTexts[i]));
        }*/



/*
        PreDefinedVerificationChart pvc = new PreDefinedVerificationChart();
        String[] questions = new String[pvc.questions.size()];
        for (int i = 0; i < pvc.questions.size(); i++) {
            questions[i] = pvc.questions.get(i);

            }

        for (int i = 0; i <questions.length ; i++) {
            questionAnswer.add(new QuestionAnswerModel(questions[i],"Svar "+i));
        }*/

/*        Button buttonYes = findViewById(R.id.radioButton_Yes);
        Button buttonNo = findViewById(R.id.radioButton_No);
        buttonYes.setOnClickListener(this);
        buttonNo.setOnClickListener(this);
        }

    @Override
    public void onClick(View view) {

            switch (view.getId()){
                case R.id.radioButton_Yes:
                Toast.makeText(this,"button yes clicked", Toast.LENGTH_LONG).show();
                case R.id.radioButton_No:
                    Toast.makeText(this,"button no clicked", Toast.LENGTH_LONG).show();
            }
*/
    }
}
