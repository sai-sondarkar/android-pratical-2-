package com.example.sai.pratical2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText emailEditText,passwordEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUiElements();

        initUiInteraction();

    }

    public void initUiElements(){

        emailEditText = (EditText) findViewById(R.id.email);
        passwordEditText = (EditText ) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.loginButton);
    }

    public void initUiInteraction(){

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(emailEditText.getText().toString().equals("")||passwordEditText.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Please fill all the fields",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"Welcome - " + emailEditText.getText().toString() + " you are successfully signed in ",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
