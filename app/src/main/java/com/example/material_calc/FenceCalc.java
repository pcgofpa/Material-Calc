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

public class FenceCalc extends AppCompatActivity {
    

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fence_calc);

        EditText input1, input2, input3;
// Set Default value for edit Text inputs
        input1 = findViewById(R.id.input1);
        input1.setText("0");
        input1.setFilters(new InputFilter[]{new MaxInput("0", "1000000")});
        input2 = findViewById(R.id.input2);
        input2.setText("0");
        input2.setFilters(new InputFilter[]{new MaxInput("0", "1000000")});
        input3 = findViewById(R.id.input3);
        input3.setText("0");
        input3.setFilters(new InputFilter[]{new MaxInput("0", "1000000")});


        //Set TextView Label Text
        TextView title = findViewById(R.id.FenceTitle);
        title.setText("Fence Material Calculator");
        TextView inp1 = findViewById(R.id.Input1Label);
        inp1.setText("Enter first length:");
        TextView input2_Label = findViewById(R.id.input2_Label);
        input2_Label.setText("Enter second length:");
        TextView input3_Label = findViewById(R.id.input3_Label);
        input3_Label.setText("Enter third length:");
        TextView instruction = findViewById(R.id.instructions);
        instruction.setText("Measurements should be input in ft.  10 ft. 6 in. = 10.5");


        Button calc_fence = findViewById(R.id.calc_fence);
        calc_fence.setText("Calculate");
        calc_fence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double length_1 = Double.parseDouble(input1.getText().toString());
                Double length_2 = Double.parseDouble(input2.getText().toString());
                Double length_3 = Double.parseDouble(input3.getText().toString());
                Double perimeter = length_1 + length_2 + length_3;
                Intent calc_results = new Intent(FenceCalc.this, FenceResults.class);
                String p_result = String.valueOf(perimeter);
                calc_results.putExtra("p_result", p_result);
                startActivity(calc_results);
            }
        });


        //Go to Main Activity
        Button Home = findViewById(R.id.Home);
        Home.setText("Home");
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FenceCalc.this, MainActivity.class));
            }
        });
    }
}