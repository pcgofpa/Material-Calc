package com.example.material_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FenceResults extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fence_results);
        Intent calc_results = getIntent();
        String perimeter_result = calc_results.getStringExtra("p_result");

        TextView fen_res_title, perim_result, post_result,
                picket_result, runner_result, concrete_result;
        Double x = Double.parseDouble(perimeter_result);
        Double pick = Math.ceil(x*2.1);
        Double post = Math.ceil((x/8)+1);
        Double run = Math.ceil((x/8)*3);



/* Find all of the text views */
        fen_res_title = findViewById(R.id.fen_res_title);
        perim_result = findViewById(R.id.perim_result);
        post_result = findViewById(R.id.post_result);
        picket_result = findViewById(R.id.picket_result);
        runner_result = findViewById(R.id.runner_result);
        concrete_result = findViewById(R.id.concrete_result);

/* Set text of text views */
        fen_res_title.setText("Materials needed to complete the fence:");
        perim_result.setText("Measured distance = " + perimeter_result + " ft.");
        post_result.setText(String.valueOf(post) + " Posts needed");
        picket_result.setText(String.valueOf(pick) + " Pickets needed");
        runner_result.setText(String.valueOf(run) + " Runners needed");
        concrete_result.setText(String.valueOf(post) + " 50 lb. bags of concrete.");
    }
}