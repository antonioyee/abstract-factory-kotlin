package `factory-pizzas`

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 19/08/17.
 */

interface PizzaIngredientFactory {

	fun createDough() : Dough

	fun createSauce() : Sauce

	fun createCheese() : Cheese

	fun createVeggies() : Veggies

	fun createPepperoni() : Pepperoni

	fun createClam() : Clams

}