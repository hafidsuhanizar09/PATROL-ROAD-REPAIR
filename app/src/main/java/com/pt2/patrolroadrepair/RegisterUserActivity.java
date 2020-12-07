package com.pt2.patrolroadrepair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterUserActivity extends AppCompatActivity {

    Button btn_register, btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        //inisial tombol
        btn_register = findViewById(R.id.fab_register);
        btn_login = findViewById(R.id.fab_login);

        //function tombol
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent admin = new Intent(getApplicationContext(), LoginUserActivity.class);
                startActivity(admin);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent user = new Intent(getApplicationContext(), LoginUserActivity.class);
                startActivity(user);
            }
        });

    }
}
