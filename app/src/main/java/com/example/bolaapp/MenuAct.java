package com.example.bolaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MenuAct extends AppCompatActivity {

    LinearLayout bntClub,btnJadwal,btnItuApa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bntClub = findViewById(R.id.clubBtn);
        btnJadwal = findViewById(R.id.btnJadwal);
        btnItuApa = findViewById(R.id.btnApaitu);

        bntClub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuAct.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Fitur ini belum tersedia", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnItuApa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuAct.this, ApaituAct.class);
                startActivity(intent);
            }
        });
    }
}
