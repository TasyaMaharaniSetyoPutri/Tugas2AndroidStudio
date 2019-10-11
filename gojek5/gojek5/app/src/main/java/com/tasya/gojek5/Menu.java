package com.tasya.gojek5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {
    Button btnInstantCourier, btnGofood, btnTransport, btnShopping, btnNavbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnInstantCourier = findViewById(R.id.btn_instantcourier);
        btnGofood = findViewById(R.id.btn_gofood);
        btnTransport = findViewById(R.id.btn_transport);
        btnShopping = findViewById(R.id.btn_shopping);
        btnNavbar = findViewById(R.id.btn_navbar);

        btnInstantCourier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(Menu.this, InstantCourier.class);
                startActivity(move);
            }
        });
        btnGofood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(Menu.this, GoFood.class);
                startActivity(move);
            }
        });
        btnTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(Menu.this, Transport.class);
                startActivity(move);
            }
        });
        btnShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(Menu.this, Shopping.class);
                startActivity(move);
            }
        });
        btnNavbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ini adalah Toast Navigasi ",Toast.LENGTH_LONG).show();
            }
        });
    }
}
