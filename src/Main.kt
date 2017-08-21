import pizzas.Pizza
import store.ChicagoPizzaStore
import store.NYPizzaStore
import store.PizzaStore

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 19/08/17.
 */

fun main(args: Array<String>) {
	val nyStore: PizzaStore = NYPizzaStore()
	val chicagoStore: PizzaStore = ChicagoPizzaStore()

	var pizza: Pizza? = nyStore.orderPizza("cheese")
	println("Ethan ordered a ${pizza?.name}")
	println("\n")

	pizza = chicagoStore.orderPizza("cheese")
	println("Joel ordered a ${pizza?.name}")
	println("\n")

	pizza = nyStore.orderPizza("clam")
	println("Ethan ordered a ${pizza?.name}")
	println("\n")

	pizza = chicagoStore.orderPizza("clam")
	println("Joel ordered a ${pizza?.name}")
	println("\n")

	pizza = nyStore.orderPizza("pepperoni")
	println("Ethan ordered a ${pizza?.name}")
	println("\n")

	pizza = chicagoStore.orderPizza("pepperoni")
	println("Joel ordered a ${pizza?.name}")
	println("\n")

	pizza = nyStore.orderPizza("veggie")
	println("Ethan ordered a ${pizza?.name}")
	println("\n")

	pizza = chicagoStore.orderPizza("veggie")
	println("Joel ordered a ${pizza?.name}")
}