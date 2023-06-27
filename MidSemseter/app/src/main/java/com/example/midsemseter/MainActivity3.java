package com.example.midsemseter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    EditText editTextTextPersonName6, editTextTextPersonName7,editTextTextPersonName8,editTextTextPersonName9;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName6);
        editTextTextPersonName7 = findViewById(R.id.editTextTextPersonName7);
        editTextTextPersonName8 = findViewById(R.id.editTextTextPersonName8);
        editTextTextPersonName9 = findViewById(R.id.editTextTextPersonName9);
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String full_name = editTextTextPersonName6.getText().toString();
                int id_number = Integer.parseInt(editTextTextPersonName7.getText().toString());
                int acc_number = Integer.parseInt(editTextTextPersonName8.getText().toString());
                int acc_balance = Integer.parseInt(editTextTextPersonName9.getText().toString());



                Intent intent2 = new Intent(getApplicationContext(),MainActivity4.class);
                intent2.putExtra("v1", full_name);
                intent2.putExtra("v2", id_number);
                intent2.putExtra("v3", acc_number);
                intent2.putExtra("v4", acc_balance);



                startActivity(intent2);

            }

            Bank b = new Bank("Neema Mkenda",662903, 663156, 40000000);
            String name = b.getFullname();
            int id = b.getIdnumber();
            int accno = b.getAccountnumber();
            int accbal = b.getAccountbalance();




        });


    }


}