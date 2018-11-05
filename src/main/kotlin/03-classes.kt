// Everything doesn't needs to be in a class anymore
val foo = "Bar"

// * make cheeseOpinion optional
data class Person(val name: Name, val age: Int, val cheeseOpinion: CheeseOpinion)

// * make me a data class
class Name(first: String, last: String)

// Classes are cheap, use them

enum class CheeseOpinion {
  HATES,
  LOATHES,
  LOVES,
  ADORES
}

fun main(args: Array<String>) {
  println("foo = $foo")

  // * make use of named parameters
  val jimmy = Person(Name("Slipping", "Jimmy"), 29, CheeseOpinion.ADORES)
  println("Jimmy = $jimmy")

  // Lets play with componentN() from the data class Person
  val (name, age, cheeseOpinion) = jimmy
  // * print the Jimmy's opinion on cheese

  // * make a copy of jimmy who loathes cheese
}
