package com.example.classworkwk5;

public class Journey {

    private double cost_of_fuel, distance, consumption_per_litre, file;

public Journey(double cost_of_fuel, double distance, double consumption_per_litre){
    this.cost_of_fuel = cost_of_fuel;
    this.distance = distance;
    this.consumption_per_litre = consumption_per_litre;

}

    public double getCost_of_fuel() {
        return cost_of_fuel;
    }

    public void setCost_of_fuel(double cost_of_fuel) {
        this.cost_of_fuel = cost_of_fuel;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getConsumption_per_litre() {
        return consumption_per_litre;
    }

    public void setConsumption_per_litre(double consumption_per_litre) {
        this.consumption_per_litre = consumption_per_litre;
    }
}
