package store

import pizzas.Pizza

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 20/08/17.
 */

abstract class PizzaStore {

	abstract fun createPizza(item: String) : Pizza?

	fun orderPizza(type: String): Pizza? {
		val pizza: Pizza? = createPizza(type)

		println("--- Making a ${pizza?.name} ---")

		pizza?.prepare()
		pizza?.bake()
		pizza?.cut()
		pizza?.box()

		return pizza
	}

}