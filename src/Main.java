import passport.Passport;
import passport.PassportList;
import product.Product;
import product.ProductList;
import product.Recipe;
import product.RecipeList;

import java.time.LocalDate;
import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Задания с продуктами и рецептами

        Product bananas = new Product("Бананы", 120, 1.0);
        Product buckwheat = new Product("Гречневая крупа", 100, 0.8);
        Product yogurt = new Product("Йогурт", 75, 0.45);
        Product oranges = new Product("Апельсины", 150, 1.0);
        Product cheese = new Product("Сыр", 800, 1.0);
        Product cheese1 = new Product("Сыр творожный", 350, 0.5);

        ProductList list = new ProductList();
        list.addProduct(bananas, 6);
        list.addProduct(buckwheat, 1);
        list.addProduct(yogurt, 2);
        list.addProduct(oranges, 6);
        list.addProduct(cheese, 1);
        list.addProduct(cheese1, 1);

        System.out.println(list);

        list.removeProduct(cheese1);

        System.out.println(list);

        Recipe fruitSalad = new Recipe("Фруктовый салат");
        fruitSalad.addProductRecipe(bananas, 6);
        fruitSalad.addProductRecipe(oranges, 6);
        fruitSalad.addProductRecipe(yogurt, 2);

        Recipe cheeseFondue = new Recipe("Сырное фондю");
        cheeseFondue.addProductRecipe(bananas, 6);
        cheeseFondue.addProductRecipe(cheese, 1);

        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(1, fruitSalad);
        recipeList.addRecipe(2, cheeseFondue);

        System.out.println(recipeList);
        System.out.println();

        //Множество целых чисел

        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();

        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1001));
        }
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(numbers);

        //Таблица умножения

        List<Example> examples = new ArrayList<>(15);
        for (int x = 2; x <= 9; x++) {
            for (int y = x; y <= 9; y++) {
                examples.add(new Example(x, y));
            }
        }

        Set<Example> newExamples = new LinkedHashSet<>(examples);
        System.out.println(newExamples);

        //Паспортные данные

        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("0651984214", "Иванов", "Иван", "Иванович",
                LocalDate.of(1992, 8, 24)));
        passports.add(new Passport("1302896722", "Петрова", "Оксана", "Леонидовна",
                LocalDate.of(1975, 3, 15)));
        passports.add(new Passport("0919455637", "Сидоров", "Константин", null,
                LocalDate.of(1989, 9, 28)));

        PassportList passportList = new PassportList(passports);
        System.out.println(passportList);
    }


}
