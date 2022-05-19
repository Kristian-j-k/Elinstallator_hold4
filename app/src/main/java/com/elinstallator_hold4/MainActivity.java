package com.elinstallator_hold4;

import android.content.Intent;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView Error;
    EditText Username;
    EditText Email;
    EditText Password;
    Button Login;
    Button Registration;
    TextView Forgot_Password;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText) findViewById(R.id.editLoginUser);
        Email = (EditText) findViewById(R.id.editEmail);
        Password = (EditText) findViewById(R.id.editLoginPass);
        Forgot_Password = (TextView) findViewById(R.id.forgotpass);
        Login = (Button) findViewById(R.id.Loginbtn);
        Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String username= Username.getText().toString().trim();
                String email= Email.getText().toString().trim();
                String password= Password.getText().toString().trim();
                Boolean res= db.checkUser(username, email, password);

                if (res = true){
                    Intent login = new Intent(MainActivity.this, HomeScreen.class);
                    startActivity(login);
                }
                else {
                    Error = (TextView) findViewById(R.id.error);
                    Error.setText("invalid Username and Password");

                }
            }
        });

        Registration = (Button) findViewById(R.id.registerbtn);
        Registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistrationActivity();
            }
        });
    }

    private void openRegistrationActivity() {
        Intent registration = new Intent(MainActivity.this, Registration.class);
        startActivity(registration);
    }

}