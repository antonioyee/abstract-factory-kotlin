package factories

import factorypizzas.*
import products.cheese.ReggianoCheese
import products.clams.FreshClams
import products.dough.ThickCrustDough
import products.pepperoni.SlicedPepperoni
import products.sauce.MarinaraSauce
import products.veggies.Garlic
import products.veggies.Mushroom
import products.veggies.Onion
import products.veggies.RedPepper

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 19/08/17.
 */

class NYPizzaIngredientFactory : PizzaIngredientFactory {

	override fun createDough(): Dough {
		return ThickCrustDough()
	}

	override fun createSauce(): Sauce {
		return MarinaraSauce()
	}

	override fun createCheese(): Cheese {
		return ReggianoCheese()
	}

	override fun createVeggies(): Array<Veggies> {
		val veggies = arrayOf<Veggies>(Garlic(), Onion(), Mushroom(), RedPepper() )
		return veggies
	}

	override fun createPepperoni(): Pepperoni {
		return SlicedPepperoni()
	}

	override fun createClam(): Clams {
		return FreshClams()
	}

}