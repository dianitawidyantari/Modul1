package com.example.widya.nimadepradnyadianitaw_1202150236_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView NamaLokasi;
    TextView NamaMenu;
    TextView Porsi;
    TextView TotHarga;
    private final int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        NamaLokasi = findViewById(R.id.textView4);
        NamaMenu = findViewById(R.id.textView6);
        Porsi = findViewById(R.id.textView8);
        TotHarga = findViewById(R.id.textView10);

        Intent main1 = getIntent();

        String tempat=main1.getStringExtra("lokasi");
        String nmMenu=main1.getStringExtra("menu");
        String porsimkn = main1.getStringExtra("jmlmakanan");
        String jmlharga = main1.getStringExtra("total");

        int TotalHarga = Integer.valueOf(jmlharga) * Integer.valueOf(porsimkn);

        NamaLokasi.setText(tempat);
        NamaMenu.setText(nmMenu);
        Porsi.setText(porsimkn);
        TotHarga.setText(String.valueOf(TotalHarga));

        if (TotalHarga <= uang) {
            Toast.makeText(this, "Makan malam disini? Bisaaaa", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Makan malam disini? Jangaaaaannn", Toast.LENGTH_LONG).show();
        }

    }
}
