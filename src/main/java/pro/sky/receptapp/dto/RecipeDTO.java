package pro.sky.receptapp.dto;

import pro.sky.receptapp.model.Recipe;
import pro.sky.receptapp.model.ingredient;

import java.util.List;

public record RecipeDTO(int id, String title, int cookingTime, List<ingredient> ingredients, List<String> steps) {

    public static RecipeDTO from(Integer id, Recipe recipe) {
        return new RecipeDTO(id, recipe.getTitle(), recipe.getCookingTime(), recipe.getIngredients(),
                recipe.getSteps());


    }
}