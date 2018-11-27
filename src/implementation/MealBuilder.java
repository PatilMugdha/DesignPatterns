package implementation;

import classes.Meal;
import implementation.ChickenBurger;
import implementation.Coke;
import implementation.Pepsi;
import implementation.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal vegMeal = new Meal();
		vegMeal.addItem(new VegBurger());
		vegMeal.addItem(new Coke());
		return vegMeal;
	}

	public Meal prepareNonVegMeal() {
		Meal nonVegMeal = new Meal();
		nonVegMeal.addItem(new ChickenBurger());
		nonVegMeal.addItem(new Pepsi());
		return nonVegMeal;
	}

}
