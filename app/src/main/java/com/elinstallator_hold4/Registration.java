package com.elinstallator_hold4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    EditText username,email,password,repassword;
    TextView error;
    Button btnSignUp, btnLogin;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        username = (EditText) findViewById(R.id.editUserName);
        email = (EditText) findViewById(R.id.editEmail);
        password = (EditText) findViewById(R.id.editPassword);
        repassword = (EditText) findViewById(R.id.editRePassword);

        btnSignUp = (Button) findViewById(R.id.btnSignUpReg);
        btnLogin = (Button) findViewById(R.id.btnLoginReg);

        db = new DatabaseHelper(this);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String mail=email.getText().toString();
                String pass=password.getText().toString();
                String repass= repassword.getText().toString();

                if (user.equals("") || mail.equals("") || pass.equals("") || repass.equals(""))
                {
                    Toast.makeText(Registration.this, "Fill al the fields.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (pass.equals(repass))
                    {
                        Boolean usercheckResult = db.checkUser(user);
                        if(usercheckResult == false)
                        {
                            Boolean regResult = db.addUser(user,mail,pass);
                            if (regResult == true)
                            {
                                Toast.makeText(Registration.this, "Registration Successful.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(Registration.this, "Registration Failed.", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(Registration.this, "User already exists. \n Please sign in.", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(Registration.this, "Password not matching.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
