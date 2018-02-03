package com.example.widya.nimadepradnyadianitaw_1202150236_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Menu, Pesanan;
    Button btEatbus, btAbnormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Menu = findViewById(R.id.editText1);
        Pesanan = findViewById(R.id.editText2);
        btEatbus = findViewById(R.id.button1);
        btAbnormal = findViewById(R.id.button2);

        btEatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ganti = new Intent (MainActivity.this, Main2Activity.class);
                ganti.putExtra( "lokasi", "Eatbus");
                ganti.putExtra("menu", Menu.getText().toString());
                ganti.putExtra("jmlmakanan", Pesanan.getText().toString());
                ganti.putExtra("total", "50000");
                startActivity(ganti);

            }
        });
        btAbnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ganti = new Intent (MainActivity.this, Main2Activity.class);
                ganti.putExtra("lokasi", "Abnormal");
                ganti.putExtra("menu", Menu.getText().toString());
                ganti.putExtra("jmlmakanan", Pesanan.getText().toString());
                ganti.putExtra("total","30000");
                startActivity(ganti);
            }
        });
    }
}
