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

                String col = intent.getStringExtra("passcol");
                String addRowTransfer = intent.getStringExtra("rowAddPass");

                if(addRowTransfer.trim()=="")
                {
                    TVDisplayHole.append("Please go back and add rows");
                    DisplayHoles.setEnabled(false);
                }
                else
                {
                    int row = addRowTransfer.replaceAll("[^ ]", "").length()+1;

                    String s[] = addRowTransfer.split(" ");
                    int ary[] = new int[s.length];
                    for(int i = 0 ; i < s.length ; i++)
                        ary[i] = Integer.parseInt(s[i]);



                    int colDelay = Integer.parseInt(delayCol);
                    int cols = Integer.parseInt(col);
                    int[][] matrix = new int[row][cols];

                    matrix[0][0]= Integer.parseInt(ini);

                    for (int i = 1; i < cols; i++)
                    {
                        matrix[0][i]=matrix[0][i-1]+colDelay;
                    }

                    for(int p=1; p<row; p++)
                    {
                        for (int i = 0; i < cols; i++) {
                            matrix[p][i] = matrix[p-1][i] + ary[p - 1];
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

                    TVDisplayHole.append("\n\n\n");

                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < cols; j++) {
                            for (int k = 0; k < row; k++) {
                                for (int l = 0; l < cols; l++) {
                                    if((Math.abs(matrix[k][l]-matrix[i][j])<8) &&(Math.abs(matrix[k][l]-matrix[i][j])!=0))
                                    {
                                        if(i==k && l==j)
                                            TVDisplayHole.append("");
                                        else
                                            TVDisplayHole.append(matrix[k][l] + " AND " +matrix[i][j]+ "  ");
                                    }
                                }
                                TVDisplayHole.append("\n");
                            }
                        }
                    }
                    DisplayHoles.setEnabled(false);
                }
            }
        });
    }
}