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

        TextView fen_res_title, perim_label, perim_result, post_label, post_result,picket_label, picket_result, runner_label, runner_result, concrete_label, concrete_result;
        Double x = Double.parseDouble(perimeter_result);
        Double pick = Math.ceil(x*2.1);
        Double post = Math.ceil((x/8)+1);
        Double run = Math.ceil((x/8)*3);
        Double concrete = post;


/* Find all of the text views */
        fen_res_title = findViewById(R.id.fen_res_title);
        perim_label = findViewById(R.id.perim_label);
        perim_result = findViewById(R.id.perim_result);
        post_label = findViewById(R.id.post_label);
        post_result = findViewById(R.id.post_result);
        picket_label = findViewById(R.id.picket_label);
        picket_result = findViewById(R.id.picket_result);
        runner_label = findViewById(R.id.runner_label);
        runner_result = findViewById(R.id.runner_result);
        concrete_label = findViewById(R.id.concrete_label);
        concrete_result = findViewById(R.id.concrete_result);

/* Set text of text views */
        fen_res_title.setText("Materials needed to complete the fence:");
        perim_label.setText("Measured distance: ");
        perim_result.setText(String.valueOf(perimeter_result));
        post_label.setText("Posts needed: ");
        post_result.setText(String.valueOf(post));
        picket_label.setText("Pickets needed: ");
        picket_result.setText(String.valueOf(pick));
        runner_label.setText("Runners needed: ");
        runner_result.setText(String.valueOf(run));
        concrete_label.setText("50 lb. bags of concrete.");
        concrete_result.setText(String.valueOf(concrete));

    }
}