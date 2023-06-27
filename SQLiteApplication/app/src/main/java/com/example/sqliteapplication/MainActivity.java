package com.example.sqliteapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.Buffer;

public class MainActivity extends AppCompatActivity {

    private EditText editTextTextPersonName, editTextTextPersonName2,editTextTextPersonName3;
    private Button button, button2, button3, button4;

   DatabaseHelper DB; // object of class DatabaseHelper
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        DB = new DatabaseHelper(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String  nametxt = editTextTextPersonName.getText().toString();
              String contacttxt = editTextTextPersonName2.getText().toString();
              String dobtxt = editTextTextPersonName3.getText().toString();

              Boolean checkinsertdata = DB.insertuserdata(nametxt, contacttxt, dobtxt);
              if (checkinsertdata==true) Toast.makeText(MainActivity.this,"New Entry Inserted", Toast.LENGTH_SHORT).show();
              else Toast.makeText(MainActivity.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nametxt = editTextTextPersonName.getText().toString();
                String contacttxt = editTextTextPersonName2.getText().toString();
                String dobtxt = editTextTextPersonName3.getText().toString();

                Boolean checkupdatedata = DB.updateuserdata(nametxt, contacttxt, dobtxt);
                if (checkupdatedata==true)
                    Toast.makeText(MainActivity.this, "Entry Updated", Toast.LENGTH_SHORT).show();
                else Toast.makeText(MainActivity.this, "Entry Not Updated", Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  nametxt = editTextTextPersonName.getText().toString();

                Boolean checkdeletedata = DB.deleteuserdata(nametxt);
                if (checkdeletedata==true)
                    Toast.makeText(MainActivity.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                else Toast.makeText(MainActivity.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = DB.getdata();
                if(res.getCount()==0) {
                    // Check if there are records to display

                    Toast.makeText(MainActivity.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                    StringBuffer buffer = new StringBuffer();
                    while (res.moveToNext()){
                        //loop through reecords
                        buffer.append("Name:" + res.getString(0)+"\n");
                        buffer.append("Contact:" + res.getString(1)+"\n");
                        buffer.append("Date of Birth:" + res.getString(2)+"\n\n");
                    }

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setCancelable(true);
                    builder.setTitle("User Entries");
                    builder.setMessage(buffer.toString());
                    builder.show();
                }

        });
    }
}