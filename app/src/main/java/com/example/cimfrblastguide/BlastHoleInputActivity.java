package com.example.cimfrblastguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BlastHoleInputActivity extends AppCompatActivity {
    private Button CalBlastHoleInput;
    private EditText ETNumCol;
    private EditText ETInitial;
    private EditText ETDelayCol;
    private EditText ETDelayR01;

    private String strRowValues;
    private Button AddRow;
    String addRow="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blast_hole_input);
        CalBlastHoleInput = (Button)findViewById(R.id.btnCalculateBlastHoleInputActivity);
        ETNumCol = (EditText)findViewById(R.id.etNumColBlastLay);
        ETInitial = (EditText)findViewById(R.id.etPtInitBlastLay);
        ETDelayCol = (EditText)findViewById(R.id.etDelayColBlastLay);
        ETDelayR01 = (EditText)findViewById(R.id.etDelayR01BlastLay);

        AddRow = (Button)findViewById(R.id.btnAddRowValue);
        AddRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btnAddRows = ETDelayR01.getText().toString().trim();
                addRow = addRow + btnAddRows + " ";
                ETDelayR01.setText("");
            }
        });

        CalBlastHoleInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String col = ETNumCol.getText().toString();
                String ini = ETInitial.getText().toString();
                String delayCol = ETDelayCol.getText().toString();
                //String delay01 = ETDelayR01.getText().toString();

                String addRowTransfer = addRow;

                Intent intent = new Intent(BlastHoleInputActivity.this, BlastHolesActivity.class);
                intent.putExtra("passcol", col);
                intent.putExtra("passini", ini);
                intent.putExtra("passdelayCol", delayCol);
                intent.putExtra("rowAddPass",addRowTransfer);

                startActivity(intent);
            }
        });
    }
}
