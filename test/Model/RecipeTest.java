package Model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class RecipeTest {
    private Recipe recipe;
    //escenario en el  que hay una recipe sin ingedientes
    @Test
    public void setupStage1(){
        recipe = new Recipe();
        recipe.addRecipe(new Ingredient(null, 0));
        assertNull(recipe.getLast().getName());

    }
   @Test
    public void setupStage2(){
        recipe = new Recipe();
        recipe.addRecipe(new Ingredient("Cebolla", 315));
        recipe.addRecipe(new Ingredient("Ajo", 58));
        recipe.addRecipe(new Ingredient("Arroz", 520));
    }
    @Test
    public void addNewIngredientTest(){
        recipe = new Recipe();
        recipe.addRecipe(new Ingredient("Sal", 12));
        //Assert
        assertEquals(recipe.getSize(), 1);
        assertEquals(recipe.getLast().getWeight(), 12);
    }

    @Test
    public void addNewIngredientTest2(){
        setupStage2();
        recipe.addRecipe(new Ingredient("Pimienta", 6));
        //Assert
        assertEquals(recipe.getSize(), 4);
        assertEquals(recipe.getLast().getWeight(), 6);
    }

    @Test
    public void addWeightToIngredientTest(){
        setupStage2();
        Ingredient ingredientTemp = recipe.searchIngredient("Ajo");
        ingredientTemp.addWeight(21);
        assertEquals(ingredientTemp.getWeight(), 79);
    }

    @Test
    public void removeIngredientTest(){
        setupStage2();
        Ingredient ingredientTemp = recipe.searchIngredient("Ajo");
        ingredientTemp.setName(null);
        ingredientTemp.setWeight(0);
        assertEquals(ingredientTemp.getName(), null);

    }
}
