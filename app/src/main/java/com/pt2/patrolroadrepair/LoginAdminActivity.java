package com.pt2.patrolroadrepair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginAdminActivity extends AppCompatActivity {

    Button btn_login_admin,btn_register_admin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);

        //inisial tombol
        btn_login_admin = findViewById(R.id.btn_login_admin);
        btn_register_admin = findViewById(R.id.btn_register_admin);

        //function tombol
        btn_login_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent admin = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(admin);
            }
        });

        btn_register_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent user = new Intent(getApplicationContext(),RegisterAdminActivity.class);
                startActivity(user);
            }
        });

    }
}
