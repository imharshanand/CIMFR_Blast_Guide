package com.example.cimfrblastguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BlastHoleInputActivity extends AppCompatActivity {
    private Button CalBlastHoleInput;
    private EditText ETNumCol;
    private EditText ETInitial;
    private EditText ETDelayCol;
    private EditText ETDelayR01;
    private EditText ETDelayR12;
    private EditText ETDelayR23;
    private EditText ETDelayR34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blast_hole_input);
        CalBlastHoleInput = (Button)findViewById(R.id.btnCalculateBlastHoleInputActivity);
        ETNumCol = (EditText)findViewById(R.id.etNumColBlastLay);
        ETInitial = (EditText)findViewById(R.id.etPtInitBlastLay);
        ETDelayCol = (EditText)findViewById(R.id.etDelayColBlastLay);
        ETDelayR01 = (EditText)findViewById(R.id.etDelayR01BlastLay);
        ETDelayR12 = (EditText)findViewById(R.id.etDelayR12BlastLay);
        ETDelayR23 = (EditText)findViewById(R.id.etDelayR23BlastLay);
        ETDelayR34 = (EditText)findViewById(R.id.etDelayR34BlastLay);

        CalBlastHoleInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String col = ETNumCol.getText().toString();
                String ini = ETInitial.getText().toString();
                String delayCol = ETDelayCol.getText().toString();
                String delay01 = ETDelayR01.getText().toString();
                String delay12 = ETDelayR12.getText().toString();
                String delay23 = ETDelayR23.getText().toString();
                String delay34 = ETDelayR34.getText().toString();

                Intent intent = new Intent(BlastHoleInputActivity.this, BlastHolesActivity.class);
                intent.putExtra("passcol", col);
                intent.putExtra("passini", ini);
                intent.putExtra("passdelayCol", delayCol);
                intent.putExtra("passdelay01", delay01);
                intent.putExtra("passcoldelay12", delay12);
                intent.putExtra("passcoldelay23",delay23);
                intent.putExtra("passdelay34", delay34);

                startActivity(intent);
            }
        });
    }
}
