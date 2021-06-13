package com.codewithkush.firebaseloginsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean myEmail = email.getText().toString().isEmpty();
        boolean myPassword = password.getText().toString().isEmpty();
        if (myEmail){
            Toast.makeText(this, "Email is required", Toast.LENGTH_SHORT).show();
        }
        if (myPassword){
            Toast.makeText(this, "Password is required", Toast.LENGTH_SHORT).show();
        }
    }
}