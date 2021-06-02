package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    public void loginPage(View view){

        Intent intent = new Intent(SignupActivity.this,SigninActivity.class);
        startActivity(intent);

    }

    TextView loginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        loginTextView = (TextView)findViewById(R.id.loginTextView);

        getSupportActionBar().setTitle("Signup");
    }
}