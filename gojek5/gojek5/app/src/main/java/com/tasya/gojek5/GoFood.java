package com.tasya.gojek5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GoFood extends AppCompatActivity {

    Button btnBack;
    TextView txtGf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);

        btnBack = findViewById(R.id.btn_back);
        txtGf = findViewById(R.id.txt);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        txtGf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Ini adalah Toast Menu GO-FOOD ",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void onBackPressed(){
        super.onBackPressed();
    }
}
