package com.example.cimfrblastguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class BlastHolesActivity extends AppCompatActivity {

    private Button DisplayHoles;
    private TextView TVDisplayHole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blast_holes);
        DisplayHoles = (Button)findViewById(R.id.btnDisplayBlastHoleActivity);
        TVDisplayHole = (TextView)findViewById(R.id.tvDisplayHoles);
        DisplayHoles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                String ini = intent.getStringExtra("passini");
                String delayCol = intent.getStringExtra("passdelayCol");
                String delay01 = intent.getStringExtra("passdelay01");
                String delay12 = intent.getStringExtra("passcoldelay12");
                String delay23 = intent.getStringExtra("passcoldelay23");
                String delay34 = intent.getStringExtra("passdelay34");
                String col = intent.getStringExtra("passcol");

                int row=5;

                int colDelay = Integer.parseInt(delayCol);
                int cols = Integer.parseInt(col);

                int[][] matrix = new int[row][cols];
                matrix[0][0]= Integer.parseInt(ini);
                int D01= Integer.parseInt(delay01);
                int D12 = Integer.parseInt(delay12);
                int D23 = Integer.parseInt(delay23);
                int D34 = Integer.parseInt(delay34);
                {
                    for (int i = 1; i < cols; i++)
                    {
                        matrix[0][i]=matrix[0][i-1]+colDelay;
                    }

                    for (int i = 0; i < cols; i++)
                    {
                        matrix[1][i]=matrix[0][i]+D01;
                    }
                    for (int i = 0; i < cols; i++)
                    {
                        matrix[2][i]=matrix[1][i]+D12;
                    }
                    for (int i = 0; i < cols; i++)
                    {
                        matrix[3][i]=matrix[2][i]+D23;
                    }
                    for (int i = 0; i < cols; i++)
                    {
                        matrix[4][i]=matrix[3][i]+D34;
                    }
                }

                TVDisplayHole.setText("");

                //Displaying
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < cols; j++) {

                        TVDisplayHole.append(matrix[i][j] + "⓿ \t");
                    }
                    TVDisplayHole.append("\n");
                }
                TVDisplayHole.append("---------------------------------------------\n");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < cols; j++) {
                        for (int k = 0; k < row; k++) {
                            for (int l = 0; l < cols; l++) {
                                if(Math.abs(matrix[k][l]-matrix[i][j])<8&&(Math.abs(matrix[k][l]-matrix[i][j])!=0))
                                    TVDisplayHole.append(matrix[k][l] + " AND " +matrix[i][j]+ " ++ ");
                            }
                        }
                    }
                }
                DisplayHoles.setEnabled(false);
            }
        });
    }
}
