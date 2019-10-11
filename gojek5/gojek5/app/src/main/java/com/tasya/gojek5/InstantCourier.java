package com.tasya.gojek5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InstantCourier extends AppCompatActivity {

    Button btnBack;
    TextView txtIc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instant_courier);

        btnBack = findViewById(R.id.btn_back);
        txtIc = findViewById(R.id.txt);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        txtIc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ini adalah Toast Menu Pengiriman ",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void onBackPressed(){
        super.onBackPressed();
    }
}
