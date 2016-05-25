package com.kappa.piece.gamenetjogja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class CustomActivity extends AppCompatActivity {
    Spinner spDaerah, spHarga,spFasilitas;
    ArrayAdapter<CharSequence> adapter, adapter1, adapter2;
    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        spDaerah = (Spinner)findViewById(R.id.spDaerah);
        adapter = ArrayAdapter.createFromResource(this, R.array.itemDaerah, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spDaerah.setAdapter(adapter);
        spHarga = (Spinner)findViewById(R.id.spDaerah);
        adapter1 = ArrayAdapter.createFromResource(this, R.array.itemHarga, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spHarga.setAdapter(adapter1);
        spFasilitas = (Spinner)findViewById(R.id.spFasilitas);
        adapter2 = ArrayAdapter.createFromResource(this, R.array.itemFasilitas, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spFasilitas.setAdapter(adapter2);

        btnSearch = (Button)findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SelectedGameNetNear.class);
                startActivity(intent);
            }
        });
    }
}
