package com.example.cimfrblastguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BlastInitSystem extends AppCompatActivity {
    private Button ElectricD;
    private Button DetCordD;
    private Button NonelD;
    private Button ElectronicD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blast_init_system);
        ElectricD = (Button) findViewById(R.id.ElectricInitSys);
        DetCordD = (Button) findViewById(R.id.DetInitSys);
        NonelD = (Button) findViewById(R.id.NonelInitSys);
        ElectronicD =(Button)findViewById(R.id.ElectronicInitSys);

        ElectricD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BlastInitSystem.this, ElectricInitSystem.class);
                startActivity(intent);
            }
        });

        DetCordD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BlastInitSystem.this, DetCordInitSystem.class);
                startActivity(intent);
            }
        });

        NonelD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BlastInitSystem.this, NonelInitSystem.class);
                startActivity(intent);
            }
        });

        ElectronicD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BlastInitSystem.this, ElectronicInitSystem.class);
                startActivity(intent);
            }
        });
    }
}
