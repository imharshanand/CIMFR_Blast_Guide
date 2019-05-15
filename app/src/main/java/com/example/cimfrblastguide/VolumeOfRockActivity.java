package com.example.cimfrblastguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class VolumeOfRockActivity extends AppCompatActivity {

    private Button Vol;
    private EditText H;
    private EditText L;
    private EditText W;
    private TextView Res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_of_rock);

        Vol = (Button)findViewById(R.id.btnCalVolOfRock);
        H = (EditText)findViewById(R.id.etHeigthVolRock);
        L = (EditText)findViewById(R.id.etLengthVolRock);
        W = (EditText)findViewById(R.id.etWidthVolRock);
        Res = (TextView)findViewById(R.id.tvResultVolRock);

        Vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double h = Double.parseDouble(H.getText().toString());
                double l = Double.parseDouble(L.getText().toString());
                double w = Double.parseDouble(W.getText().toString());
                double res = h*l*w;

                //if(H.getText().toString().trim().length()==0|| L.getText().toString().trim().length()==0|| W.getText().toString().trim().length()==0)
                //{
                //    Res.setText("Please enter all values");
                //}
                //else
                //{
                    DecimalFormat df = new DecimalFormat("#.####");
                    Res.setText(df.format(res) + " Cubic Metre");
                //}
            }
        });

    }
}
