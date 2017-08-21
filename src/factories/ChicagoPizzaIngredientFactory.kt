package factories

import factorypizzas.*
import products.cheese.MozzarellaCheese
import products.clams.FrozenClams
import products.dough.ThickCrustDough
import products.pepperoni.SlicedPepperoni
import products.sauce.PlumTomatoSauce
import products.veggies.BlackOlives
import products.veggies.Eggplant
import products.veggies.Spinach

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 19/08/17.
 */

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {

	override fun createDough(): Dough {
		return ThickCrustDough()
	}

	override fun createSauce(): Sauce {
		return PlumTomatoSauce()
	}

	override fun createCheese(): Cheese {
		return MozzarellaCheese()
	}

	override fun createVeggies(): Array<Veggies> {
		val veggies = arrayOf<Veggies>(BlackOlives(), Spinach(), Eggplant())

		return veggies
	}

	override fun createPepperoni(): Pepperoni {
		return SlicedPepperoni()
	}

	override fun createClam(): Clams {
		return FrozenClams()
	}

}