class Name(first: String, last: String)

data class Person(val name: Name, val age: Int, val societalPosition: SocietialPosition)
fun Person.guillotinePriority() = societalPosition.ordinal

enum class SocietialPosition {
  RULING,
  BOUGIE,
  PETIT_BOUGIE,
  SOFTWARE_ENGINEERS,
  PROLE,
  ROYALTY,
}

fun main(args: Array<String>) {
  val james = Person(Name("James", "Fraser"), 38, SocietialPosition.BOUGIE)

  // Destructuring James

  val (name, age, position) = james
  println("""
    [MELBOURNE REVOLUTIONARY GUARD, FORM 27b stroke 6]

    Name: $name ($age years of age)
    Crime Against the State: Being a $position
  """.trimIndent())

  // Make a copy of James with some differences
  james.copy(societalPosition = SocietialPosition.BOUGIE)

  TODO("Make name a data class")
  TODO("Make societalPosition parameter optional")
  TODO("use of named parameters for instantiating Person")
  TODO("Make Name print correctly as 'first last'")
}
