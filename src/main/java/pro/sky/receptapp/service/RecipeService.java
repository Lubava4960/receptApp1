package pro.sky.receptapp.service;

import org.springframework.stereotype.Service;
import pro.sky.receptapp.dto.IngredientDTO;
import pro.sky.receptapp.dto.RecipeDTO;
import pro.sky.receptapp.exception.RecipeNotFoundException;
import pro.sky.receptapp.exception.ingredientNotFoundException;
import pro.sky.receptapp.model.Recipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


       @Service
       public class RecipeService {

       private int idCounter = 0;
       private static final Map<Integer, Recipe> recipes = new HashMap<>();



        public RecipeDTO addRecipe(Recipe recipe){
        int id = idCounter++;
        recipes.put(id, recipe);
        return RecipeDTO.from(id,recipe);
       }



        public List<RecipeDTO> getAllRecipes() {
            List<RecipeDTO> result = new ArrayList<>();
            for(Map.Entry<Integer,Recipe> entry:recipes.entrySet()){
                result.add(RecipeDTO.from(entry.getKey(),entry.getValue()));
            }
            return result;
        }

        public static RecipeDTO updateRecipe(int id, Recipe recipe) {
            Recipe existingRecipe = recipes.get(id);
            if(existingRecipe==null){
            throw new RecipeNotFoundException();
            }
            recipes.put(id, recipe);
            return RecipeDTO.from(id, recipe);
        }

        public RecipeDTO deleteDyId(int id ) {
            Recipe existingRecipe=recipes.remove(id);
            if (existingRecipe==null){
                throw new RecipeNotFoundException();
            }
            return RecipeDTO.from(id, existingRecipe);
        }

           public RecipeDTO getRecipe(int id) {
            Recipe recipe = recipes.get(id);
            if (recipe!= null){
                return RecipeDTO.from(id, recipe);
            }
               return null;
           }
       }

