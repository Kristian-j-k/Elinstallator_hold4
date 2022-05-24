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
    private EditText mEditTextTo;
    private EditText mEditTextSubject;
    private EditText mEditTextMessage;

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
}
