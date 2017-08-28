package com.example.sai.pratical2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class loginScreem extends AppCompatActivity {

    String name;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screem);

        Bundle bundle = getIntent().getExtras();

        textView = (TextView) findViewById(R.id.textView);

        if(bundle.getString("Name")!= null)
        {
            //TODO here get the string stored in the string variable and do
            // setText() on userName
            name = bundle.getString("Name");
            textView.setText(name);
        }

    }
}
