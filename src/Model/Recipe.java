package Model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Recipe {
    public LinkedList<Ingredient> ingredients;

    public Recipe() {
        ingredients = new LinkedList<>();
    }

    public void addRecipe(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public int getSize() {
        return ingredients.size();
    }

    public Ingredient getLast() {
        return ingredients.getLast();
    }

    public Ingredient searchIngredient(String IngredientName){
        for(int i=0; i<ingredients.size(); i++){
            if(ingredients.get(i).getName().equals(IngredientName)){
                return ingredients.get(i);
            }
        }
        return searchIngredient(IngredientName);
    }

    public void removeIngredient(String IngredientName){
        for(int i=0; i<ingredients.size(); i++){
            if(ingredients.get(i).getName().equals(IngredientName)){
                ingredients.set(0, null);
            }
        }
    }
}
