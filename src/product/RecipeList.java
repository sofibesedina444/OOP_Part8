package product;

import product.Recipe;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RecipeList {
    Map<Integer, Recipe> recipes = new HashMap<>();

    public void addRecipe(Integer amount, Recipe recipe) {
        if (recipes.containsKey(recipe)) {
            throw new RuntimeException("Этот рецепт уже добавлен в список");
        } else {
            recipes.put(amount, recipe);
        }
    }

    public void removeRecipe(Recipe recipe) {
        recipes.remove(recipe);
    }

    @Override
    public String toString() {
        return "Список рецептов: " + "\n" + recipes;
    }
}
