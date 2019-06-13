package com.example.cimfrblastguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.text.DecimalFormat;

public class EstDesignPara extends AppCompatActivity {
    private Button BTNDepthHole;
    private Button BTNChargeHole;
    private Button BTNVolume;
    private Button BTNSpecificCharge;
    private TextView TVDepthHole;
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

        BTNDepthHole = (Button) findViewById(R.id.btnDepthHoleEstDesign);
        BTNChargeHole = (Button)findViewById(R.id.btnChargeHoleEstDesign);
        BTNVolume = (Button)findViewById(R.id.btnVolumeEstDesign);
        BTNSpecificCharge = (Button)findViewById(R.id.btnSpeChargeEstDesign);
        TVDepthHole = (TextView) findViewById(R.id.tvDepthHoleEstDesign);
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

        BTNDepthHole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ETDepthHole.getText().toString().isEmpty())
                {
                    TVDepthHole.setText("Please enter Bench Height");
                }
                else if(ETSubgrade.getText().toString().isEmpty())
                {
                    TVDepthHole.setText("Please enter Subgrade value");
                }
                else
                {
                    double HoleDepth = Double.parseDouble(ETDepthHole.getText().toString());
                    double Subgradee = Double.parseDouble(ETSubgrade.getText().toString());

                    double ResDH = HoleDepth + Subgradee;

                    DecimalFormat d0 = new DecimalFormat("#.####");
                    TVDepthHole.setText(d0.format(ResDH) + " meters");
                }
            }
        });

        BTNChargeHole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ETDepthHole.getText().toString().isEmpty())
                {
                    TVChargeHole.setText("Please enter Bench Height");
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
                    double Stem = Double.parseDouble(ETStem.getText().toString());
                    double Deck = Double.parseDouble(ETDeck.getText().toString());
                    double HoleDepth = Double.parseDouble(ETDepthHole.getText().toString());
                    double DiaExpo = Double.parseDouble(ETDiaExpo.getText().toString());
                    double DensityExpo = Double.parseDouble(ETDensityExpo.getText().toString());
                    double Subgradee = Double.parseDouble(ETSubgrade.getText().toString());

                    double ResCPH = (HoleDepth + Subgradee - Stem - Deck)*(Math.PI/4000.00)*DiaExpo*DiaExpo*DensityExpo;

                    DecimalFormat d1 = new DecimalFormat("#.####");
                    TVChargeHole.setText(d1.format(ResCPH) + " kg");
                }
            }
        });

        BTNVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ETDepthHole.getText().toString().isEmpty())
                {
                    TVVolume.setText("Please enter Bench Height");
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
                    double Subgrade = Double.parseDouble(ETSubgrade.getText().toString());
                    double HoleDepth = Double.parseDouble(ETDepthHole.getText().toString());
                    double Burden = Double.parseDouble(ETBurden.getText().toString());
                    double Spacing = Double.parseDouble(ETSpacing.getText().toString());
                    double ResVol = (HoleDepth - Subgrade)*Burden*Spacing;

                    DecimalFormat d2= new DecimalFormat("#.####");
                    TVVolume.setText(d2.format(ResVol) + " cubic meter");
                }
            }
        });

        BTNSpecificCharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ETDepthHole.getText().toString().isEmpty())
                {
                    TVSpecificCharge.setText("Please enter Bench Height");
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
                    double Stem = Double.parseDouble(ETStem.getText().toString());
                    double Deck = Double.parseDouble(ETDeck.getText().toString());
                    double DiaExpo = Double.parseDouble(ETDiaExpo.getText().toString());
                    double DensityExpo = Double.parseDouble(ETDensityExpo.getText().toString());
                    double HoleDepth = Double.parseDouble(ETDepthHole.getText().toString());

                    double Subgrade = Double.parseDouble(ETSubgrade.getText().toString());
                    double Burden = Double.parseDouble(ETBurden.getText().toString());
                    double Spacing = Double.parseDouble(ETSpacing.getText().toString());

                    double ResCPH = (HoleDepth-Stem-Deck)*(Math.PI/4000.00)*DiaExpo*DiaExpo*DensityExpo;
                    double ResVol = (HoleDepth - Subgrade)*Burden*Spacing;

                    double ResSpeCharge = ResCPH/ResVol;

                    DecimalFormat d3 = new DecimalFormat("#.####");
                    TVSpecificCharge.setText(d3.format(ResSpeCharge) + " kg per cubic meter");
                }
            }
        });
    }
}
