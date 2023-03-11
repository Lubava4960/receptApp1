package pro.sky.receptapp.service.controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.receptapp.dto.IngredientDTO;
import pro.sky.receptapp.dto.RecipeDTO;
import pro.sky.receptapp.service.Ingredient;
import pro.sky.receptapp.service.IngredientService;

import java.util.HashMap;
import java.util.List;


@RestController

@RequestMapping("/ingredient")

public class IngredientController {
    private final IngredientService ingredientService;

    private HashMap<Object, Object> ingredients;


    public IngredientController(IngredientService ingredientService) {

        this.ingredientService = ingredientService;
    }




    @GetMapping("/{id}")
    public IngredientDTO getIngredient(@PathVariable("id") int id){

        return ingredientService.getIngredient(id);
    }

    @PostMapping
    public IngredientDTO addIngredient(@RequestBody Ingredient ingredient){
        return ingredientService.addIngredient(ingredient);
    }

    @DeleteMapping("/{id}")
    public IngredientDTO deleteRecipe(@PathVariable("id") int id){
        return ingredientService.deleteById(id);   //метод удаления ingredients
    }


    @GetMapping
    public List<IngredientDTO> getIngredients(){
        return ingredientService.getAllIngredients();//Метод получения всех ingredients
    }


}
