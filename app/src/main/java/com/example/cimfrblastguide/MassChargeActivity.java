package com.example.cimfrblastguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MassChargeActivity extends AppCompatActivity {
    private Button Cal;
    private TextView Res;
    private EditText BenchHeight;
    private EditText Stemming;
    private EditText LinearCharge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass_charge);

        Cal = (Button)findViewById(R.id.btnMassChargeCalculate);
        Res = (TextView)findViewById(R.id.tvMassChargeRes);
        BenchHeight = (EditText)findViewById(R.id.etBenchHeightMassCharge);
        Stemming = (EditText)findViewById(R.id.etStemmingMassCharge);
        LinearCharge = (EditText)findViewById(R.id.etLinearChargeMassCharge);

        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(BenchHeight.getText().toString().isEmpty() || Stemming.getText().toString().isEmpty() || LinearCharge.getText().toString().isEmpty())
                {
                    Res.setText("Please enter all values");
                }
                else {
                    double BH = Double.parseDouble(BenchHeight.getText().toString());
                    double Stem = Double.parseDouble(Stemming.getText().toString());
                    double LC = Double.parseDouble(LinearCharge.getText().toString());
                    double Qn = (BH - Stem) * LC;
                    Res.setText(Qn + " kg");
                }

            }
        });
    }
}
