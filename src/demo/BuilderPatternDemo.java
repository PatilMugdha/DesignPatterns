package demo;

import classes.Meal;
import implementation.MealBuilder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg meal..with cost - " + vegMeal.getCost());
		vegMeal.showItems();

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non - Veg meal..with cost - " + nonVegMeal.getCost());
		nonVegMeal.showItems();

	}
}
