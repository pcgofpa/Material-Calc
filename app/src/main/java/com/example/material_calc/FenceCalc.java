package com.example.material_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FenceCalc extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fence_calc);

        //Set TextView Label Text
        TextView title = (TextView) findViewById(R.id.FenceTitle);
        title.setText("Fence Material Calculator");
        TextView inp1 = (TextView) findViewById(R.id.Input1Label);
        inp1.setText("Input Perimeter");

        //Go to FenceCalc Activity
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