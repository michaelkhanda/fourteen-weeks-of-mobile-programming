package com.example.midsemq1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EndSemQ2 extends AppCompatActivity {

    public double ksh, ksh_to_euro, ksh_to_usd, ksh_to_pounds;
    Button button6, button7, button8, button9, button10;
    EditText editTextTextPersonName9, editTextTextPersonName10, editTextTextPersonName11, editTextTextPersonName12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_sem_q2);

        // BIND THE BUTTONS AND TEXTVIEWS
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button6);
        button10 = findViewById(R.id.button10);

        editTextTextPersonName9 = findViewById(R.id.editTextTextPersonName9);
        editTextTextPersonName10 = findViewById(R.id.editTextTextPersonName10);
        editTextTextPersonName11 = findViewById(R.id.editTextTextPersonName11);
        editTextTextPersonName12 = findViewById(R.id.editTextTextPersonName12);

        button10.setOnClickListener(v -> {
            ksh=Integer.parseInt(editTextTextPersonName9.getText().toString());
            editTextTextPersonName10.setText(String.valueOf(Euro_Calculator()));
            editTextTextPersonName11.setText(String.valueOf(Usd_Calculator()));
            editTextTextPersonName12.setText(String.valueOf(Pounds_Calculator()));


        });

    }

    public int Euro_Calculator(){
        ksh=Integer.parseInt(editTextTextPersonName9.getText().toString());

        ksh_to_euro = ksh * 0.0077;
        return (int) ksh_to_euro;
    }

    public int Usd_Calculator(){
        ksh=Integer.parseInt(editTextTextPersonName9.getText().toString());

        ksh_to_usd = ksh * 0.0081;
        return (int) ksh_to_usd;

    }



    public int Pounds_Calculator(){
        ksh=Integer.parseInt(editTextTextPersonName9.getText().toString());

        ksh_to_pounds = ksh * 0.0066;
        return (int) ksh_to_pounds;
    }
}