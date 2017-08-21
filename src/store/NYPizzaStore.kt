package store

import factorypizzas.PizzaIngredientFactory
import factories.NYPizzaIngredientFactory
import pizzas.Pizza
import pizzas.types.CheesePizza
import pizzas.types.ClamPizza
import pizzas.types.PepperoniPizza
import pizzas.types.VeggiePizza

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 20/08/17.
 */

class NYPizzaStore : PizzaStore() {

	override fun createPizza(item: String): Pizza? {
		var pizza: Pizza? = null
		val ingredienteFactory: PizzaIngredientFactory = NYPizzaIngredientFactory()

		when ( item ) {

			"cheese" -> {
				pizza = CheesePizza(ingredienteFactory)
				pizza.name = "New York Style Cheese Pizza"
			}

			"veggie" -> {
				pizza = VeggiePizza(ingredienteFactory)
				pizza.name = "New York Style Veggie Pizza"
			}

			"clam" -> {
				pizza = ClamPizza(ingredienteFactory)
				pizza.name = "New York Style Clam Pizza"
			}

			"pepperoni" -> {
				pizza = PepperoniPizza(ingredienteFactory)
				pizza.name = "New York Style Pepperoni Pizza"
			}

		}

		return pizza
	}

}