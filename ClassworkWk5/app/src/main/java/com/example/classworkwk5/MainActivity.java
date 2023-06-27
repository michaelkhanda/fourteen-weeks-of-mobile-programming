package com.example.classworkwk5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextTextPersonName, editTextTextPersonName2;

    public int x,y;
    public String my_name = "Joy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);

       /* x=15;
        y=22;
        Display();
        Integer f = add(x,y);
        editTextTextPersonName2.setText(f.toString());
        editTextTextPersonName.setText(Display());*/

       //Student s = new Student(662903, "Innocent");
        //s.setName("Khanda");
      // s.setId(662903);
      // editTextTextPersonName.setText(s.getName());

        Student s = new Student(179,50,20);
        s.setCost_of_fuel(179);
        s.setDistance(50);
        s.setConsumption_per_litre(20);
        editTextTextPersonName2.setText(String.valueOf(s.cost_calculator()));





    }

    public String Display()
    {
        return my_name;
    }

    public int add(int p, int q)
    {
        return (p+q);
    }
}