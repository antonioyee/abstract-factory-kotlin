package store

import factorypizzas.PizzaIngredientFactory
import factories.ChicagoPizzaIngredientFactory
import pizzas.Pizza
import pizzas.types.CheesePizza
import pizzas.types.ClamPizza
import pizzas.types.PepperoniPizza
import pizzas.types.VeggiePizza

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 20/08/17.
 */

class ChicagoPizzaStore : PizzaStore() {

	override fun createPizza(item: String): Pizza? {
		var pizza: Pizza? = null
		val ingredienteFactory: PizzaIngredientFactory = ChicagoPizzaIngredientFactory()

		when ( item ) {

			"cheese" -> {
				pizza = CheesePizza(ingredienteFactory)
				pizza?.name = "Chicago Style Cheese Pizza"
			}

			"veggie" -> {
				pizza = VeggiePizza(ingredienteFactory)
				pizza?.name = "Chicago Style Veggie Pizza"
			}

			"clam" -> {
				pizza = ClamPizza(ingredienteFactory)
				pizza?.name = "Chicago Style Clam Pizza"
			}

			"pepperoni" -> {
				pizza = PepperoniPizza(ingredienteFactory)
				pizza?.name = "Chicago Style Pepperoni Pizza"
			}

		}

		return pizza
	}

}