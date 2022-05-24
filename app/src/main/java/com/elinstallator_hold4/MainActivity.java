package com.elinstallator_hold4;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Error, Forgot_Password;
    EditText Username, Email, Password;
    Button Login, Registration;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText) findViewById(R.id.editLoginUser);
        Email = (EditText) findViewById(R.id.editEmail);
        Password = (EditText) findViewById(R.id.editLoginPass);
        Forgot_Password = (TextView) findViewById(R.id.forgotpass);

        Login = (Button) findViewById(R.id.btnLogin);
        Registration = (Button) findViewById(R.id.btnRegister);

        db = new DatabaseHelper(this);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = Username.getText().toString();
                String pass = Password.getText().toString();

                if (user.equals("") || pass.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please enter the Credentials", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Boolean result = db.checkUsernamePassword(user,pass);
                    if (result==true)
                    {
                        Intent intent = new Intent(getApplicationContext(),StartScreen.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        Registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToRegistration= new Intent(getApplicationContext(),Registration.class);
                startActivity(goToRegistration);

            }
        });

        /*Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String username= Username.getText().toString();
                String email= Email.getText().toString();
                String password= Password.getText().toString();
                Boolean res= db.checkUser(username, email, password);

                if (res = true){
                    Intent login = new Intent(getApplicationContext(), HomeScreen.class);
                    startActivity(login);
                }
                else {
                    Error = (TextView) findViewById(R.id.error);
                    Error.setText("invalid Username and Password");

                }
            }
        });*/


    }
}