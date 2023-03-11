package pro.sky.receptapp.service.controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.receptapp.dto.RecipeDTO;
import pro.sky.receptapp.model.Recipe;
import pro.sky.receptapp.service.RecipeService;

import java.util.List;

@RestController

   @RequestMapping("/recipe")
   public class RecipeController {


   private final RecipeService recipeService;

   public RecipeController(RecipeService recipeService){

       this.recipeService = recipeService;
   }

   @GetMapping
   public List<RecipeDTO>getRecipes(){

       return recipeService.getAllRecipes();//Метод получения всех рецептов
   }
   @GetMapping ("/{id}")
      public RecipeDTO getRecipe(@PathVariable("id")int id){

       return recipeService.getRecipe(id);
}
     @PostMapping
      public RecipeDTO addRecipe(@RequestBody Recipe recipe){
        return recipeService.addRecipe(recipe);
     }


      @PutMapping("/{id}")
      public   RecipeDTO editRecipe(@PathVariable("id") int id,@RequestBody Recipe recipe){
       return RecipeService.updateRecipe(id, recipe);//метод редактирования рецептов
      }
      @DeleteMapping("/{id}")
      public  RecipeDTO deleteRecipe(@PathVariable("id") int id){
          return recipeService.deleteDyId(id);   //метод удаления рецептов
      }

}
