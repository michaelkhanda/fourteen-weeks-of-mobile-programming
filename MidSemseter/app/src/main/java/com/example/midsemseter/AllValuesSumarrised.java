package com.example.midsemseter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class AllValuesSumarrised extends AppCompatActivity {

    ListView listview;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_values_sumarrised);

       listview = findViewById(R.id.listview);
       button = findViewById(R.id.button);

        //receive the data
        Intent intent = getIntent();
        Integer int1 = intent.getIntExtra("v1",1);
        Integer int2 = intent.getIntExtra("v2",1);
        Integer int3 = intent.getIntExtra("v3",1);
        Integer int4 = intent.getIntExtra("v4",1);
        Integer int5 = intent.getIntExtra("v5",1);


        String[]values = new String[]{
                "Principal: " + int1, "Rate: " + int2, "Time: " + int3, "Simple interest: " + int4,"Amount Payable: " + int5

        };

        //create the array adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, android.R.id.text1,values);

        //display the data values on the list view
        listview.setAdapter((adapter));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(intent1);
            }
        });



    }
}