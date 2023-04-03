package com.example.endeus_copy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class resep extends AppCompatActivity {


    public ImageView home;
    public ImageView resep;
    public ImageView kulkas;
    public ImageView promo;
    public ImageView profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep);

        home = findViewById(R.id.home);
        resep = findViewById(R.id.resep);
        kulkas = findViewById(R.id.kulkas);
        promo = findViewById(R.id.promo);
        profil = findViewById(R.id.profil);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(itn);
                finish();
            }
        });


        resep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),resep.class);
                startActivity(itn);
                finish();
            }
        });

        kulkas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),kulkas.class);
                startActivity(itn);
                finish();
            }
        });

        promo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),promo.class);
                startActivity(itn);
                finish();
            }
        });
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),profil.class);
                startActivity(itn);
                finish();
            }
        });


    }
}