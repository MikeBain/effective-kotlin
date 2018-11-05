typealias Coffee = String // Never do this

fun isRealCoffee(name: Coffee): Boolean {
  fun nameSoundsReal(name: Coffee): Boolean {
    return name.toLowerCase() in arrayOf("flat white", "long black")
  }
  fun nameSoundsAmerican(swill: Coffee): Boolean {
    return swill.contains("Starbucks")
  }
  fun nameSoundsLikeFakeItalian(nome: Coffee) = true

  return nameSoundsReal(name) && !nameSoundsAmerican(name) && !nameSoundsLikeFakeItalian(name)
}

fun main(args: Array<Coffee>) {
  val name = "Starbucks Flat Whitiato"
  println("Is $name real coffee? ${if(isRealCoffee(name)) "yes!" else "no :-("}")
  TODO("Implement nameSoundsLikeFakeItalian")
  TODO("Turn local functions into local expression functions")
  TODO("Make isRealCoffee an extension method of Coffee 👹")
}
