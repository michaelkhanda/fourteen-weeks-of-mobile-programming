package com.example.assignmenttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListviewActivity extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listview = findViewById(R.id.listview);




//receive the data
        Intent intent = getIntent();
        String str1 = intent.getStringExtra("v1");
        String str2 = intent.getStringExtra("v2");
        String str3 = intent.getStringExtra("v3");
        String str4 = intent.getStringExtra("v4");
        String str5 = intent.getStringExtra("v5");

        String[]values = new String[]{
                "First Name: " + str1, "Second Name: " + str2, "ID Number: " + str3, "Account Number: " + str4,"Branch Name: " + str5

        };

        //create the array adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, android.R.id.text1,values);

        //display the data values on the list view
        listview.setAdapter((adapter));

    }
}