package Model;

import exceptions.NegativeWeightException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {
    private Ingredient ingredient;
    public void setupStage1(){
         ingredient = new Ingredient("Tomate", 245);
    }
    @Test
    public void addWeightTest(){
        //Arrage
        setupStage1();
        //Add
        ingredient.addWeight(54);
        //assert
        assertEquals(ingredient.getName(), "Tomate");
        assertEquals(ingredient.getWeight(), 299);
    }
    @Test
    public void notAddWeightTest(){
        //Arrage
        setupStage1();
        //Add

        //assert
        assertThrows(NegativeWeightException.class, ()->{
            ingredient.addWeight(-100);;
        });
    }
    @Test
    public void removeWeightTest(){
        //Arrage
        setupStage1();
        //Add
        ingredient.removeWeight(45);
        //assert
        assertEquals(ingredient.getName(), "Tomate");
        assertEquals(ingredient.getWeight(), 200);
    }



}
