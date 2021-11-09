package com.example.mc_assignment3_bsef18a539;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnActivity extends AppCompatActivity {

    Button btnHalqiyah,btnLahatiyah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

    btnHalqiyah=(Button) findViewById(R.id.btnHalqiyah);
        btnLahatiyah=(Button) findViewById(R.id.btnLahatiyah);
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
    }
}