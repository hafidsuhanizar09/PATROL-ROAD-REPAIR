package com.pt2.patrolroadrepair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button btn_laporkan,btn_Berita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //inisial tombol
        btn_laporkan = findViewById(R.id.btn_laporkan);
        btn_Berita = findViewById(R.id.btn_berita);

        //function tombol
        btn_laporkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent laporkan = new Intent(getApplicationContext(),InputJalanActivity.class);
                startActivity(laporkan);
            }
        });

        btn_Berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent berita = new Intent(getApplicationContext(),BeritaActivity.class);
                startActivity(berita);
            }
        });

    }
}
