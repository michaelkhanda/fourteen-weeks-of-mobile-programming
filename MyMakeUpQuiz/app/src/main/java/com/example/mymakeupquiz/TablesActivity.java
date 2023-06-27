package com.example.mymakeupquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class TablesActivity extends AppCompatActivity {

    TableLayout tableLayout;
    TableRow tableRow;

    DatabaseHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);

        tableLayout = findViewById(R.id.tableLayout);
        DB = new DatabaseHelper(this);
        tableRow = findViewById(R.id.tableRow);

        Cursor res = DB.getdata();
                if(res.getCount()==0) {
                    // Check if there are records to display
                    Toast.makeText(TablesActivity.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                while (res.moveToNext()){
                    View tableRow = LayoutInflater.from(this).inflate(R.layout.activity_tables,null,false);

                    TextView name = tableRow.findViewById(R.id.name);
                    TextView contact = (TextView) tableRow.findViewById(R.id.contact);
                    TextView d_o_b = (TextView) tableRow.findViewById(R.id.d_o_b);

                    name.setText(res.getString(0));
                    contact.setText(res.getString(1));
                    d_o_b.setText(res.getString(2));

                    tableLayout.addView(tableRow);

                }

    }
}