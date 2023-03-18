package pro.sky.receptapp.service;

import org.springframework.stereotype.Service;
import pro.sky.receptapp.dto.IngredientDTO;
import pro.sky.receptapp.exception.ingredientNotFoundException;
import pro.sky.receptapp.model.Recipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IngredientService {

    private int idCounter = 0;
    private static final Map<Integer, Ingredient> ingredients = new HashMap<>();

    public static IngredientDTO updateIngredient(int id, Ingredient ingredient) {
       IngredientDTO existingIngredient = ingredient.getIngredient(id);
        if(existingIngredient==null){
            throw new IngredientNotFoundException();
        }
        ingredient.put(id, ingredient);
        return IngredientDTO.from(id, ingredient);
    }


    public IngredientDTO addIngredient(Ingredient ingredient){
        int id = idCounter++;
        ingredient.put(id, ingredient);
        return IngredientDTO.from(id, ingredient);
    }

    public static IngredientDTO getIngredient(int id){
        Ingredient ingredient = ingredients.get(id);
        if (ingredient != null){
            return IngredientDTO.from(id, ingredient);
        }
        return null;
    }

    public IngredientDTO deleteById(int id) {
        Ingredient existingIngredient=ingredients.remove(id);
        if (existingIngredient==null){
            throw new ingredientNotFoundException();
        }
        return IngredientDTO.from(id, existingIngredient);
    }


    public List<IngredientDTO> getAllIngredients() {
        List<IngredientDTO> result = new ArrayList<>();
        for (Map.Entry<Integer,Ingredient>entry:ingredients.entrySet()){
            result.add(IngredientDTO.from(entry.getKey(), entry.getValue()));
        }
        return result;
    }
}
