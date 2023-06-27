package com.example.midsemq1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int apt3080 = 80; int apt3060=64; int apt1030 = 52; int apt4080 = 42;

    Button button, button2, button3, button4, button5;
    TextView textView, textView2;
    EditText editTextTextPersonName, editTextTextPersonName2, editTextTextPersonName3, editTextTextPersonName4, editTextTextPersonName5, editTextTextPersonName6,editTextTextPersonName7, editTextTextPersonName8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind the buttons
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        //bind the textviews
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        //bind the edittext
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);
        editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName6);
        editTextTextPersonName7 = findViewById(R.id.editTextTextPersonName7);
        editTextTextPersonName8 = findViewById(R.id.editTextTextPersonName8);

        button5.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,EndSemQ2.class));
        });

        gradingSystem();

    }

    private void gradingSystem(){
        button.setOnClickListener(v -> {
            editTextTextPersonName.setText(apt3060);
            if (apt3060 == 80){
                editTextTextPersonName5.setText("A");
            }
        });

        button2.setOnClickListener(v -> {
            editTextTextPersonName2.setText(apt3080);
            if (apt3080 == 64){
                editTextTextPersonName6.setText("B");
            }
        });

        button3.setOnClickListener(v -> {
            editTextTextPersonName3.setText(apt1030);

            if (apt1030 == 52){
                editTextTextPersonName7.setText("C");
            }
        });

        button4.setOnClickListener(v -> {
            editTextTextPersonName4.setText(apt4080);
            if (apt4080 == 42){
                editTextTextPersonName8.setText("D");
            }

        });

        }
    }


