package com.example.cimfrblastguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button CalculatorMainActivity;
    private Button BlastHoleActivity;

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
                Intent intent = new Intent(MainActivity.this, BlastHolesActivity.class);
                startActivity(intent);
            }
        });
    }
}
