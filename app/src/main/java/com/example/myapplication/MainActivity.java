package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button signUpBtn;
    private TextView signUpTv;


    // true = Sign Up mode
    // false = Login mode
    private boolean isSignUp = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.signup_linear);

        signUpBtn = findViewById(R.id.signUpBtn);
        signUpTv = findViewById(R.id.signUpTv);

        // Button click
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
//                if (isSignUp) {
//
//                    // Change to Login
//                    isSignUp = false;
//
//                    signUpTv.setText("LOGIN");
//                    signUpBtn.setText("Do u want to Signup");
//
//                } else {
//
//                    // Change back to Sign Up
//                    isSignUp = true;
//
//                    signUpTv.setText("SIGN UP");
//                    signUpBtn.setText("Do u want to Logiin");
//
//
//
//
//                }
                Intent i = new Intent(MainActivity.this, LifeCycleActivity.class);
                startActivity(i);



//                Toast.makeText(
//                        MainActivity.this,
//                        "Button pressed",
//                        Toast.LENGTH_SHORT
//                ).show();
            }
        });
    }
}
