typealias Coffee = String // Never do this

fun isRealCoffee(name: Coffee): Boolean {
  fun nameSoundsReal(s: Coffee): Boolean {
    return s.toLowerCase() in arrayOf("flat white", "long black")
  }
  fun nameSoundsAmerican(s: Coffee): Boolean {
    return s.contains("Starbucks")
  }
  fun nameSoundsLikeFakeItalian(s: Coffee) = true

  return nameSoundsReal(name) && !nameSoundsAmerican(name) && !nameSoundsLikeFakeItalian(name)
}

fun main(args: Array<Coffee>) {
  val name = "Starbucks Flat Whitiato"
  println("Is $name real coffee? ${if(isRealCoffee(name)) "yes!" else "no :-("}")
  TODO("Implement nameSoundsLikeFakeItalian")
  TODO("Turn subfunctions into expression functions")
  TODO("Make isRealCoffee an extension method of Coffee 👹")
}
