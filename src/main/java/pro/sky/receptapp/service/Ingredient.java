
package pro.sky.receptapp.service;

import pro.sky.receptapp.dto.IngredientDTO;

public record Ingredient(String title, int number, String measure) {


    public void put(int id, Ingredient ingredient) {
        IngredientDTO.from(id, ingredient);
    }


    public Ingredient getIngredient(int id) {

        return IngredientService.ingredients.get(id);
    }
}
