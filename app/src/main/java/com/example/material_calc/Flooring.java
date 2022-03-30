package com.example.material_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.*;

public class Flooring extends AppCompatActivity {
    double x = 1.1;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flooring);
        TextView lenLabel, widthLabel, tot_area;
        EditText len_in, wid_in;

//set text of the labels
        lenLabel = findViewById(R.id.lenLabel);
        lenLabel.setText("Enter the length: ");
        widthLabel = findViewById(R.id.widthLabel);
        widthLabel.setText("Enter the width: ");
        tot_area = findViewById(R.id.tot_area);

//get input
        len_in = findViewById(R.id.len_in);
        len_in.setFilters(new InputFilter[]{new MaxInput("0", "3000")});
        wid_in = findViewById(R.id.wid_in);
        wid_in.setFilters(new InputFilter[]{new MaxInput("0", "3000")});

//Calculate Button
        Button FloorCalc = findViewById(R.id.FloorCalc);
        FloorCalc.setText("Calculate");
        FloorCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/* Pull user input from the edittext inputs and calcualte materials needed adding 10% to the area
to account for mistakes with cutting. */
                int a = Integer.parseInt(len_in.getText().toString());
                int b = Integer.parseInt(wid_in.getText().toString());
                double area_result = (a*b);
                double flooring_mat = (area_result*x);
                int rounded_floor = (int) Math.ceil(flooring_mat);
                tot_area.setText("Adding the 10% to account for cutting order: " + Double.toString(rounded_floor) + " sq. ft.");
            }
        });

        //Go to Main Activity
        Button Home = findViewById(R.id.floor_home);
        Home.setText("Home");
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Flooring.this, MainActivity.class));
            }
        });

    }
}