package pizzas

import factorypizzas.*

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 19/08/17.
 */

abstract class Pizza {

	lateinit var name: String
	lateinit var dough: Dough
	lateinit var sauce: Sauce
	lateinit var veggies:Array<Veggies>
	lateinit var cheese: Cheese
	lateinit var pepperoni: Pepperoni
	lateinit var clams: Clams

	init {
		name = ""
	}

	abstract fun prepare()

	fun bake() {
		println("Bake for 25 minutes at 350")
	}

	fun cut() {
		println("Cutting the pizza into diagonal slices")
	}

	fun box() {
		println("Place pizza in official PizzaStore box")
	}

	override fun toString(): String {
		val result: StringBuffer = StringBuffer()

		result.append("----${name}-----\n")

		dough?.let {
			result.append("${dough}\n")
		}

		sauce?.let {
			result.append("${sauce}\n")
		}

		cheese?.let {
			result.append("${cheese}\n")
		}

		veggies?.let {
			for ( x in 0..veggies.size - 1 ) {
				result.append( veggies.get(x) )

				if ( x < veggies.size - 1 ) {
					result.append(", ")
				}
			}
		}

		clams?.let {
			result.append("${clams}\n")
		}

		pepperoni?.let {
			result.append("${pepperoni}\n")
		}

		return result.toString()
	}

}