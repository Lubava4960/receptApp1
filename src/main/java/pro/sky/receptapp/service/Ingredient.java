package pro.sky.receptapp.service;

import pro.sky.receptapp.dto.IngredientDTO;
import pro.sky.receptapp.model.Recipe;
import pro.sky.receptapp.model.ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ingredient {

    public int getCookingTime;
    private String title;
    private int number;
    private String measure;
    private Recipe ingredients;
    private List<String> steps;

    public void ingredient(String title, int number, String measure) {
        this.title = title;
        this.number = number;
        this.measure = measure;
    }

    public int getGetCookingTime() {
        return getCookingTime;
    }

    public Recipe getIngredients() {
        return ingredients;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public void put(int id, Ingredient ingredient) {
        IngredientDTO.from(id, ingredient);
    }


    public Recipe getIngredient(int id) {
        return ingredients;
    }
    

    public void setIngredients(List<ingredient> ingredients) {
        this.ingredients = (Recipe) ingredients;
    }
    public void setSteps(List<String> steps) {
        this.steps = steps;
    }


    public Object getSteps() {
        return steps;
    }
}
