package com.example.classassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button, button2, button3, button4;
    EditText editTextTextPersonName2, editTextTextPersonName3, editTextTextPersonName4, editTextTextPersonName5,editTextTextPersonName6, editTextTextPersonName7, editTextTextPersonName8;
    Integer bread_price;
    Integer milk_price;
    Integer tea_price;

    int bread_count = 0, milk_count = 0, tea_count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);
        editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName6);
        editTextTextPersonName7 = findViewById(R.id.editTextTextPersonName7);
        editTextTextPersonName8 = findViewById(R.id.editTextTextPersonName8);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                do {
                    bread_count = bread_count + 1;
                }
                while(v.equals(true));
                bread_price = bread_count * 150;
                editTextTextPersonName2.setText(String.valueOf(bread_count));
                editTextTextPersonName3.setText(String.valueOf(bread_price));

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                do {
                    milk_count = milk_count + 1;
                    editTextTextPersonName4.setText(String.valueOf(milk_count));
                }
                while(v.equals(true));
                milk_price = milk_count * 50;

                editTextTextPersonName5.setText(String.valueOf(milk_price));

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                do {
                    tea_count = tea_count + 1;
                    editTextTextPersonName6.setText(String.valueOf(tea_count));
                }
                while(v.equals(true));
                tea_price = tea_count * 400;

                editTextTextPersonName7.setText(String.valueOf(tea_price));

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total = bread_price + milk_price + tea_price;
                //double discounted_total = total - (0.15 * total);
                editTextTextPersonName8.setText(String.valueOf(total));

            }
        });
    }
}