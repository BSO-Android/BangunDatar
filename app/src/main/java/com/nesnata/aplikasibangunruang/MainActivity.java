package com.nesnata.aplikasibangunruang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPersegi, btnPersegiPanjang, btnSegitiga, btnLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPersegi = (Button) findViewById(R.id.btn_persegi);
        btnPersegiPanjang = (Button) findViewById(R.id.btn_persegi_panjang);
        btnSegitiga = (Button) findViewById(R.id.btn_segitiga);
        btnLingkaran = (Button) findViewById(R.id.btn_lingkaran);

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PersegiActivity.class);
                startActivity(i);
            }
        });

        btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PersegiPanjangActivity.class);
                startActivity(i);
            }
        });

        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SegitigaActivity.class);
                startActivity(i);
            }
        });

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), LingkaranActivity.class);
                startActivity(i);
            }
        });
    }
}
