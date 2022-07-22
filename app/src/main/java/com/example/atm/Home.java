package com.example.atm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home extends AppCompatActivity {
    Button Change_Pin, Check_Balance, Cash_Withdraw, View_Details, Cash_Deposit, Loan;
    TextView DisplayName;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Change_Pin = findViewById(R.id.change_pin);
        Check_Balance = findViewById(R.id.check_balance);
        Cash_Deposit = findViewById(R.id.cash_deposit);
        Cash_Withdraw = findViewById(R.id.cash_withdraw);
        View_Details = findViewById(R.id.view_details);
        Loan = findViewById(R.id.loan);

        DisplayName = findViewById(R.id.display_name);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_search:
                        Intent intentA = new Intent(Home.this, Search_activity.class);
                        startActivity(intentA);
                        return true;
                    case R.id.action_notification:
                        Intent intentB = new Intent(Home.this, Notification.class);
                        startActivity(intentB);
                        return true;
                    case R.id.action_profile:
                        Intent intentC = new Intent(Home.this, Profile_Activity.class);
                        startActivity(intentC);
                        return true;

                }
                return false;
            }
        });

        Change_Pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Home.this, ChangePin.class);
                startActivity(intent1);
            }
        });

        View_Details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Home.this, ViewAccountDetails.class);
                startActivity(intent2);
            }
        });

    }
}