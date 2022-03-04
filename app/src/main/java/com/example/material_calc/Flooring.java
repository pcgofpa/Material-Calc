package com.example.material_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Flooring extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flooring);
        TextView lenLabel, widthLabel, tot_area_label, tot_area;
        EditText len_in, wid_in;

//set text of the labels
        lenLabel = findViewById(R.id.lenLabel);
        lenLabel.setText("Enter the length: ");
        widthLabel = findViewById(R.id.widthLabel);
        widthLabel.setText("Enter the width: ");
        tot_area_label = findViewById(R.id.tot_area_label);
        tot_area_label.setText("The total area is: ");
        tot_area = findViewById(R.id.tot_area);

//get input
        len_in = findViewById(R.id.len_in);
        wid_in = findViewById(R.id.wid_in);

//Calculate Button
        Button FloorCalc = findViewById(R.id.FloorCalc);
        FloorCalc.setText("Calculate");
        FloorCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                float length = Float.parseFloat(String.valueOf(len_in));
                float width = Float.parseFloat(String.valueOf(wid_in));
                float area = length * width;
                tot_area.setText(String.valueOf(area));
*/
            }
        });

    }
}