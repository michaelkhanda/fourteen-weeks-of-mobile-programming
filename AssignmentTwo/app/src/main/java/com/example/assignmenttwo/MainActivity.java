package com.example.assignmenttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextTextPersonName,editTextTextPersonName2,editTextTextPersonName3,editTextTextPersonName4,editTextTextPersonName5;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);
        button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first_name = editTextTextPersonName.getText().toString();
                String second_name = editTextTextPersonName2.getText().toString();
                String id_number = editTextTextPersonName3.getText().toString();
                String acc_number = editTextTextPersonName4.getText().toString();
                String branch_number = editTextTextPersonName5.getText().toString();

                Intent intent = new Intent(getApplicationContext(),ListviewActivity.class);
                intent.putExtra("v1", first_name);
                intent.putExtra("v2", second_name);
                intent.putExtra("v3", id_number);
                intent.putExtra("v4", acc_number);
                intent.putExtra("v5", branch_number);

                startActivity(intent);


            }
        });

    }
}