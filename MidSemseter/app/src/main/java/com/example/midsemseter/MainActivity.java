package com.example.midsemseter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextTextPersonName, editTextTextPersonName2, editTextTextPersonName3, editTextTextPersonName4, editTextTextPersonName5;
    Button button;
    public int principal, interest_rate, time, simple_interest, total_amount_payable;

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

                 principal = Integer.parseInt(editTextTextPersonName.getText().toString());
                 interest_rate = Integer.parseInt(editTextTextPersonName2.getText().toString());
                 time = Integer.parseInt(editTextTextPersonName3.getText().toString());
                 editTextTextPersonName4.setText(String.valueOf(interest_calculator()));
                 editTextTextPersonName5.setText(String.valueOf(total_amount_payable_calculator()));

                Intent intent = new Intent(getApplicationContext(),AllValuesSumarrised.class);
                intent.putExtra("v1", principal);
                intent.putExtra("v2", interest_rate);
                intent.putExtra("v3",  time);
                intent.putExtra("v4", simple_interest);
                intent.putExtra("v5", total_amount_payable);

                startActivity(intent);
            }
        });


    }

    public int interest_calculator()
    {
        principal = Integer.parseInt(editTextTextPersonName.getText().toString());
        interest_rate = Integer.parseInt(editTextTextPersonName2.getText().toString());
        time = Integer.parseInt(editTextTextPersonName3.getText().toString());

        simple_interest = (principal*interest_rate*time)/100;
        return simple_interest;

    }

    public int total_amount_payable_calculator()
    {
        total_amount_payable = principal + simple_interest;
        return total_amount_payable;
    }




}