package pro.sky.receptapp.dto;

import pro.sky.receptapp.model.Recipe;
import pro.sky.receptapp.model.ingredient;

import java.util.List;

public class RecipeDTO {
    private final int id;
    private final String title;
    private final int cookingTime;
    private final List<ingredient> ingredients;
    private final List<String> steps;

    public RecipeDTO(int id, String title, int cookingTime, List<ingredient> ingredients, List<String> steps) {
        this.id = id;
        this.title = title;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public List<ingredient> getIngredients() {
        return ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }
    public static RecipeDTO from(int id, Recipe recipe){
        return new RecipeDTO(id, recipe.getTitle(), recipe.getCookingTime(), recipe.getIngredients(),
                recipe.getSteps());
    }


}