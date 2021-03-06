package pizzas.types

import factorypizzas.PizzaIngredientFactory
import pizzas.Pizza

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 20/08/17.
 */

class PepperoniPizza(ingredientFactory: PizzaIngredientFactory) : Pizza() {

	internal var ingredientFactory: PizzaIngredientFactory

	init {
		this.ingredientFactory = ingredientFactory
	}

	override fun prepare() {
		println("Preparing $name")

		dough = ingredientFactory.createDough()
		sauce = ingredientFactory.createSauce()
		cheese = ingredientFactory.createCheese()
		veggies = ingredientFactory.createVeggies()
		pepperoni = ingredientFactory.createPepperoni()
	}

}