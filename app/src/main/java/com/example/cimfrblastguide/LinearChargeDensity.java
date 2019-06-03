package com.example.cimfrblastguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class LinearChargeDensity extends AppCompatActivity {
    private Button Cal;
    private EditText CD;
    private EditText DE;
    private TextView Res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_charge_density);
        Cal = (Button)findViewById(R.id.btnCalLinearCharge);
        CD = (EditText)findViewById(R.id.etChargeDiaLinearCharge);
        DE = (EditText)findViewById(R.id.etDensityExpoLinearCharge);
        Res = (TextView)findViewById(R.id.tvResultLinearCharge);

        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CD.getText().toString().isEmpty())
                    Res.setText("Enter Charge Diameter");
                else if (DE.getText().toString().isEmpty())
                    Res.setText("Enter Density of Explosive");
                else
                {
                    double CDNum = Double.parseDouble(CD.getText().toString());
                    double DENum = Double.parseDouble(DE.getText().toString());
                    double Result = (Math.PI*CDNum*CDNum*DENum)/4000.00;

                    DecimalFormat d1 = new DecimalFormat("#.####");
                    Res.setText(d1.format(Result) + " kg/m");
                }
            }
        });
    }
}
