package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button, button2, button3, button4, button5;
    EditText editTextTextPersonName, editTextTextPersonName2, editTextTextPersonName3, editTextTextPersonName4, editTextTextPersonName5;

    Integer lays_price;
    Integer doritos_price;
    Integer soda_price;
    Integer water_price;

    int lays_count = 0, doritos_count = 0, soda_count = 0, water_count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                do {
                    lays_count = lays_count + 1;
                }
                while(v.equals(true));
                lays_price = lays_count * 150;

                editTextTextPersonName.setText(lays_price.toString());

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                do {
                    doritos_count = doritos_count + 1;
                }
                while(v.equals(true));
                doritos_price = doritos_count * 300;

                editTextTextPersonName2.setText(doritos_price.toString());

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                do {
                    soda_count = soda_count + 1;
                }
                while(v.equals(true));
                soda_price= soda_count * 100;

                editTextTextPersonName3.setText(soda_price.toString());

            }
        });

        button4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                do {
                   water_count = water_count + 1;
                }
                while(v.equals(true));
                water_price = water_count * 90;

                editTextTextPersonName4.setText(water_price.toString());

            }
        }));

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total = lays_price + doritos_price + soda_price + water_price;
                double discounted_total = total - (0.15 * total);
                editTextTextPersonName5.setText(Double.toString(discounted_total));

            }
        });
    }
}