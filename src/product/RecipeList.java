package product;

import product.Recipe;

import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    Set<Recipe> recipes = new HashSet<>();

    public void addRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new RuntimeException("Этот рецепт уже добавлен в список");
        } else {
            recipes.add(recipe);
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
