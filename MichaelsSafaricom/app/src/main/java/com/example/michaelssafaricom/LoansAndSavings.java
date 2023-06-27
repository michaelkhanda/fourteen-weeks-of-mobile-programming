package com.example.michaelssafaricom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class LoansAndSavings extends AppCompatActivity {

    ListView listview4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loans_and_savings);

        listview4 = findViewById(R.id.listview4);

        //create array of springs to hold the values to display on the listview
        String[]values = new String[]{
                "M-Shwari", "KCB M-PESA"
        };

        //create the array adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, android.R.id.text1,values);

        //display the data values on the list view
        listview4.setAdapter((adapter));

        //process the item click events
        listview4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    String mpesaitempicked = "You clicked" + values[position];
                    Toast.makeText(LoansAndSavings.this, mpesaitempicked, Toast.LENGTH_SHORT).show();

                }
                if (position==1){
                    String mpesaitempicked = "You clicked" + values[position];
                    Toast.makeText(LoansAndSavings.this, mpesaitempicked, Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}