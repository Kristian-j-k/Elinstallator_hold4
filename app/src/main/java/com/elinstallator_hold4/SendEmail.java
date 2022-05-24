package com.elinstallator_hold4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class SendEmail extends AppCompatActivity {
    private EditText mEditTextTo, mEditTextSubject, mEditTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        mEditTextTo = findViewById(R.id.edit_text_til);
        mEditTextSubject = findViewById(R.id.edit_text_titel);
        mEditTextMessage = findViewById(R.id.edit_text_besked);

        Button buttonSend = findViewById(R.id.button_send);
        buttonSend.setOnClickListener(new View.OnClickListener() { //Send mail button funktionalitet
            @Override
            public void onClick(View view) {
                sendMail();
            }
        });
    }

    public void sendMail() {
        String fileName = "navn.pdf"; //TODO skal ændres på
        File fileLocation = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), fileName);
        Uri uriPath = Uri.fromFile(fileLocation);

        String recipientList = mEditTextTo.getText().toString();
        String[] recipients = recipientList.split(","); //Splitter text med et "," (komma) for at kunne sende mail til flere forskellige emails. Datastruktur array.
        String subject = mEditTextSubject.getText().toString();
        String message = mEditTextMessage.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,recipients); //Tager string arrayed med listen over forskellige emails.
        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent.putExtra(Intent.EXTRA_TEXT,message);
        //Tilføjer fil til mail
        intent.putExtra(Intent.EXTRA_STREAM, uriPath);

        intent.setType("vnd.android.cursor.dir/email"); //message/rfc822 er koden til email apps
        startActivity(Intent.createChooser(intent,"Vælg en email app"));
    }
}
