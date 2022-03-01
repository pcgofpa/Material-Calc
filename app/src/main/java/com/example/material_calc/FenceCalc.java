package com.example.material_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FenceCalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fence_calc);

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