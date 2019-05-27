package com.example.cimfrblastguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EstDesignPara extends AppCompatActivity {
    private Button BTNChargeHole;
    private Button BTNVolume;
    private Button BTNSpecificCharge;
    private TextView TVChargeHole;
    private TextView TVVolume;
    private TextView TVSpecificCharge;
    private EditText ETDiaHole;
    private EditText ETDiaExpo;
    private EditText ETDensityExpo;
    private EditText ETBurden;
    private EditText ETSpacing;
    private EditText ETDepthHole;
    private EditText ETSubgrade;
    private EditText ETDeck;
    private EditText ETStem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_est_design_para);
        BTNChargeHole = (Button)findViewById(R.id.btnChargeHoleEstDesign);
        BTNVolume = (Button)findViewById(R.id.btnVolumeEstDesign);
        BTNSpecificCharge = (Button)findViewById(R.id.btnSpeChargeEstDesign);
        TVChargeHole = (TextView)findViewById(R.id.tvChargeHoleEstDesign);
        TVVolume = (TextView)findViewById(R.id.tvVolumeEstDesign);
        TVSpecificCharge = (TextView)findViewById(R.id.tvSpeChargeEstDesign);
        ETDiaHole = (EditText)findViewById(R.id.DiaHoleEstDesign);
        ETDiaExpo = (EditText)findViewById(R.id.DiaExpoEstDesign);
        ETDensityExpo = (EditText)findViewById(R.id.DensityExpoEstDesign);
        ETBurden = (EditText)findViewById(R.id.BurdenEstDesign);
        ETSpacing = (EditText)findViewById(R.id.SpacingEstDesign);
        ETDepthHole = (EditText)findViewById(R.id.DepthHoleEstDesign);
        ETSubgrade = (EditText)findViewById(R.id.SubgradeEstDesign);
        ETDeck = (EditText)findViewById(R.id.DeckEstDesign);
        ETStem = (EditText)findViewById(R.id.StemEstDesign);

        BTNChargeHole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ETDiaHole.getText().toString().isEmpty())
                {
                    TVChargeHole.setText("Please enter Diameter of Hole");
                }
                else if(ETStem.getText().toString().isEmpty())
                {
                    TVChargeHole.setText("Please enter Stemming value");
                }
                else if(ETDeck.getText().toString().isEmpty())
                {
                    TVChargeHole.setText("Please enter Deck value");
                }
                else if(ETDiaExpo.getText().toString().isEmpty())
                {
                    TVChargeHole.setText("Please enter Diameter of Explosive");
                }
                else if(ETDensityExpo.getText().toString().isEmpty())
                {
                    TVChargeHole.setText("Please enter Density of Explosive value");
                }
                else
                {
                    double DiaHole = Double.parseDouble(ETDiaHole.getText().toString());
                    double Stem = Double.parseDouble(ETStem.getText().toString());
                    double Deck = Double.parseDouble(ETDeck.getText().toString());
                    double DiaExpo = Double.parseDouble(ETDiaExpo.getText().toString());
                    double DensityExpo = Double.parseDouble(ETDensityExpo.getText().toString());
                    double ResCPH = (DiaHole-Stem-Deck)*(Math.PI/4000000000.00)*DiaExpo*DiaExpo*DensityExpo;
                    TVChargeHole.setText(ResCPH + "");
                }
            }
        });

        BTNVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ETDiaHole.getText().toString().isEmpty())
                {
                    TVVolume.setText("Please enter Diameter of hole");
                }
                else if(ETSubgrade.getText().toString().isEmpty())
                {
                    TVVolume.setText("Please enter Subgrade value");
                }
                else if(ETBurden.getText().toString().isEmpty())
                {
                    TVVolume.setText("Please enter Burden value");
                }
                else if(ETSpacing.getText().toString().isEmpty())
                {
                    TVVolume.setText("Please enter Spacing value");
                }
                else
                {
                    double DiaHole = Double.parseDouble(ETDiaHole.getText().toString());
                    double Subgrade = Double.parseDouble(ETSubgrade.getText().toString());
                    double Burden = Double.parseDouble(ETBurden.getText().toString());
                    double Spacing = Double.parseDouble(ETSpacing.getText().toString());
                    double ResVol = (DiaHole - Subgrade)*Burden*Spacing;
                    TVVolume.setText(ResVol+"");
                }
            }
        });

        BTNSpecificCharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ETDiaHole.getText().toString().isEmpty())
                {
                    TVSpecificCharge.setText("Please enter Diameter of Hole");
                }
                else if(ETStem.getText().toString().isEmpty())
                {
                    TVSpecificCharge.setText("Please enter Stemming value");
                }
                else if(ETDeck.getText().toString().isEmpty())
                {
                    TVSpecificCharge.setText("Please enter Deck value");
                }
                else if(ETDiaExpo.getText().toString().isEmpty())
                {
                    TVSpecificCharge.setText("Please enter Diameter of Explosive");
                }
                else if(ETDensityExpo.getText().toString().isEmpty())
                {
                    TVSpecificCharge.setText("Please enter Density of Explosive value");
                }
                else if(ETSubgrade.getText().toString().isEmpty())
                {
                    TVSpecificCharge.setText("Please enter Subgrade value");
                }
                else if(ETBurden.getText().toString().isEmpty())
                {
                    TVSpecificCharge.setText("Please enter Burden value");
                }
                else if(ETSpacing.getText().toString().isEmpty())
                {
                    TVSpecificCharge.setText("Please enter Spacing value");
                }
                else
                {
                    double DiaHole = Double.parseDouble(ETDiaHole.getText().toString());
                    double Stem = Double.parseDouble(ETStem.getText().toString());
                    double Deck = Double.parseDouble(ETDeck.getText().toString());
                    double DiaExpo = Double.parseDouble(ETDiaExpo.getText().toString());
                    double DensityExpo = Double.parseDouble(ETDensityExpo.getText().toString());

                    double Subgrade = Double.parseDouble(ETSubgrade.getText().toString());
                    double Burden = Double.parseDouble(ETBurden.getText().toString());
                    double Spacing = Double.parseDouble(ETSpacing.getText().toString());

                    double ResCPH = (DiaHole-Stem-Deck)*(Math.PI/4000000000.00)*DiaExpo*DiaExpo*DensityExpo;
                    double ResVol = (DiaHole - Subgrade)*Burden*Spacing;

                    double ResSpeCharge = ResCPH/ResVol;
                    TVSpecificCharge.setText(ResSpeCharge+"");
                }
            }
        });
    }
}
