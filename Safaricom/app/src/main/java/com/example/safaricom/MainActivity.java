package com.example.safaricom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       listview = findViewById(R.id.listview);

       //create array of springs to hold the values to display on the listview
        String[]values = new String[]{
                "Send Money", "Withdraw Cash", "Buy Airtime or Bundles", "Loans and Savings", "Lipa na M-PESA", "My Account"
        };

        //create the array adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, android.R.id.text1,values);


        //display the data values on the list view
        listview.setAdapter((adapter));

        //process the item click events
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //what to do if first time is clicked

                if (position==0){
                    //Intent intent = new Intent(getApplicationContext()).FACEBOOK.class);
                    // startActivity(intent);


                    String mpesaitempicked = "You clicked" + values[position];
                    Toast.makeText(MainActivity.this, mpesaitempicked, Toast.LENGTH_SHORT).show();

                }
                if (position==1){
                    String mpesaitempicked = "You clicked" + values[position];
                    Toast.makeText(MainActivity.this, mpesaitempicked, Toast.LENGTH_SHORT).show();

                }
                if (position==2){
                    String mpesaitempicked = "You clicked" + values[position];
                    Toast.makeText(MainActivity.this, mpesaitempicked, Toast.LENGTH_SHORT).show();

                }
                if (position==3){
                    String mpesaitempicked = "You clicked" + values[position];
                    Toast.makeText(MainActivity.this, mpesaitempicked, Toast.LENGTH_SHORT).show();

                }
                if (position==4){
                    String mpesaitempicked = "You clicked" + values[position];
                    Toast.makeText(MainActivity.this, mpesaitempicked, Toast.LENGTH_SHORT).show();

                }
                if (position==5){
                    String mpesaitempicked = "You clicked" + values[position];
                    Toast.makeText(MainActivity.this, mpesaitempicked, Toast.LENGTH_SHORT).show();

                }
                if (position==6){
                    String mpesaitempicked = "You clicked" + values[position];
                    Toast.makeText(MainActivity.this, mpesaitempicked, Toast.LENGTH_SHORT).show();

                }
            }
        });



    }
}