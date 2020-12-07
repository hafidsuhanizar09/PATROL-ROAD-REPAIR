package com.pt2.patrolroadrepair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginUserActivity extends AppCompatActivity {

    Button btn_register,btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        //inisial tombol
        btn_register = findViewById(R.id.btn_register);
        btn_login = findViewById(R.id.btn_login);

        //function tombol
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent admin = new Intent(getApplicationContext(),RegisterUserActivity.class);
                startActivity(admin);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent user = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(user);
            }
        });
    }
}
