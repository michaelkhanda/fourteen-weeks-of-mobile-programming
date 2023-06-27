package com.example.midsemseter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    ListView listview2;
    TextView textview6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        listview2 = findViewById(R.id.listview2);
        textview6 = findViewById(R.id.textView6);

        Intent intent2 = getIntent();
        String str1 = intent2.getStringExtra("v1");
        Integer int2 = intent2.getIntExtra("v2",1);
        Integer int3 = intent2.getIntExtra("v3",1);
        Integer int4 = intent2.getIntExtra("v4",1);

        textview6.setText("END OF EXAM");


        String[]values = new String[]{
                "Full Name: " + str1, "Id Number: " + int2, "Account Number: " + int3, "Account Balance: " + int4

        };

        //create the array adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, android.R.id.text1,values);

        //display the data values on the list view
        listview2.setAdapter((adapter));


    }
}