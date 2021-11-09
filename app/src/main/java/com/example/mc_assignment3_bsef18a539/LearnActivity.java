package com.example.mc_assignment3_bsef18a539;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnActivity extends AppCompatActivity {

    Button btnHalqiyah,btnLahatiyah,btnLisaveyah,btnShajariyahHaafiyah,btnTarfiyah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

    btnHalqiyah=(Button) findViewById(R.id.btnHalqiyah);
        btnLahatiyah=(Button) findViewById(R.id.btnLahatiyah);
        btnLisaveyah=(Button) findViewById(R.id.btnLisaveyah);
        btnShajariyahHaafiyah=(Button) findViewById(R.id.btnShajariyahHaafiyah);
        btnTarfiyah=(Button) findViewById(R.id.btnTarfiyah);
        btnHalqiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LearnActivity.this,learn_Halqiyah.class);
                startActivity(intent);
            }
        });
        btnLahatiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LearnActivity.this,learn_Lahatiyah.class);
                startActivity(intent);
            }
        });
        btnLisaveyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LearnActivity.this,learn_Lisaveyah.class);
                startActivity(intent);
            }
        });
        btnShajariyahHaafiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LearnActivity.this,learn_Shajariyah_Haafiyah.class);
                startActivity(intent);
            }
        });
        btnTarfiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LearnActivity.this,learn_Tarfiyah.class);
                startActivity(intent);
            }
        });
    }
}