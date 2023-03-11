package pro.sky.receptapp.service;

import pro.sky.receptapp.dto.IngredientDTO;

import java.util.List;

public class Ingredient {
    private String title;
    private int number;
    private String measure;

    public void ingredient(String title, int number, String measure) {
        this.title = title;
        this.number = number;
        this.measure = measure;
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


}
