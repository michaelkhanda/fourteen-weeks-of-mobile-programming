package com.example.michaelssafaricom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MyAccount extends AppCompatActivity {
    ListView listview2;
   // Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        listview2 = findViewById(R.id.listview2);

        //create array of springs to hold the values to display on the listview
        String[]values = new String[]{
                "Mini Statement", "Check Balance", "Change M-PESA PIN", "Change Language", "Update Customer Menu"
        };

        //create the array adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, android.R.id.text1,values);

        //display the data values on the list view
        listview2.setAdapter((adapter));

        //process the item click events
        listview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    String mpesaitempicked = "You clicked" + values[position];
                    Toast.makeText(MyAccount.this, mpesaitempicked, Toast.LENGTH_SHORT).show();

                }
                if (position==1){
                    String mpesaitempicked = "You clicked" + values[position];
                    Toast.makeText(MyAccount.this, mpesaitempicked, Toast.LENGTH_SHORT).show();

                }
                if (position==2){
                    String mpesaitempicked = "You clicked" + values[position];
                    Toast.makeText(MyAccount.this, mpesaitempicked, Toast.LENGTH_SHORT).show();

                }
                if (position==3){
                    String mpesaitempicked = "You clicked" + values[position];
                    Toast.makeText(MyAccount.this, mpesaitempicked, Toast.LENGTH_SHORT).show();

                }
                if (position==4){
                    String mpesaitempicked = "You clicked" + values[position];
                    Toast.makeText(MyAccount.this, mpesaitempicked, Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}