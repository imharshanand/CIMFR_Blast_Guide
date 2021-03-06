package com.example.cimfrblastguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button CalculatorMainActivity;
    private Button BlastHoleActivity;
    private Button AboutApp;
    private Button Regulatory;
    private Button Explosive;
    private Button EstPara;
    private Button BlastInitSystem;
    private Button Disclaimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalculatorMainActivity = (Button)findViewById(R.id.btnCalculatorMainActivity);
        CalculatorMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(intent);
            }
        });

        BlastHoleActivity = (Button)findViewById(R.id.btnBlastActivity);
        BlastHoleActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BlastHoleInputActivity.class);
                startActivity(intent);
            }
        });

        AboutApp = (Button)findViewById(R.id.btnAboutAppActivity);
        AboutApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutMain.class);
                startActivity(intent);
            }
        });
        Regulatory = (Button)findViewById(R.id.btnRegulatory);
        Regulatory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Regulatory.class);
                startActivity(intent);

            }
        });
        Explosive = (Button)findViewById(R.id.btnExplosiveMain);
        Explosive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExplosiveMain.class);
                startActivity(intent);
            }
        });
        EstPara = (Button)findViewById(R.id.btnBlastDesignPara);
        EstPara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EstDesignPara.class);
                startActivity(intent);
            }
        });
        BlastInitSystem = (Button)findViewById(R.id.btnBlastInitSystem);
        BlastInitSystem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BlastInitSystem.class);
                startActivity(intent);
            }
        });
        Disclaimer = (Button)findViewById(R.id.btnDisclaimer);
        Disclaimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, disclaimer.class);
                startActivity(intent);
            }
        });
    }
}
