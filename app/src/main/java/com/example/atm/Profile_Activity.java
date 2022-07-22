package com.example.atm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile_Activity extends AppCompatActivity {
    Button SignOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        SignOut = findViewById(R.id.btn_SignOut);

        SignOut.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent intent = new Intent(Profile_Activity.this, MainActivity.class);
                                           startActivity(intent);
                                       }
                                   }
        );
    }
}