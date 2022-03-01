package com.example.material_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set OnClick Listener to Move to Fence Calculator Activity
        Button Fence = (Button) findViewById(R.id.Fence);
        Fence.setText("Fence Calculator");
        Fence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FenceCalc.class));
            }
        });

        Button Floor = (Button) findViewById(R.id.Floor);
        Floor.setText("Flooring Calculator");
        Floor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Flooring.class));
            }
        });
    }
}