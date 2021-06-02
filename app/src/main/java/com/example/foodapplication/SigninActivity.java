package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SigninActivity extends AppCompatActivity {

    public void signupPage(View view){

        Intent intent = new Intent(SigninActivity.this,SignupActivity.class);
        startActivity(intent);

    }

    TextView signupTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        signupTextView = (TextView)findViewById(R.id.loginTextView);

        getSupportActionBar().setTitle("Login");
    }
}