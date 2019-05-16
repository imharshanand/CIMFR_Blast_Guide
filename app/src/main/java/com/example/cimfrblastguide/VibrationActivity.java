package com.example.cimfrblastguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class VibrationActivity extends AppCompatActivity {

    private Button VibCal;
    private EditText K;
    private EditText Q;
    private EditText D;
    private EditText b;
    private TextView Res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibration);

        VibCal = (Button)findViewById(R.id.btnVibCalVibrationActivity);
        K=(EditText)findViewById(R.id.etK);
        Q=(EditText)findViewById(R.id.etQ);
        D=(EditText)findViewById(R.id.etD);
        b=(EditText)findViewById(R.id.etb);
        Res = (TextView)findViewById(R.id.tvVibResVibrationActivity);

        VibCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(K.getText().toString().isEmpty() || Q.getText().toString().isEmpty() || D.getText().toString().isEmpty() || b.getText().toString().isEmpty())
                {
                    Res.setText("Please enter all values");
                }
                else
                {
                    double KVal = Double.parseDouble(K.getText().toString());
                    double QVal = Double.parseDouble(Q.getText().toString());
                    double DVal = Double.parseDouble(D.getText().toString());
                    double bVal = Double.parseDouble(b.getText().toString());

                    double result = KVal*((Math.pow(DVal / (Math.sqrt(QVal)) , (-1 * bVal))));

                    DecimalFormat df = new DecimalFormat("#.####");
                    Res.setText(df.format(result) + "");
                }
            }
        });

    }
}
