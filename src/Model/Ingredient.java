package Model;

import exceptions.NegativeWeightException;

public class Ingredient {
    private String name;
    private double weight;

    public Ingredient(String name, double weight) {
        try {
            this.name = name;
            this.weight = weight;
        }catch (NumberFormatException ex){
            throw new NegativeWeightException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void addWeight(double newWeight) throws NegativeWeightException{
        if(newWeight < 0){
           throw new NegativeWeightException();
        }else{
            this.weight = weight + newWeight;
        }

    }

    public void removeWeight(double newWeight) throws NegativeWeightException{
        if(newWeight < 0){
            throw new  NegativeWeightException();
        }else{
            this.weight = weight - newWeight;
        }
    }
}
