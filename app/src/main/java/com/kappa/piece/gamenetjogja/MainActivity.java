package com.kappa.piece.gamenetjogja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnNear, btnCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNear = (Button)findViewById(R.id.btnNear);
        btnCustom = (Button)findViewById(R.id.btnCustom);

        btnCustom.setOnClickListener(this);
        btnNear.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNear:
                Intent intent = new Intent(this, NearList.class);
                startActivity(intent);
                break;
            case R.id.btnCustom:
                Intent intent1 = new Intent(this, CustomActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
