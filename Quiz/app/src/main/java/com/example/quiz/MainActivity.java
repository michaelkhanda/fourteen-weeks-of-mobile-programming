package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextTextPersonName, editTextTextPersonName2, editTextTextPersonName3,editTextTextPersonName4,editTextTextPersonName5,editTextTextPersonName6;
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
        editTextTextPersonName6 = findViewById(R.id.editTextTextPersonName6);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String full_name = editTextTextPersonName.getText().toString();
                int id_number = Integer.parseInt(editTextTextPersonName2.getText().toString());
                String gender = editTextTextPersonName3.getText().toString();
                String date_of_birth = editTextTextPersonName4.getText().toString();
                String age = editTextTextPersonName5.getText().toString();
                int acc_number = Integer.parseInt(editTextTextPersonName3.getText().toString());
                int acc_balance = Integer.parseInt(editTextTextPersonName4.getText().toString());

                Customer customer = new Customer("", "", "","", "","");
                customer.getFullName();
                customer.getIdNumber();
                customer.getGender();
                customer.getDateOfBirth();
                customer.getAccountNumber();

                Account account = new Account("");
                account.getAccountBalance();

                Deposit deposit = new Deposit("");
                deposit.getDepositAmount();

                Intent intent = new Intent(getApplicationContext(),ListView.class);
                intent.putExtra("v1", full_name);
                intent.putExtra("v2", id_number);
                intent.putExtra("v3", gender);
                intent.putExtra("v4", date_of_birth);
                intent.putExtra("v5", age);
                intent.putExtra("v6", acc_number);
                intent.putExtra("v7", acc_balance);

                startActivity(intent);


            }
        });

    }

}