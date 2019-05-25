package com.example.cimfrblastguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExplosiveMain extends AppCompatActivity {
    private Button BulkExp;
    private Button LargeDiaExp;
    private Button CastBoosterExp;
    private Button PermitExp;
    private Button ANFO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explosive_main);
        BulkExp = (Button)findViewById(R.id.btnBulkExplosive);
        LargeDiaExp = (Button)findViewById(R.id.btnLargeDiaExplosive);
        CastBoosterExp = (Button)findViewById(R.id.btnCastBooster);
        PermitExp = (Button)findViewById(R.id.btnPermitExplosive);
        ANFO = (Button)findViewById(R.id.btnANFOExp);

        BulkExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExplosiveMain.this, BulkExplosive.class);
                startActivity(intent);
            }
        });
        LargeDiaExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExplosiveMain.this, LargeDiaExplosive.class);
                startActivity(intent);
            }
        });
        CastBoosterExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExplosiveMain.this, CastBoostExplosive.class);
                startActivity(intent);
            }
        });
        PermitExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExplosiveMain.this, PermitExplosive.class);
                startActivity(intent);
            }
        });
        ANFO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExplosiveMain.this, ANFOExpo.class);
                startActivity(intent);
            }
        });
    }
}
