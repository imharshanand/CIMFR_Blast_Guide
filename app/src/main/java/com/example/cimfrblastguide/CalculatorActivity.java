package com.example.cimfrblastguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculatorActivity extends AppCompatActivity {

    private Button volumeOfRock;
    private Button Vibration;
    private Button MassCharge;
    private Button EstDesignPara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Vibration = (Button)findViewById(R.id.btnVibrationCalculatorActivity);
        Vibration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalculatorActivity.this, VibrationActivity.class);
                startActivity(intent);
            }
        });

        volumeOfRock = (Button)findViewById(R.id.btnVolCalCalculatorActivity);
        volumeOfRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalculatorActivity.this, VolumeOfRockActivity.class);
                startActivity(intent);
            }
        });

        MassCharge = (Button)findViewById(R.id.btnMassChargeCalculatorActivity);
        MassCharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalculatorActivity.this, MassChargeActivity.class);
                startActivity(intent);
            }
        });
        EstDesignPara = (Button)findViewById(R.id.btnEstDesignParaCalculatorActivity);
        EstDesignPara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalculatorActivity.this, EstDesignPara.class);
                startActivity(intent);
            }
        });

    }
}
