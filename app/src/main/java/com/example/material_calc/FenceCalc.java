package com.example.material_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class FenceCalc extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fence_calc);

        EditText input1, input2, input3;
        input1 = findViewById(R.id.input1);
        input1.setText("0");
        input2 = findViewById(R.id.input2);
        input2.setText("0");
        input3 = findViewById(R.id.input3);
        input3.setText("0");

//Calculate user input


        //Set TextView Label Text
        TextView title = findViewById(R.id.FenceTitle);
        title.setText("Fence Material Calculator");
        TextView inp1 = findViewById(R.id.Input1Label);
        inp1.setText("Enter first length:");
        TextView input2_Label = findViewById(R.id.input2_Label);
        input2_Label.setText("Enter second length:");
        TextView input3_Label = findViewById(R.id.input3_Label);
        input3_Label.setText("Enter third length:");


        Button calc_fence = findViewById(R.id.calc_fence);
        calc_fence.setText("Calculate");
        calc_fence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length_1 = Integer.parseInt(input1.getText().toString());
                int length_2 = Integer.parseInt(input2.getText().toString());
                int length_3 = Integer.parseInt(input3.getText().toString());
                int perimeter = length_1 + length_2 + length_3;
                Intent calc_results = new Intent(FenceCalc.this, FenceResults.class);
                String p_result = String.valueOf(perimeter);
                calc_results.putExtra("p_result", p_result);
                startActivity(calc_results);

            }
        });        


        //Go to Main Activity
        Button Home = (Button) findViewById(R.id.Home);
        Home.setText("Home");
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FenceCalc.this, MainActivity.class));
            }
        });
    }

}