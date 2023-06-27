package com.example.classworkwk5;

public class Student extends Journey {

    private double total_cost_of_journey;

   public Student(double cost_of_fuel, double distance, double consumption_per_litre)
   {
       super(cost_of_fuel,distance,consumption_per_litre);

   }
public double cost_calculator(){
       total_cost_of_journey = (getDistance()*getConsumption_per_litre())/getCost_of_fuel();
       return total_cost_of_journey;
}


























   /* private int id;
    private String name;

    //provide a constructor for the student class
    public Student(int identifier, String ss){
        this.id = identifier;
        this.name = ss;
    }


    public int calculate(int m, int n) {
        return (m+n);
    }

    public String show(String src){
        return src;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}
