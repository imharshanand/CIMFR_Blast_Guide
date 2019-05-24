package com.example.cimfrblastguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutMain extends AppCompatActivity {
    private Button Director;
    private Button Department;
    private Button Developers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_main);
        Director = (Button)findViewById(R.id.btnAboutDirector);
        Director.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMain.this, AboutAppActivity.class);
                startActivity(intent);
            }
        });
        Department=(Button)findViewById(R.id.btnAboutDepartment);
        Department.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMain.this, AboutDepartment.class);
                startActivity(intent);
            }
        });
        Developers=(Button)findViewById(R.id.btnAboutDevelopers);
        Developers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMain.this, AboutDevelopers.class);
                startActivity(intent);
            }
        });
    }
}
